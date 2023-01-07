package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.marwinka.mysticalcrops.MysticalCrops;

public class ModFuels {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        MysticalCrops.LOGGER.info("Registering Fuels for " + MysticalCrops.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBaseItems.BASIC_COAL, 3200);
        registry.add(ModBaseItems.UNCOMMON_COAL, 6400);
        registry.add(ModBaseItems.ADVANCE_COAL, 11200);
        registry.add(ModBaseItems.ULTRA_COAL, 16000);
        registry.add(ModBaseItems.ULTIMATE_COAL, 24000);
        registry.add(ModBlocks.BASIC_COAL_BLOCK, 32000);
        registry.add(ModBlocks.UNCOMMON_COAL_BLOCK, 64000);
        registry.add(ModBlocks.ADVANCE_COAL_BLOCK, 112000);
        registry.add(ModBlocks.ULTRA_COAL_BLOCK, 160000);
        registry.add(ModBlocks.ULTIMATE_COAL_BLOCK, 240000);
    }
}
