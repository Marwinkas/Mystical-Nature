package net.marwinka.mysticalcrops.compat.rei.ritual_table;

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
import net.marwinka.mysticalcrops.init.Blocks;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class RitualTableCategory implements DisplayCategory<RitualTableDisplay> {

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(Blocks.BOTANICAL_RITUAL_TABLE.asItem());
    }

    @Override
    public Text getTitle() {
        return Text.translatable(Blocks.BOTANICAL_RITUAL_TABLE.getTranslationKey());
    }

    @Override
    public int getDisplayWidth(RitualTableDisplay display) {
        return 176;
    }

    @Override
    public int getDisplayHeight() {
        return 102;
    }

    @Override
    public CategoryIdentifier<? extends RitualTableDisplay> getCategoryIdentifier() {
        return REICategories.BOTANICAL_RITUAL_TABLE_CATEGORY;
    }

    @Override
    public List<Widget> setupDisplay(RitualTableDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX(), bounds.getCenterY());

        List<Widget> widgets = new ArrayList<>();
        List<EntryIngredient> inputs = display.getInputEntries();
        List<EntryIngredient> outputs = display.getOutputEntries();

        widgets.add(Widgets.createRecipeBase(bounds));

        widgets.add(Widgets.createSlot(new Point(startPoint.x - 80 , startPoint.y - 7)).entries(inputs.get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 53 , startPoint.y - 38)).entries(inputs.get(1)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 55 , startPoint.y - 7)).entries(inputs.get(2)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 53 , startPoint.y + 25)).entries(inputs.get(3)).markInput());

        widgets.add(Widgets.createSlot(new Point(startPoint.x - 23 , startPoint.y - 40)).entries(inputs.get(4)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 23 , startPoint.y - 7)).entries(inputs.get(5)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 23 , startPoint.y + 27)).entries(inputs.get(6)).markInput());

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 9 , startPoint.y - 38)).entries(inputs.get(7)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 11 , startPoint.y - 7)).entries(inputs.get(8)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 9 , startPoint.y + 25)).entries(inputs.get(9)).markInput());

        widgets.add(Widgets.createArrow(new Point(startPoint.x + 30, startPoint.y - 7)).animationDurationTicks(100));


        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 61, startPoint.y - 7)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 61, startPoint.y - 7)).entries(outputs.get(0)).disableBackground().markOutput());

        return widgets;
    }
}