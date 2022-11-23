package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.marwinka.mysticalcrops.MysticalCrops;

public class Fuels {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        MysticalCrops.LOGGER.info("Registering Fuels for " + MysticalCrops.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Items.BASIC_COAL, 3200);
        registry.add(Items.ADVANCE_COAL, 11200);
        registry.add(Items.UNCOMMON_COAL, 6400);
        registry.add(Items.ULTRA_COAL, 16000);
        registry.add(Items.ULTIMATE_COAL, 24000);
        registry.add(Blocks.BASIC_COAL_BLOCK, 32000);
        registry.add(Blocks.ADVANCE_COAL_BLOCK, 112000);
        registry.add(Blocks.UNCOMMON_COAL_BLOCK, 64000);
        registry.add(Blocks.ULTRA_COAL_BLOCK, 160000);
        registry.add(Blocks.ULTIMATE_COAL_BLOCK, 240000);
    }
}
