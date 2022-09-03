package net.marwinka.mysticalcrops.init;

import net.marwinka.mysticalcrops.util.group.ModItemGroup;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.blocks.BotanicalRitualTableBlock;
import net.marwinka.mysticalcrops.blocks.BotanicalTableBlock;
import net.marwinka.mysticalcrops.util.block.BaseBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class Blocks {
    public static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    public static final Map<BlockItem, Identifier> BLOCK_ITEMS = new LinkedHashMap<>();

    public static final Block BOTANICAL_TABLE = register(new BotanicalTableBlock(Material.WOOD, BlockSoundGroup.WOOD, 5.0F, 6.0F), "botanical_table");
    public static final Block BOTANICAL_RITUAL_TABLE = register(new BotanicalRitualTableBlock(Material.WOOD, BlockSoundGroup.WOOD, 5.0F, 6.0F), "botanical_ritual_table");
    public static final Block ESSENCE_PLANKS = register(new BaseBlock(Material.WOOD, BlockSoundGroup.WOOD, 5.0F, 6.0F), "essence_planks");
    public static final Block BASIC_ESSENCE_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL, 5.0F, 6.0F), "basic_essence_block");
    public static final Block UNCOMMON_ESSENCE_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL, 5.0F, 6.0F), "uncommon_essence_block");
    public static final Block ADVANCE_ESSENCE_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL, 5.0F, 6.0F), "advance_essence_block");
    public static final Block ULTRA_ESSENCE_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL, 5.0F, 6.0F), "ultra_essence_block");
    public static final Block ULTIMATE_ESSENCE_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL, 5.0F, 6.0F), "ultimate_essence_block");

    private static Block register(Block block, String name) {
        Identifier id = new Identifier(MysticalCrops.MOD_ID, name);
        BLOCKS.put(block, id);
        BLOCK_ITEMS.put(new BlockItem(block, new Item.Settings().group(ModItemGroup.ITEMGROUP)), id);
        return block;
    }
    public static void registerBlocks() {
        BLOCKS.forEach((block, id) -> {
            Registry.register(Registry.BLOCK, id, block);
        });

        BLOCK_ITEMS.forEach((block_item, id) -> {
            Registry.register(Registry.ITEM, id, block_item);
        });
    }
}
