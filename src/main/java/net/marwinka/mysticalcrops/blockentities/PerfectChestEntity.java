package net.marwinka.mysticalcrops.blockentities;

import net.marwinka.mysticalcrops.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class PerfectChestEntity extends GenericChestEntity {
    public PerfectChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.PERFECT, pos, state);
    }
}