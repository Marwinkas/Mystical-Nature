package net.marwinka.mysticalcrops.compat.rei;


import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.marwinka.mysticalcrops.compat.rei.ritual_table.*;
import net.marwinka.mysticalcrops.init.Blocks;
import net.marwinka.mysticalcrops.init.Items;
import net.marwinka.mysticalcrops.recipe.*;

@Environment(EnvType.CLIENT)
public class ReiPlugin implements REIClientPlugin {

    @SuppressWarnings("removal")
    @Override
    public void registerCategories(CategoryRegistry registry) {

        registry.add(new BotanicalTableCategory());
        registry.addWorkstations(REICategories.BOTANICAL_TABLE_CATEGORY, EntryStacks.of(Blocks.BOTANICAL_TABLE));
        registry.add(new RitualTableCategory());
        registry.addWorkstations(REICategories.BOTANICAL_RITUAL_TABLE_CATEGORY, EntryStacks.of(Blocks.BOTANICAL_RITUAL_TABLE));
        registry.add(new InfusionTableCategory());
        registry.addWorkstations(REICategories.INFUSION_TABLE_CATEGORY, EntryStacks.of(Blocks.INFUSION_TABLE));
        registry.add(new seedsfruitCategory());
        registry.addWorkstations(REICategories.SEEDS_FRUIT, EntryStacks.of(Items.DIAMOND_SEEDS));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(BotanicalTableRecipe.class, BotanicalTableRecipe.Type.INSTANCE, BotanicalTableDisplay::new);
        registry.registerRecipeFiller(RitualTableRecipe.class, RitualTableRecipe.Type.GF, RitualTableDisplay::new);
        registry.registerRecipeFiller(InfusionTableRecipe.class, InfusionTableRecipe.Type.INFUSION, InfusionTableDisplay::new);
        registry.registerRecipeFiller(seedsfruit.class, seedsfruit.Type.FRUITS, seedsfruitDisplay::new);
    }
}