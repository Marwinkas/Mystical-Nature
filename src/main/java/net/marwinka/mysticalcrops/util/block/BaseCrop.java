package net.marwinka.mysticalcrops.util.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BaseCrop extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age", 0, 4);
    public BaseCrop(Settings settings) {
        super(settings);
    }
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return false;
    }
    @Override
    public int getMaxAge() {
        return 4;
    }
    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}