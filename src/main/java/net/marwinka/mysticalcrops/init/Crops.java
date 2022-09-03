package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.util.block.BaseCrop;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class Crops {
    public static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    public static final Map<BlockItem, Identifier> BLOCK_ITEMS = new LinkedHashMap<>();

    public static final Block DIAMOND_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "diamond_crop");
    public static final Block EMERALD_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "emerald_crop");
    public static final Block GOLD_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "gold_crop");
    public static final Block IRON_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "iron_crop");
    public static final Block LAPIS_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "lapis_crop");
    public static final Block REDSTONE_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "redstone_crop");
    public static final Block ESSENCE_CROP_TIER_1 = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "essence_crop_tier_1");

    private static Block register(Block block, String name) {
        Identifier id = new Identifier(MysticalCrops.MOD_ID, name);
        BLOCKS.put(block, id);
        return block;
    }
    public static void registerCrops() {
        BLOCKS.forEach((block, id) -> {
            Registry.register(Registry.BLOCK, id, block);
        });

        BLOCK_ITEMS.forEach((block_item, id) -> {
            Registry.register(Registry.ITEM, id, block_item);
        });
}
}
