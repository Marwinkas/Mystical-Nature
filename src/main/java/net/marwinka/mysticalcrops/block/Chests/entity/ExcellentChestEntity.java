package net.marwinka.mysticalcrops.block.Chests.entity;

import net.marwinka.mysticalcrops.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class ExcellentChestEntity extends GenericChestEntity {
    public ExcellentChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.EXCELLENT, pos, state);
    }
}