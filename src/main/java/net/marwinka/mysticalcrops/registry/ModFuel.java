package net.marwinka.mysticalcrops.registry;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuel {
    public static void register() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COMMON_COAL, 3200);
        registry.add(ModItems.UNCOMMON_COAL, 6400);
        registry.add(ModItems.WONDERFUL_COAL, 11200);
        registry.add(ModItems.EXCELLENT_COAL, 16000);
        registry.add(ModItems.PERFECT_COAL, 24000);
        registry.add(ModBlocks.COMMON_COAL_BLOCK, 32000);
        registry.add(ModBlocks.UNCOMMON_COAL_BLOCK, 64000);
        registry.add(ModBlocks.WONDERFUL_COAL_BLOCK, 112000);
        registry.add(ModBlocks.EXCELLENT_COAL_BLOCK, 160000);
        registry.add(ModBlocks.PERFECT_COAL_BLOCK, 240000);

    }
}
