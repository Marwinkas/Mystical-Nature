package net.marwinka.mysticalcrops.block.chest.entity;

import net.marwinka.mysticalcrops.block.chest.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class ExcellentChestEntity extends GenericChestEntity {
    public ExcellentChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.EXCELLENT, pos, state);
    }
}