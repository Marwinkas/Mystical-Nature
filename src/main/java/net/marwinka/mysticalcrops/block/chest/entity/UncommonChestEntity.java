package net.marwinka.mysticalcrops.block.chest.entity;

import net.marwinka.mysticalcrops.block.chest.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class UncommonChestEntity extends GenericChestEntity {
    public UncommonChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.UNCOMMON, pos, state);
    }
}