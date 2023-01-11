package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.marwinka.mysticalcrops.items.*;
import net.marwinka.mysticalcrops.items.AliasedBlockItem;
import net.marwinka.mysticalcrops.items.Items;
import net.marwinka.mysticalcrops.items.tools.*;
import net.marwinka.mysticalcrops.items.tools.ToolMaterials;
import net.marwinka.mysticalcrops.util.block.BaseItem;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.util.group.ModItemGroupClassic;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModItems {
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();
    public static final BlockItem COMMON_CHEST = new BlockItem(ModBlockChest.COMMON_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final BlockItem UNCOMMON_CHEST = new BlockItem(ModBlockChest.UNCOMMON_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final BlockItem WONDERFUL_CHEST = new BlockItem(ModBlockChest.WONDERFUL_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final BlockItem EXCELLENT_CHEST = new BlockItem(ModBlockChest.EXCELLENT_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final BlockItem PERFECT_CHEST = new BlockItem(ModBlockChest.PERFECT_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final Item BASIC_COAL = register(new Coals(1), "basic_coal");
    public static final Item UNCOMMON_COAL = register(new Coals(2), "uncommon_coal");
    public static final Item ADVANCE_COAL = register(new Coals(3), "advance_coal");
    public static final Item ULTRA_COAL = register(new Coals(4), "ultra_coal");
    public static final Item ULTIMATE_COAL = register(new Coals(5), "ultimate_coal");
    public static final Item CRYSTAL_FRAGMENTS = register("crystal_fragments");
    public static final Item BASIC_ESSENCE = register("basic_essence");
    public static final Item UNCOMMON_ESSENCE = register("uncommon_essence");
    public static final Item ADVANCE_ESSENCE = register("advance_essence");
    public static final Item ULTRA_ESSENCE = register("ultra_essence");
    public static final Item ULTIMATE_ESSENCE = register("ultimate_essence");
    public static final Item EMPTY_CRYSTAL = register("empty_crystal");
    public static final Item BASIC_CRYSTAL = register(new EssenceTool(ToolMaterials.COMMON_CRYSTAL), "basic_crystal");
    public static final Item UNCOMMON_CRYSTAL = register(new EssenceTool(ToolMaterials.UNCOMMON_CRYSTAL), "uncommon_crystal");
    public static final Item ADVANCE_CRYSTAL = register(new EssenceTool(ToolMaterials.WONDERFUL_CRYSTAL), "advance_crystal");
    public static final Item ULTRA_CRYSTAL = register(new EssenceTool(ToolMaterials.EXCELLENT_CRYSTAL), "ultra_crystal");
    public static final Item ULTIMATE_CRYSTAL = register(new EssenceTool(ToolMaterials.PERFECT_CRYSTAL), "ultimate_crystal");
    public static final Item INFINITY_CRYSTAL = register(new InfinityTool(ToolMaterials.PERFECT_CRYSTAL),"infinity_crystal");
    public static final Item DARK_CRYSTAL = register("dark_crystal");
    public static final Item WITHER_CRYSTAL = register("wither_crystal");
    public static final Item WITHER_SOUL = register(new Souls(),"wither_soul");
    public static final Item COW_CRYSTAL = register("cow_crystal");
    public static final Item COW_SOUL = register(new Souls(),"cow_soul");
    public static final Item CHICKEN_CRYSTAL = register("chicken_crystal");
    public static final Item CHICKEN_SOUL = register(new Souls(),"chicken_soul");
    public static final Item SHEEP_CRYSTAL = register("sheep_crystal");
    public static final Item SHEEP_SOUL = register(new Souls(),"sheep_soul");
    public static final Item CRAFT_SEEDS = register("craft_seeds");
    public static final Item CRAFT_SEEDS_TIER_2 = register("craft_seeds_tier_2");
    public static final Item CRAFT_SEEDS_TIER_3 = register("craft_seeds_tier_3");
    public static final Item CRAFT_SEEDS_TIER_4 = register("craft_seeds_tier_4");
    public static final Item CRAFT_SEEDS_TIER_5 = register("craft_seeds_tier_5");

    public static final Item COMMON_INGOT = register("common_ingot");
    public static final Item UNCOMMON_INGOT = register("uncommon_ingot");
    public static final Item WONDERFUL_INGOT = register("wonderful_ingot");
    public static final Item EXCELLENT_INGOT = register("excellent_ingot");
    public static final Item PERFECT_INGOT = register("perfect_ingot");
    public static final Item INFINITY_INGOT = register("infinity_ingot");

    public static final Item COMMON_KNIFE = register(new EssenceTool(ToolMaterials.COMMON_KNIFE), "common_knife");
    public static final Item UNCOMMON_KNIFE = register(new EssenceTool(ToolMaterials.UNCOMMON_KNIFE), "uncommon_knife");
    public static final Item WONDERFUL_KNIFE = register(new EssenceTool(ToolMaterials.WONDERFUL_KNIFE), "wonderful_knife");
    public static final Item EXCELLENT_KNIFE = register(new EssenceTool(ToolMaterials.EXCELLENT_KNIFE), "excellent_knife");
    public static final Item PERFECT_KNIFE = register(new EssenceTool(ToolMaterials.PERFECT_KNIFE), "perfect_knife");
    public static final Item INFINITY_KNIFE = register(new InfinityTool(ToolMaterials.PERFECT_KNIFE),"infinity_knife");

    public static final Item WATERING_CAN = register(new WateringCan(3, 0.5, 0), "watering_can");
    public static final Item BASIC_WATERING_CAN = register(new WateringCan(5, 0.6, 1), "basic_watering_can");
    public static final Item UNCOMMON_WATERING_CAN = register(new WateringCan(7, 0.7, 2), "uncommon_watering_can");
    public static final Item ADVANCE_WATERING_CAN = register(new WateringCan(9, 0.8, 3), "advance_watering_can");
    public static final Item ULTRA_WATERING_CAN = register(new WateringCan(11, 0.9, 4), "ultra_watering_can");
    public static final Item ULTIMATE_WATERING_CAN = register(new WateringCan(13, 1, 5), "ultimate_watering_can");

    public static final Item ESSENCE_FRUIT_TIER_1 = register(new Items(1), "essence_fruit_tier_1");
    public static final Item ESSENCE_FRUIT_TIER_2 = register(new Items(2), "essence_fruit_tier_2");
    public static final Item ESSENCE_FRUIT_TIER_3 = register(new Items(3), "essence_fruit_tier_3");
    public static final Item ESSENCE_FRUIT_TIER_4 = register(new Items(4), "essence_fruit_tier_4");
    public static final Item ESSENCE_FRUIT_TIER_5 = register(new Items(5), "essence_fruit_tier_5");

    public static final Item ESSENCE_SEEDS_TIER_1 = register(new AliasedBlockItem(1,ModCrops.ESSENCE_CROP_TIER_1), "essence_seeds_tier_1");
    public static final Item ESSENCE_SEEDS_TIER_2 = register(new AliasedBlockItem(2,ModCrops.ESSENCE_CROP_TIER_2), "essence_seeds_tier_2");
    public static final Item ESSENCE_SEEDS_TIER_3 = register(new AliasedBlockItem(3,ModCrops.ESSENCE_CROP_TIER_3), "essence_seeds_tier_3");
    public static final Item ESSENCE_SEEDS_TIER_4 = register(new AliasedBlockItem(4,ModCrops.ESSENCE_CROP_TIER_4), "essence_seeds_tier_4");
    public static final Item ESSENCE_SEEDS_TIER_5 = register(new AliasedBlockItem(5,ModCrops.ESSENCE_CROP_TIER_5), "essence_seeds_tier_5");

    private static Item register(String name) {
        return register(new BaseItem(p -> p.group(ModItemGroupClassic.ITEMGROUP)), name);
    }
    private static Item register(Item item, String name) {
        Identifier id = new Identifier(MysticalCrops.MOD_ID, name);
        ITEMS.put(item, id);
        return item;
    }

    public static void registerItems() {
        ITEMS.forEach((item, id) -> Registry.register(Registry.ITEM, id, item));
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "common_chest"), COMMON_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "uncommon_chest"), UNCOMMON_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "wonderful_chest"), WONDERFUL_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "excellent_chest"), EXCELLENT_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "perfect_chest"), PERFECT_CHEST);
    }

    public static void registerModStuffs() {
        registerFuels();
    }
    private static void registerFuels() {
        MysticalCrops.LOGGER.info("Registering Fuels for " + MysticalCrops.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.BASIC_COAL, 3200);
        registry.add(ModItems.UNCOMMON_COAL, 6400);
        registry.add(ModItems.ADVANCE_COAL, 11200);
        registry.add(ModItems.ULTRA_COAL, 16000);
        registry.add(ModItems.ULTIMATE_COAL, 24000);
        registry.add(ModBlocks.BASIC_COAL_BLOCK, 32000);
        registry.add(ModBlocks.UNCOMMON_COAL_BLOCK, 64000);
        registry.add(ModBlocks.ADVANCE_COAL_BLOCK, 112000);
        registry.add(ModBlocks.ULTRA_COAL_BLOCK, 160000);
        registry.add(ModBlocks.ULTIMATE_COAL_BLOCK, 240000);
    }
}
