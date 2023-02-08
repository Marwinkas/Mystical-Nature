package net.marwinka.mysticalcrops.block.chest.entity;

import net.marwinka.mysticalcrops.block.chest.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class WonderfulChestEntity extends GenericChestEntity {
    public WonderfulChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.WONDERFUL, pos, state);
    }
}