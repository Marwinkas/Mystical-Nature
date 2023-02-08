package net.marwinka.mysticalcrops.util;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.transfer.v1.client.fluid.FluidVariantRendering;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.*;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Matrix4f;

import java.awt.*;

@Environment(EnvType.CLIENT)
public class GuiUtil {
    public static final int CUT_WIDTH = 15;
    public static final int CUT_HEIGHT = 14;
    public static final int INFUSE_WIDTH = 74;
    public static final int INFUSE_HEIGHT = 74;
    public static final int TRANSFORM_WIDTH = 74;
    public static final int TRANSFORM_HEIGHT = 73;
    public static final Identifier CUT_TEXTURE = new ModIdentifier("textures/gui/cut.png");
    public static final Identifier INFUSE_TEXTURE = new ModIdentifier("textures/gui/infuse.png");
    public static final Identifier TRANSFORM_TEXTURE = new ModIdentifier("textures/gui/transform.png");

    public static boolean isHovering(Rectangle bounds, double x, double y) {
        double left = bounds.getX();
        double right = left + bounds.getWidth();
        double top = bounds.getY();
        double bottom = top + bounds.getHeight();
        return left <= x && x < right && top <= y && y < bottom;
    }
    public static Rectangle getCutBounds(int x, int y) {
        return new Rectangle(x, y, CUT_WIDTH, CUT_HEIGHT);
    }
    public static Rectangle getInfuseBounds(int x, int y) {
        return new Rectangle(x, y, INFUSE_WIDTH, INFUSE_HEIGHT);
    }
    public static Rectangle getTransformBounds(int x, int y) {
        return new Rectangle(x, y, TRANSFORM_WIDTH, TRANSFORM_HEIGHT);
    }
    public static void drawCut(MatrixStack matrixStack, int x, int y, short burnTime, short totalBurnTime) {
        double ratio = totalBurnTime > 0 ? createRatio(burnTime, totalBurnTime) : 0;
        drawHorizontal(matrixStack, x, y, CUT_WIDTH, CUT_HEIGHT, CUT_TEXTURE, ratio);
    }
    public static void drawInfuse(MatrixStack matrixStack, int x, int y, short burnTime, short totalBurnTime) {
        double ratio = totalBurnTime > 0 ? createRatio(burnTime, totalBurnTime) : 0;
        drawHorizontal(matrixStack, x, y, INFUSE_WIDTH, INFUSE_HEIGHT, INFUSE_TEXTURE, ratio);
    }
    public static void drawTransform(MatrixStack matrixStack, int x, int y, short burnTime, short totalBurnTime) {
        double ratio = totalBurnTime > 0 ? createRatio(burnTime, totalBurnTime) : 0;
        drawHorizontal(matrixStack, x, y, TRANSFORM_WIDTH, TRANSFORM_HEIGHT, TRANSFORM_TEXTURE, ratio);
    }
    public static void drawHorizontal(MatrixStack matrixStack, int x, int y, int width, int height, Identifier resource, double ratio) {
        int ratioWidth = (int) Math.ceil(width * ratio);

        RenderSystem.setShaderTexture(0, resource);
        DrawableHelper.drawTexture(matrixStack, x, y, 0, 0, ratioWidth, height, width, height);
    }
    public static double createRatio(short a, short b) {
        return (float) a / (float) b;
    }
}
