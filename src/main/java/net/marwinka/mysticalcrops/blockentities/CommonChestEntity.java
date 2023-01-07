package net.marwinka.mysticalcrops.blockentities;

import net.marwinka.mysticalcrops.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class CommonChestEntity extends GenericChestEntity {
    public CommonChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.COMMON, pos, state);
    }
}