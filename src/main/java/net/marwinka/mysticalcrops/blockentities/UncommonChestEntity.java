package net.marwinka.mysticalcrops.blockentities;

import net.marwinka.mysticalcrops.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class UncommonChestEntity extends GenericChestEntity {
    public UncommonChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.UNCOMMON, pos, state);
    }
}