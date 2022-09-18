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
public class MystycalOreCategory implements DisplayCategory<BotanicalTableDisplay> {

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(Blocks.BOTANICAL_TABLE.asItem());
    }

    @Override
    public Text getTitle() {
        return Text.translatable(Blocks.BOTANICAL_TABLE.getTranslationKey());
    }

    @Override
    public int getDisplayWidth(BotanicalTableDisplay display) {
        return 144;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }

    @Override
    public CategoryIdentifier<? extends BotanicalTableDisplay> getCategoryIdentifier() {
        return REICategories.BOTANICAL_TABLE_CATEGORY;
    }

    @Override
    public List<Widget> setupDisplay(BotanicalTableDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX(), bounds.getCenterY());

        List<Widget> widgets = new ArrayList<>();
        List<EntryIngredient> inputs = display.getInputEntries();
        List<EntryIngredient> outputs = display.getOutputEntries();

        widgets.add(Widgets.createRecipeBase(bounds));
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 33, startPoint.y - 25)).entries(inputs.get(1)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x - 33, startPoint.y + 9)).entries(inputs.get(0)).markInput());
        widgets.add(Widgets.createArrow(new Point(startPoint.x, startPoint.y - 9)).animationDurationTicks(50));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 33, startPoint.y - 9)).entries(outputs.get(0)).markOutput());

        return widgets;
    }
}