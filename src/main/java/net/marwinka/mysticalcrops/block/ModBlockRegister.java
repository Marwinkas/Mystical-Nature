package net.marwinka.mysticalcrops.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marwinka.mysticalcrops.ModItemGroup;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.crops.DiamondplantCropBlock;
import net.marwinka.mysticalcrops.crops.EssenceTier1plantCropBlock;
import net.marwinka.mysticalcrops.crops.IronplantCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockRegister {

    static ItemGroup tabs = ModItemGroup.ITEMGROUP;
    public static final Block BOTANICAL_TABLE = registerBlock("botanical_table",
            new BotanicalTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4f).requiresTool().nonOpaque()), tabs);
    public static final Block BOTANICAL_RITUAL_TABLE = registerBlock("botanical_ritual_table",
            new BotanicalRitualTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4f).requiresTool().nonOpaque()), tabs);
    public static final Block ESSENCE_PLANKS = registerBlock("essence_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(4f).requiresTool().nonOpaque()), tabs);
    public static final Block BASIC_ESSENCE_BLOCK = registerBlock("basic_essence_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), tabs);
    public static final Block UNCOMMON_ESSENCE_BLOCK = registerBlock("uncommon_essence_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), tabs);
    public static final Block ADVANCE_ESSENCE_BLOCK = registerBlock("advance_essence_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), tabs);
    public static final Block ULTRA_ESSENCE_BLOCK = registerBlock("ultra_essence_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), tabs);
    public static final Block Ultimate_ESSENCE_BLOCK = registerBlock("ultimate_essence_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), tabs);
    public static final Block DIAMOND_CROP = registerBlockWithoutItem("diamond_crop",
            new DiamondplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block IRON_CROP = registerBlockWithoutItem("iron_crop",
            new IronplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block ESSENCE_TIER_1_CROP = registerBlockWithoutItem("essence_tier_1_crop",
            new EssenceTier1plantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    //BlockWithItem
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MysticalCrops.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MysticalCrops.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void ModBlockregister() {
        MysticalCrops.LOGGER.debug("Registering ModBlocks for " +  MysticalCrops.MOD_ID);
    }
}
