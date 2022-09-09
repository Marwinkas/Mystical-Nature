package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marwinka.mysticalcrops.util.group.ModItemGroup;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.blocks.BotanicalRitualTableBlock;
import net.marwinka.mysticalcrops.blocks.BotanicalTableBlock;
import net.marwinka.mysticalcrops.util.block.BaseBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.List;
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

    public static final Block BASIC_COAL_BLOCK = registerBlock("basic_coal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),
            ModItemGroup.ITEMGROUP, "item.mysticalcrops.coalblocktier_1.tooltip");
    public static final Block UNCOMMON_COAL_BLOCK = registerBlock("uncommon_coal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),
            ModItemGroup.ITEMGROUP, "item.mysticalcrops.coalblocktier_2.tooltip");
    public static final Block ADVANCE_COAL_BLOCK = registerBlock("advance_coal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),
            ModItemGroup.ITEMGROUP, "item.mysticalcrops.coalblocktier_3.tooltip");
    public static final Block ULTRA_COAL_BLOCK = registerBlock("ultra_coal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),
            ModItemGroup.ITEMGROUP, "item.mysticalcrops.coalblocktier_4.tooltip");
    public static final Block ULTIMATE_COAL_BLOCK = registerBlock("ultimate_coal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),
            ModItemGroup.ITEMGROUP, "item.mysticalcrops.coalblocktier_5.tooltip");

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
    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(MysticalCrops.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(Text.translatable(tooltipKey) );
                    }
                });
    }
}
