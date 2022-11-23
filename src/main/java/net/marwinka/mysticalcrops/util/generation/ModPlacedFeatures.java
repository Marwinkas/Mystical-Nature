package net.marwinka.mysticalcrops.util.generation;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;
public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> ESSENCE_ORE_PLACED = PlacedFeatures.register("essence_ore_placed",
            ModConfiguredFeatures.ESSENCE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> NETHER_ESSENCE_ORE_PLACED = PlacedFeatures.register("nether_essence_ore_placed",
            ModConfiguredFeatures.NETHER_ESSENCE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> END_ESSENCE_ORE_PLACED = PlacedFeatures.register("end_essence_ore_placed",
            ModConfiguredFeatures.END_ESSENCE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> CRYSTAL_ORE_PLACED = PlacedFeatures.register("crystal_ore_placed",
            ModConfiguredFeatures.CRYSTAL_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> NETHER_CRYSTAL_ORE_PLACED = PlacedFeatures.register("nether_crystal_ore_placed",
            ModConfiguredFeatures.NETHER_CRYSTAL_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> END_CRYSTAL_ORE_PLACED = PlacedFeatures.register("end_crystal_ore_placed",
            ModConfiguredFeatures.END_CRYSTAL_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));



    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
