package net.marwinka.mysticalcrops.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.init.ModBlockEntities;
import net.marwinka.mysticalcrops.init.ModBlockChest;
import net.marwinka.mysticalcrops.screen.GenericChestScreenHandler;
import net.marwinka.mysticalcrops.screen.ModScreenHandlerType;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public enum ChestTypes {
    COMMON(36, 9, new Identifier(MysticalCrops.MOD_ID, "model/common_chest")),
    UNCOMMON(45, 9, new Identifier(MysticalCrops.MOD_ID, "model/uncommon_chest")),
    WONDERFUL(54, 9, new Identifier(MysticalCrops.MOD_ID, "model/wonderful_chest")),
    EXCELLENT(72, 12, new Identifier(MysticalCrops.MOD_ID, "model/excellent_chest")),
    PERFECT(99, 12, new Identifier(MysticalCrops.MOD_ID, "model/perfect_chest")),
    WOOD(27, 9, new Identifier("entity/chest/normal"));

    public final int size;
    public final int rowLength;
    public final Identifier texture;

    ChestTypes(int size, int rowLength, Identifier texture) {
        this.size = size;
        this.rowLength = rowLength;
        this.texture = texture;
    }

    public int getRowCount() {
        return this.size / this.rowLength;
    }

    public static Block get(ChestTypes type) {
        return switch (type) {
            case COMMON -> ModBlockChest.COMMON_CHEST;
            case UNCOMMON -> ModBlockChest.UNCOMMON_CHEST;
            case WONDERFUL -> ModBlockChest.WONDERFUL_CHEST;
            case EXCELLENT -> ModBlockChest.EXCELLENT_CHEST;
            case PERFECT -> ModBlockChest.PERFECT_CHEST;
            default -> Blocks.CHEST;
        };
    }

    // Used to implement Item Upgrades
    public ChestBlockEntity makeEntity(BlockPos pos, BlockState state) {
        return switch (this) {
            case COMMON -> ModBlockEntities.COMMON_CHEST.instantiate(pos, state);
            case UNCOMMON -> ModBlockEntities.UNCOMMON_CHEST.instantiate(pos, state);
            case WONDERFUL -> ModBlockEntities.WONDERFUL_CHEST.instantiate(pos, state);
            case EXCELLENT -> ModBlockEntities.EXCELLENT_CHEST.instantiate(pos, state);
            case PERFECT -> ModBlockEntities.PERFECT_CHEST.instantiate(pos, state);
            default -> new ChestBlockEntity(pos, state);
        };
    }

    public ScreenHandlerType<GenericChestScreenHandler> getScreenHandlerType() {
        return switch (this) {
            case UNCOMMON -> ModScreenHandlerType.UNCOMMON_CHEST;
            case WONDERFUL -> ModScreenHandlerType.WONDERFUL_CHEST;
            case EXCELLENT -> ModScreenHandlerType.EXCELLENT_CHEST;
            case PERFECT -> ModScreenHandlerType.PERFECT_CHEST;
            default -> ModScreenHandlerType.COMMON_CHEST;
        };
    }

    public BlockEntityType<? extends ChestBlockEntity> getBlockEntityType() {
        return switch (this) {
            case COMMON -> ModBlockEntities.COMMON_CHEST;
            case UNCOMMON -> ModBlockEntities.UNCOMMON_CHEST;
            case WONDERFUL -> ModBlockEntities.WONDERFUL_CHEST;
            case EXCELLENT -> ModBlockEntities.EXCELLENT_CHEST;
            case PERFECT -> ModBlockEntities.PERFECT_CHEST;
            default -> BlockEntityType.CHEST;
        };
    }
    public FabricBlockSettings setting() {
        return switch (this) {
            case WOOD, COMMON, UNCOMMON,WONDERFUL,EXCELLENT,PERFECT-> FabricBlockSettings.of(Material.WOOD)
                    .hardness(3.0F)
                    .resistance(3.0F)
                    .sounds(BlockSoundGroup.WOOD);
            default -> FabricBlockSettings.of(Material.WOOD);
        };
    }
}