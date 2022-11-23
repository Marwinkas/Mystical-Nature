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
import net.marwinka.mysticalcrops.init.Items;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class seedsfruitCategory implements DisplayCategory<seedsfruitDisplay> {

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(Items.DIAMOND_SEEDS.asItem());
    }

    @Override
    public Text getTitle() {
        return Text.literal("Get Fruit");
    }

    @Override
    public int getDisplayWidth(seedsfruitDisplay display) {
        return 144;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }

    @Override
    public CategoryIdentifier<? extends seedsfruitDisplay> getCategoryIdentifier() {
        return REICategories.SEEDS_FRUIT;
    }

    @Override
    public List<Widget> setupDisplay(seedsfruitDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX(), bounds.getCenterY());

        List<Widget> widgets = new ArrayList<>();
        List<EntryIngredient> inputs = display.getInputEntries();
        List<EntryIngredient> outputs = display.getOutputEntries();

        widgets.add(Widgets.createRecipeBase(bounds));

        widgets.add(Widgets.createSlot(new Point(startPoint.x - 33, startPoint.y)).entries(inputs.get(0)).markInput());
        widgets.add(Widgets.createArrow(new Point(startPoint.x, startPoint.y )).animationDurationTicks(50));

        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 33, startPoint.y)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 33, startPoint.y )).entries(outputs.get(0)).disableBackground().markOutput());


        return widgets;
    }
}