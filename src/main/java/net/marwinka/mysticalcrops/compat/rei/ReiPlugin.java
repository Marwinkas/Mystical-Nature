package net.marwinka.mysticalcrops.compat.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.marwinka.mysticalcrops.compat.rei.category.BotanicalCategory;
import net.marwinka.mysticalcrops.compat.rei.category.InfusionCategory;
import net.marwinka.mysticalcrops.compat.rei.category.RitualCategory;
import net.marwinka.mysticalcrops.compat.rei.display.*;
import net.marwinka.mysticalcrops.registry.ModBlocks;
import net.marwinka.mysticalcrops.recipe.*;
import net.marwinka.mysticalcrops.registry.ModRecipes;

@Environment(EnvType.CLIENT)
public class ReiPlugin implements REIClientPlugin {

    @SuppressWarnings("removal")
    @Override
    public void registerCategories(CategoryRegistry registry) {

        registry.add(new BotanicalCategory());
        registry.addWorkstations(REICategories.BOTANICAL_CATEGORY, EntryStacks.of(ModBlocks.BOTANICAL_TABLE));
        registry.add(new RitualCategory());
        registry.addWorkstations(REICategories.RITUAL_CATEGORY, EntryStacks.of(ModBlocks.RITUAL_TABLE));
        registry.add(new InfusionCategory());
        registry.addWorkstations(REICategories.INFUSION_CATEGORY, EntryStacks.of(ModBlocks.INFUSION_TABLE));
    }
    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(BotanicalRecipe.class, ModRecipes.BOTANICAL_RECIPE, BotanicalDisplay::new);
        registry.registerRecipeFiller(RitualRecipe.class, ModRecipes.RITUAL_RECIPE, RitualDisplay::new);
        registry.registerRecipeFiller(InfusionRecipe.class, ModRecipes.INFUSE_RECIPE, InfusionDisplay::new);
    }
}