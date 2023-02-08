package net.marwinka.mysticalcrops.block.old;

import net.marwinka.mysticalcrops.block.AbstractTable;
import net.marwinka.mysticalcrops.block.entity.RitualEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class OldRitualTable extends AbstractTable {
    public OldRitualTable(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new RitualEntity(pos, state);
    }
}