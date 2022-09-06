package net.marwinka.mysticalcrops.init.itemfromothermods;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.util.block.BaseCrop;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class OtherCrops {
    public static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    public static final Map<BlockItem, Identifier> BLOCK_ITEMS = new LinkedHashMap<>();


    public static final Block GOBBER_GLOB_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "gobber_glob_crop");
    public static final Block NETHER_GOBBER_GLOB_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "nether_gobber_glob_crop");
    public static final Block END_GOBBER_GLOB_CROP = register(new BaseCrop(FabricBlockSettings.copy(net.minecraft.block.Blocks.WHEAT)), "end_gobber_glob_crop");


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
