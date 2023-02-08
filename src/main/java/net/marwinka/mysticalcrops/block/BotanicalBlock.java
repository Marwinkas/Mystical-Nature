package net.marwinka.mysticalcrops.block;


import net.marwinka.mysticalcrops.block.entity.BotanicalEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class BotanicalBlock extends AbstractTable {
    public BotanicalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BotanicalEntity(pos, state);
    }
}