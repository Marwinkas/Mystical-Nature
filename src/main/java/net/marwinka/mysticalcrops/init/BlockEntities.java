package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.blockentities.RitualTableEntity;
import net.marwinka.mysticalcrops.blockentities.BotanicalTableEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockEntities {
    public static BlockEntityType<BotanicalTableEntity> BOTANICAL_TABLE;
    public static BlockEntityType<RitualTableEntity> BOTANICAL_RITUAL_TABLE;

    public static void registerBlockEntities() {
        BOTANICAL_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "botanical_table"),
                FabricBlockEntityTypeBuilder.create(BotanicalTableEntity::new, Blocks.BOTANICAL_TABLE).build(null));
        BOTANICAL_RITUAL_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MysticalCrops.MOD_ID, "botanical_ritual_table"),
                FabricBlockEntityTypeBuilder.create(RitualTableEntity::new, Blocks.BOTANICAL_RITUAL_TABLE).build(null));
    }
}
