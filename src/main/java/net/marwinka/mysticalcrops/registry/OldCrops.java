package net.marwinka.mysticalcrops.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marwinka.mysticalcrops.util.block.BaseCrop;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class OldCrops {
    public static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    public static final Map<BlockItem, Identifier> BLOCK_ITEMS = new LinkedHashMap<>();

    public static final Block ESSENCE_CROP_TIER_1 = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "essence_crop_tier_1");
    public static final Block ESSENCE_CROP_TIER_2 = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "essence_crop_tier_2");
    public static final Block ESSENCE_CROP_TIER_3 = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "essence_crop_tier_3");
    public static final Block ESSENCE_CROP_TIER_4 = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "essence_crop_tier_4");
    public static final Block ESSENCE_CROP_TIER_5 = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "essence_crop_tier_5");

    private static Block register(Block block, String name) {
        BLOCKS.put(block, new ModIdentifier(name));
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