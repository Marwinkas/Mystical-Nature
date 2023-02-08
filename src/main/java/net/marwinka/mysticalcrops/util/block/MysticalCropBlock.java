package net.marwinka.mysticalcrops.util.block;

import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;


public class MysticalCropBlock extends CropBlock implements CropProvider {
    private final Crop crop;
    public static final IntProperty AGE = IntProperty.of("age", 0, 4);
    public MysticalCropBlock(Crop crop) {
        super(Settings.copy(Blocks.WHEAT));
        this.crop = crop;
    }
    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return false;
    }
    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return super.getPickStack(world, pos, state);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return this.crop.getSeeds();
    }

    public Crop getCrop() {
        return this.crop;
    }
    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }
    @Override
    public int getMaxAge() {
        return 4;
    }

}