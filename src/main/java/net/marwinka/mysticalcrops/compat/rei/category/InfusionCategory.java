package net.marwinka.mysticalcrops.compat.rei.category;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.marwinka.mysticalcrops.compat.rei.REICategories;
import net.marwinka.mysticalcrops.compat.rei.display.InfusionDisplay;
import net.marwinka.mysticalcrops.registry.ModBlocks;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class InfusionCategory implements DisplayCategory<InfusionDisplay> {
    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.INFUSION_TABLE.asItem());
    }
    @Override
    public Text getTitle() {
        return Text.translatable(ModBlocks.INFUSION_TABLE.getTranslationKey());
    }
    @Override
    public int getDisplayWidth(InfusionDisplay display) {
        return 176;
    }
    @Override
    public int getDisplayHeight() {
        return 102;
    }
    @Override
    public CategoryIdentifier<? extends InfusionDisplay> getCategoryIdentifier() {
        return REICategories.INFUSION_CATEGORY;
    }
    @Override
    public List<Widget> setupDisplay(InfusionDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX(), bounds.getCenterY());

        List<Widget> widgets = new ArrayList<>();
        List<EntryIngredient> inputs = display.getInputEntries();
        List<EntryIngredient> outputs = display.getOutputEntries();

        widgets.add(Widgets.createRecipeBase(bounds));

        widgets.add(Widgets.createSlot(new Point(startPoint.x - 79 , startPoint.y - 2)).entries(inputs.get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 39 , startPoint.y - 2)).entries(inputs.get(1)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 7 , startPoint.y - 34)).entries(inputs.get(2)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 7 , startPoint.y + 30)).entries(inputs.get(3)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 25 , startPoint.y - 2)).entries(inputs.get(4)).markInput());

        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x  -7, startPoint.y - 2)));
        Text ratioText = Text.translatable("rei.text.ad_astra.seconds", 100 / 20);
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 7, startPoint.y - 2)).entries(outputs.get(0)).disableBackground().markOutput());
        widgets.add(Widgets.createLabel(new Point(startPoint.x + 60, startPoint.y + 25), ratioText).centered().noShadow().color(0xFF404040, 0xFFBBBBBB));
        return widgets;
    }
}