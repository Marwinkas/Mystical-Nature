package net.marwinka.mysticalcrops.client.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.marwinka.mysticalcrops.screenhandler.BotanicalHandler;
import net.marwinka.mysticalcrops.util.GuiUtil;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;

import java.awt.*;

public class BotanicalScreen extends HandledScreen<BotanicalHandler> {
    private static final Identifier TEXTURE = new ModIdentifier("textures/gui/botanical_gui.png");
    public static final int CUT_LEFT = 79;
    public static final int CUT_TOP = 43;

    public BotanicalScreen(BotanicalHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundWidth = 176;
        this.backgroundHeight = 184;
        this.playerInventoryTitleY = this.backgroundHeight - 101;
    }
    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        DrawableHelper.drawTexture(matrices, this.x, this.y, 0, 0, this.backgroundWidth, this.backgroundHeight, this.backgroundWidth, this.backgroundHeight);

        if(handler.isCrafting()) {
            GuiUtil.drawCut(matrices, this.x + CUT_LEFT, this.y + CUT_TOP, (short)handler.getProgress(),(short)200);
        }
    }
    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);

        if (GuiUtil.isHovering(this.getCutBounds(), mouseX, mouseY)) {
            this.renderTooltip(matrices, new TranslatableText("gauge.mysticalcrops.cut", handler.getProgress(), 200), mouseX, mouseY);
        }
    }
    public Rectangle getCutBounds() {
        return GuiUtil.getCutBounds(this.x + CUT_LEFT, this.y + CUT_TOP);
    }
    @Override
    protected void drawForeground(MatrixStack matrices, int mouseX, int mouseY) {
        this.textRenderer.draw(matrices, this.title, (float) this.titleX + 45, (float) this.titleY - 15, 4210752);
    }
}