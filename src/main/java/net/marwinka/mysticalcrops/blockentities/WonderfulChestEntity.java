package net.marwinka.mysticalcrops.blockentities;

import net.marwinka.mysticalcrops.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class WonderfulChestEntity extends GenericChestEntity {
    public WonderfulChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.WONDERFUL, pos, state);
    }
}