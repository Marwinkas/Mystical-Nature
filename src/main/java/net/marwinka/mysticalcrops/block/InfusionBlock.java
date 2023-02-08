package net.marwinka.mysticalcrops.block;


import net.marwinka.mysticalcrops.block.entity.InfusionEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class InfusionBlock extends AbstractTable {
    public InfusionBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new InfusionEntity(pos, state);
    }
}