package net.marwinka.mysticalcrops.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marwinka.mysticalcrops.block.*;
import net.marwinka.mysticalcrops.block.chest.*;
import net.marwinka.mysticalcrops.items.old.OldBlock;
import net.marwinka.mysticalcrops.util.block.*;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

import static net.marwinka.mysticalcrops.MysticalCrops.ITEMGROUPCLASSIC;

public class ModBlocks {
    public static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    public static final Map<BlockItem, Identifier> BLOCK_ITEMS = new LinkedHashMap<>();

    public static final Block ESSENCE_ORE = register(new BaseOreBlock(), "essence_ore");
    public static final Block DEEPSLATE_ESSENCE_ORE = register(new BaseOreBlock(), "deepslate_essence_ore");
    public static final Block NETHER_ESSENCE_ORE = register(new BaseOreBlock(), "nether_essence_ore");
    public static final Block END_ESSENCE_ORE = register(new BaseOreBlock(), "end_essence_ore");
    public static final Block CRYSTAL_ORE = register(new BaseOreBlock(), "crystal_ore");
    public static final Block DEEPSLATE_CRYSTAL_ORE = register(new BaseOreBlock(), "deepslate_crystal_ore");
    public static final Block NETHER_CRYSTAL_ORE = register(new BaseOreBlock(), "nether_crystal_ore");
    public static final Block END_CRYSTAL_ORE = register(new BaseOreBlock(), "end_crystal_ore");
    
    public static final Block COMMON_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL), "common_block");
    public static final Block UNCOMMON_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL), "uncommon_block");
    public static final Block WONDERFUL_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL), "wonderful_block");
    public static final Block EXCELLENT_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL), "excellent_block");
    public static final Block PERFECT_BLOCK = register(new BaseBlock(Material.METAL, BlockSoundGroup.METAL), "perfect_block");
    
    public static final Block ESSENCE_PLANKS = register(new BaseBlock(Material.WOOD, BlockSoundGroup.WOOD), "essence_planks");
    public static final Block UNCOMMON_ESSENCE_PLANKS = register(new BaseBlock(Material.WOOD, BlockSoundGroup.WOOD), "uncommon_essence_planks");
    public static final Block WONDERFUL_ESSENCE_PLANKS = register(new BaseBlock(Material.WOOD, BlockSoundGroup.WOOD), "wonderful_essence_planks");
    public static final Block EXCELLENT_ESSENCE_PLANKS = register(new BaseBlock(Material.WOOD, BlockSoundGroup.WOOD), "excellent_essence_planks");
    public static final Block PERFECT_ESSENCE_PLANKS = register(new BaseBlock(Material.WOOD, BlockSoundGroup.WOOD), "perfect_essence_planks");
    
    public static final Block ESSENCE_COBBLESTONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "essence_cobblestone");
    public static final Block UNCOMMON_ESSENCE_COBBLESTONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "uncommon_essence_cobblestone");
    public static final Block WONDERFUL_ESSENCE_COBBLESTONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "wonderful_essence_cobblestone");
    public static final Block EXCELLENT_ESSENCE_COBBLESTONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "excellent_essence_cobblestone");
    public static final Block PERFECT_ESSENCE_COBBLESTONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "perfect_essence_cobblestone");
    
    public static final Block ESSENCE_STONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "essence_stone");
    public static final Block UNCOMMON_ESSENCE_STONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "uncommon_essence_stone");
    public static final Block WONDERFUL_ESSENCE_STONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "wonderful_essence_stone");
    public static final Block EXCELLENT_ESSENCE_STONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "excellent_essence_stone");
    public static final Block PERFECT_ESSENCE_STONE = register(new BaseBlock(Material.STONE, BlockSoundGroup.STONE), "perfect_essence_stone");

    public static final Block BOTANICAL_TABLE = register(new BotanicalBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).nonOpaque().requiresTool()), "botanical_table");
    public static final Block RITUAL_TABLE = register(new RitualBlock(FabricBlockSettings.of(Material.STONE).strength(4f).nonOpaque().requiresTool()), "ritual_table");
    public static final Block INFUSION_TABLE = register(new InfusionBlock(FabricBlockSettings.of(Material.STONE).strength(4f).nonOpaque().requiresTool()), "infusion_table");

    public static final Block COMMON_COAL_BLOCK = register(new BaseCoalBlock(1),"common_coal_block");
    public static final Block UNCOMMON_COAL_BLOCK = register(new BaseCoalBlock(2),"uncommon_coal_block");
    public static final Block WONDERFUL_COAL_BLOCK = register(new BaseCoalBlock(3),"wonderful_coal_block");
    public static final Block EXCELLENT_COAL_BLOCK = register(new BaseCoalBlock(4),"excellent_coal_block");
    public static final Block PERFECT_COAL_BLOCK = register(new BaseCoalBlock(5),"perfect_coal_block");

    public static final Block COMMON_CHEST = register(new GenericChestBlock(ChestTypes.COMMON.setting(), ChestTypes.COMMON), "common_chest");
    public static final Block UNCOMMON_CHEST = register(new GenericChestBlock(ChestTypes.UNCOMMON.setting(), ChestTypes.UNCOMMON), "uncommon_chest");
    public static final Block WONDERFUL_CHEST = register(new GenericChestBlock(ChestTypes.WONDERFUL.setting(), ChestTypes.WONDERFUL), "wonderful_chest");
    public static final Block EXCELLENT_CHEST = register(new GenericChestBlock(ChestTypes.EXCELLENT.setting(), ChestTypes.EXCELLENT), "excellent_chest");
    public static final Block PERFECT_CHEST = register(new GenericChestBlock(ChestTypes.PERFECT.setting(), ChestTypes.PERFECT), "perfect_chest");


    public static final Block BASIC_ESSENCE_BLOCK = register(new OldBlock(), "basic_essence_block");
    public static final Block UNCOMMON_ESSENCE_BLOCK = register(new OldBlock(), "uncommon_essence_block");
    public static final Block ADVANCE_ESSENCE_BLOCK = register(new OldBlock(), "advance_essence_block");
    public static final Block ULTRA_ESSENCE_BLOCK = register(new OldBlock(), "ultra_essence_block");
    public static final Block ULTIMATE_ESSENCE_BLOCK = register(new OldBlock(), "ultimate_essence_block");
    public static final Block BASIC_COAL_BLOCK = register(new OldBlock(),"basic_coal_block");
    public static final Block ADVANCE_COAL_BLOCK = register(new OldBlock(),"advance_coal_block");
    public static final Block ULTRA_COAL_BLOCK = register(new OldBlock(),"ultra_coal_block");
    public static final Block ULTIMATE_COAL_BLOCK = register(new OldBlock(),"ultimate_coal_block");

    public static final Block BOTANICAL_RITUAL_TABLE = register(new RitualBlock(FabricBlockSettings.of(Material.STONE).strength(4f).nonOpaque().requiresTool()), "botanical_ritual_table");
    private static Block register(Block block, String name) {
        Identifier id = new ModIdentifier(name);
        BLOCKS.put(block, id);
        BLOCK_ITEMS.put(new BlockItem(block, new Item.Settings().group(ITEMGROUPCLASSIC)), id);
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
