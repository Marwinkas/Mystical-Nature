package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.blockentities.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static final BlockEntityType<CommonChestEntity> COMMON_CHEST = FabricBlockEntityTypeBuilder.create(CommonChestEntity::new, ModBlockChest.COMMON_CHEST).build(null);
    public static final BlockEntityType<UncommonChestEntity> UNCOMMON_CHEST = FabricBlockEntityTypeBuilder.create(UncommonChestEntity::new, ModBlockChest.UNCOMMON_CHEST).build(null);
    public static final BlockEntityType<WonderfulChestEntity> WONDERFUL_CHEST = FabricBlockEntityTypeBuilder.create(WonderfulChestEntity::new, ModBlockChest.WONDERFUL_CHEST).build(null);
    public static final BlockEntityType<ExcellentChestEntity> EXCELLENT_CHEST = FabricBlockEntityTypeBuilder.create(ExcellentChestEntity::new, ModBlockChest.EXCELLENT_CHEST).build(null);
    public static final BlockEntityType<PerfectChestEntity> PERFECT_CHEST = FabricBlockEntityTypeBuilder.create(PerfectChestEntity::new, ModBlockChest.PERFECT_CHEST).build(null);

    public static BlockEntityType<BotanicalTableEntity> BOTANICAL_TABLE;
    public static BlockEntityType<RitualTableEntity> BOTANICAL_RITUAL_TABLE;
    public static BlockEntityType<InfusionTableEntity> INFUSION_TABLE;
    public static void registerBlockEntities() {
        BOTANICAL_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "botanical_table"),
                FabricBlockEntityTypeBuilder.create(BotanicalTableEntity::new, ModBlocks.BOTANICAL_TABLE).build(null));
        BOTANICAL_RITUAL_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "botanical_ritual_table"),
                FabricBlockEntityTypeBuilder.create(RitualTableEntity::new, ModBlocks.BOTANICAL_RITUAL_TABLE).build(null));
        INFUSION_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "infusion_table"),
                FabricBlockEntityTypeBuilder.create(InfusionTableEntity::new, ModBlocks.INFUSION_TABLE).build(null));

        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "common_chest"), COMMON_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "uncommon_chest"), UNCOMMON_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "wonderful_chest"), WONDERFUL_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "excellent_chest"), EXCELLENT_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "perfect_chest"), PERFECT_CHEST);
    }
}
