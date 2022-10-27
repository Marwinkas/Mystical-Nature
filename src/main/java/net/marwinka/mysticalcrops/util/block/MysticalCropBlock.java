package net.marwinka.mysticalcrops.util.block;

import net.fabricmc.loader.impl.util.Localization;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.MutableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MysticalCropBlock extends CropBlock implements CropProvider {
    private final Crop crop;

    public static final IntProperty AGE = IntProperty.of("age", 0, 4);

    public MysticalCropBlock(Crop crop) {
        super(Settings.copy(Blocks.WHEAT));
        this.crop = crop;
    }


    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return false;
    }


    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return super.getPickStack(world, pos, state);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return this.crop.getSeeds();
    }

    public Crop getCrop() {
        return this.crop;
    }

    @Override
    public int getMaxAge() {
        return 4;
    }

}