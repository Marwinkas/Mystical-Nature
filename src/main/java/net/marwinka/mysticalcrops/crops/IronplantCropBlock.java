package net.marwinka.mysticalcrops.crops;

import net.marwinka.mysticalcrops.item.ModItemRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class IronplantCropBlock extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age", 0, 4);
    public IronplantCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItemRegister.IRON_SEED;
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
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return false;
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
