package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.items.*;
import net.marwinka.mysticalcrops.util.block.BaseItem;
import net.marwinka.mysticalcrops.util.group.ModItemGroup;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.items.tools.Crystal;
import net.marwinka.mysticalcrops.items.tools.Knife;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class Items {
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

    public static final Item ESSENCE_SEEDS_TIER_1 = register(new Tier1(Crops.ESSENCE_CROP_TIER_1, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "essence_seeds_tier_1");
    public static final Item ESSENCE_SEEDS_TIER_2 = register(new Tier2(Crops.ESSENCE_CROP_TIER_2, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "essence_seeds_tier_2");
    public static final Item ESSENCE_SEEDS_TIER_3 = register(new Tier3(Crops.ESSENCE_CROP_TIER_3, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "essence_seeds_tier_3");
    public static final Item ESSENCE_SEEDS_TIER_4 = register(new Tier4(Crops.ESSENCE_CROP_TIER_4, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "essence_seeds_tier_4");
    public static final Item ESSENCE_SEEDS_TIER_5 = register(new Tier5(Crops.ESSENCE_CROP_TIER_5, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "essence_seeds_tier_5");
    public static final Item DIRT_SEEDS = register(new Tier2(Crops.DIRT_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "dirt_seeds");
    public static final Item STONE_SEEDS = register(new Tier2(Crops.STONE_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "stone_seeds");
    public static final Item COAL_SEEDS = register(new Tier3(Crops.COAL_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "coal_seeds");
    public static final Item COPPER_SEEDS = register(new Tier3(Crops.COPPER_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "copper_seeds");
    public static final Item IRON_SEEDS = register(new Tier3(Crops.IRON_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "iron_seeds");
    public static final Item GOLD_SEEDS = register(new Tier4(Crops.GOLD_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "gold_seeds");
    public static final Item LAPIS_SEEDS = register(new Tier4(Crops.LAPIS_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "lapis_seeds");
    public static final Item REDSTONE_SEEDS = register(new Tier4(Crops.REDSTONE_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "redstone_seeds");
    public static final Item QUARTZ_SEEDS = register(new Tier4(Crops.QUARTZ_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "quartz_seeds");
    public static final Item GLOWSTONE_SEEDS = register(new Tier4(Crops.GLOWSTONE_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "glowstone_seeds");
    public static final Item FIRE_SEEDS = register(new Tier4(Crops.FIRE_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "fire_seeds");
    public static final Item ECHO_SEEDS = register(new Tier4(Crops.ECHO_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "echo_seeds");
    public static final Item OBSIDIAN_SEEDS = register(new Tier5(Crops.OBSIDIAN_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "obsidian_seeds");
    public static final Item DIAMOND_SEEDS = register(new Tier5(Crops.DIAMOND_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "diamond_seeds");
    public static final Item EMERALD_SEEDS = register(new Tier5(Crops.EMERALD_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "emerald_seeds");
    public static final Item NETHERITE_SEEDS = register(new Tier5(Crops.NETHERITE_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "netherite_seeds");
    public static final Item ESSENCE_FRUIT_TIER_1 = register(new ItemTier1(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_1");
    public static final Item ESSENCE_FRUIT_TIER_2 = register(new ItemTier2(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_2");
    public static final Item ESSENCE_FRUIT_TIER_3 = register(new ItemTier3(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_3");
    public static final Item ESSENCE_FRUIT_TIER_4 = register(new ItemTier4(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_4");
    public static final Item ESSENCE_FRUIT_TIER_5 = register(new ItemTier5(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_5");
    public static final Item COAL_FRUIT = register(new ItemTier3(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "coal_fruit");
    public static final Item DIRT_FRUIT = register(new ItemTier2(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "dirt_fruit");
    public static final Item STONE_FRUIT = register(new ItemTier2(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "stone_fruit");
    public static final Item COPPER_FRUIT = register(new ItemTier3(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "copper_fruit");
    public static final Item IRON_FRUIT = register(new ItemTier3(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "iron_fruit");
    public static final Item GOLD_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "gold_fruit");
    public static final Item LAPIS_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "lapis_fruit");
    public static final Item REDSTONE_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "redstone_fruit");
    public static final Item QUARTZ_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "quartz_fruit");
    public static final Item GLOWSTONE_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "glowstone_fruit");
    public static final Item FIRE_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "fire_fruit");
    public static final Item ECHO_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "echo_fruit");
    public static final Item DIAMOND_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "diamond_fruit");
    public static final Item EMERALD_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "emerald_fruit");
    public static final Item OBSIDIAN_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "obsidian_fruit");
    public static final Item NETHERITE_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "netherite_fruit");

    public static final Item BASIC_ESSENCE = register("basic_essence");
    public static final Item UNCOMMON_ESSENCE = register("uncommon_essence");
    public static final Item ADVANCE_ESSENCE = register("advance_essence");
    public static final Item ULTRA_ESSENCE = register("ultra_essence");
    public static final Item ULTIMATE_ESSENCE = register("ultimate_essence");

    public static final Item DIRT_ESSENCE = register("dirt_essence");
    public static final Item STONE_ESSENCE = register("stone_essence");
    public static final Item COAL_ESSENCE = register("coal_essence");
    public static final Item GOLD_ESSENCE = register("gold_essence");
    public static final Item IRON_ESSENCE = register("iron_essence");
    public static final Item COPPER_ESSENCE = register("copper_essence");
    public static final Item NETHERITE_ESSENCE = register("netherite_essence");
    public static final Item OBSIDIAN_ESSENCE = register("obsidian_essence");
    public static final Item QUARTZ_ESSENCE = register("quartz_essence");
    public static final Item GLOWSTONE_ESSENCE = register("glowstone_essence");
    public static final Item FIRE_ESSENCE = register("fire_essence");
    public static final Item ECHO_ESSENCE = register("echo_essence");
    public static final Item LAPIS_ESSENCE = register("lapis_essence");
    public static final Item REDSTONE_ESSENCE = register("redstone_essence");
    public static final Item DIAMOND_ESSENCE = register("diamond_essence");
    public static final Item EMERALD_ESSENCE = register("emerald_essence");

    public static final Item BASIC_COAL = register(new CoalTier1(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "basic_coal");
    public static final Item UNCOMMON_COAL = register(new CoalTier2(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "uncommon_coal");
    public static final Item ADVANCE_COAL = register(new CoalTier3(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "advance_coal");
    public static final Item ULTRA_COAL = register(new CoalTier4(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "ultra_coal");
    public static final Item ULTIMATE_COAL = register(new CoalTier5(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "ultimate_coal");

    public static final Item DIRT_PLATE = register(new ItemTier2(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "dirt_plate");
    public static final Item STONE_PLATE = register(new ItemTier2(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "stone_plate");
    public static final Item CRYSTAL = register(new Crystal(ToolMaterials.IRON,0,0,new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)), "crystal");
    public static final Item IRON_KNIFE = register(new Knife(ToolMaterials.IRON,0,0,new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)), "iron_knife");
    public static final Item DIAMOND_KNIFE = register(new Knife(ToolMaterials.DIAMOND,0,0,new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)), "diamond_knife");
    public static final Item NETHERITE_KNIFE = register(new Knife(ToolMaterials.NETHERITE,0,0,new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)), "netherite_knife");

    public static final Item WATERING_CAN = register( new wateringcan(p -> p.group(ModItemGroup.ITEMGROUP)), "watering_can");

    private static Item register(String name) {
        return register(new BaseItem(p -> p.group(ModItemGroup.ITEMGROUP)), name);
    }

    private static Item register(Item item, String name) {
        Identifier id = new Identifier(MysticalCrops.MOD_ID, name);
        ITEMS.put(item, id);
        return item;
    }

    public static void registerItems() {
        ITEMS.forEach((item, id) -> Registry.register(Registry.ITEM, id, item));
    }
}
