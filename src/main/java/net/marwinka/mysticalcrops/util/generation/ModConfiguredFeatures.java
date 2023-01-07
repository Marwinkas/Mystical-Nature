package net.marwinka.mysticalcrops.util.generation;


import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.init.ModBlocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_ESSENCE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ESSENCE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ESSENCE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_ESSENCE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_ESSENCE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_ESSENCE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(net.minecraft.block.Blocks.END_STONE), ModBlocks.END_ESSENCE_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ESSENCE_ORE =
            ConfiguredFeatures.register("essence_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ESSENCE_ORES, 14));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_ESSENCE_ORE =
            ConfiguredFeatures.register("nether_essence_ore",Feature.ORE, new OreFeatureConfig(NETHER_ESSENCE_ORES, 14));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_ESSENCE_ORE =
            ConfiguredFeatures.register("end_essence_ore",Feature.ORE, new OreFeatureConfig(END_ESSENCE_ORES, 14));

    public static final List<OreFeatureConfig.Target> OVERWORLD_CRYSTAL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRYSTAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CRYSTAL_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_CRYSTAL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHER_CRYSTAL_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_CRYSTAL_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(net.minecraft.block.Blocks.END_STONE), ModBlocks.END_CRYSTAL_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYSTAL_ORE =
            ConfiguredFeatures.register("crystal_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_CRYSTAL_ORES, 14));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_CRYSTAL_ORE =
            ConfiguredFeatures.register("nether_crystal_ore",Feature.ORE, new OreFeatureConfig(NETHER_CRYSTAL_ORES, 14));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_CRYSTAL_ORE =
            ConfiguredFeatures.register("end_crystal_ore",Feature.ORE, new OreFeatureConfig(END_CRYSTAL_ORES, 14));


    public static void registerConfiguredFeatures() {
        MysticalCrops.LOGGER.debug("Registering the ModConfiguredFeatures for " + MysticalCrops.MOD_ID);
    }
}