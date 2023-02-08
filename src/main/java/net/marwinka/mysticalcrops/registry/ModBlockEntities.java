package net.marwinka.mysticalcrops.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.marwinka.mysticalcrops.block.chest.entity.*;
import net.marwinka.mysticalcrops.block.entity.BotanicalEntity;
import net.marwinka.mysticalcrops.block.entity.InfusionEntity;
import net.marwinka.mysticalcrops.block.entity.RitualEntity;
import net.marwinka.mysticalcrops.block.old.OldRitualEntity;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.block.Block;
import net.minecraft.block.entity.*;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<BotanicalEntity> BOTANICAL_TABLE;
    public static BlockEntityType<RitualEntity> RITUAL_TABLE;
    public static BlockEntityType<OldRitualEntity> BOTANICAL_RITUAL_TABLE;
    public static BlockEntityType<InfusionEntity> INFUSION_TABLE;
    public static final BlockEntityType<CommonChestEntity> COMMON_CHEST = FabricBlockEntityTypeBuilder.create(CommonChestEntity::new, ModBlocks.COMMON_CHEST).build(null);
    public static final BlockEntityType<UncommonChestEntity> UNCOMMON_CHEST = FabricBlockEntityTypeBuilder.create(UncommonChestEntity::new, ModBlocks.UNCOMMON_CHEST).build(null);
    public static final BlockEntityType<WonderfulChestEntity> WONDERFUL_CHEST = FabricBlockEntityTypeBuilder.create(WonderfulChestEntity::new, ModBlocks.WONDERFUL_CHEST).build(null);
    public static final BlockEntityType<ExcellentChestEntity> EXCELLENT_CHEST = FabricBlockEntityTypeBuilder.create(ExcellentChestEntity::new, ModBlocks.EXCELLENT_CHEST).build(null);
    public static final BlockEntityType<PerfectChestEntity> PERFECT_CHEST = FabricBlockEntityTypeBuilder.create(PerfectChestEntity::new, ModBlocks.PERFECT_CHEST).build(null);
    public static void register() {
        BOTANICAL_TABLE = register("botanical_entity", BotanicalEntity::new, ModBlocks.BOTANICAL_TABLE);
        RITUAL_TABLE = register("ritual_entity", RitualEntity::new, ModBlocks.RITUAL_TABLE);

        BOTANICAL_RITUAL_TABLE = register("botanical_ritual_table", OldRitualEntity::new, ModBlocks.BOTANICAL_RITUAL_TABLE);

        INFUSION_TABLE = register("infusion_entity", InfusionEntity::new, ModBlocks.INFUSION_TABLE);

        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ModIdentifier("common_chest"), COMMON_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ModIdentifier("uncommon_chest"), UNCOMMON_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ModIdentifier("wonderful_chest"), WONDERFUL_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ModIdentifier("excellent_chest"), EXCELLENT_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new ModIdentifier("perfect_chest"), PERFECT_CHEST);
    }
    public static <T extends BlockEntity> BlockEntityType<T> register(String id, FabricBlockEntityTypeBuilder.Factory<T> factory, Block... blocks) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, new ModIdentifier(id), FabricBlockEntityTypeBuilder.create(factory, blocks).build(null));
    }
}
