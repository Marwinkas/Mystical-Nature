package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.items.*;
import net.marwinka.mysticalcrops.items.tools.*;
import net.marwinka.mysticalcrops.util.block.BaseItem;
import net.marwinka.mysticalcrops.util.group.ModItemGroupMinecraft;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.util.group.ModItemGroupMinecraft;
import net.marwinka.mysticalcrops.util.group.ModItemGroupMinecraft;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class Items {
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();
    public static final Item DIRT_SEEDS = register(new Tier2(Crops.DIRT_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "dirt_seeds");
    public static final Item STONE_SEEDS = register(new Tier2(Crops.STONE_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "stone_seeds");
    public static final Item WOOD_SEEDS = register(new Tier2(Crops.WOOD_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "wood_seeds");
    public static final Item COAL_SEEDS = register(new Tier3(Crops.COAL_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "coal_seeds");
    public static final Item COPPER_SEEDS = register(new Tier3(Crops.COPPER_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "copper_seeds");
    public static final Item IRON_SEEDS = register(new Tier3(Crops.IRON_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "iron_seeds");
    public static final Item GOLD_SEEDS = register(new Tier4(Crops.GOLD_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "gold_seeds");
    public static final Item LAPIS_SEEDS = register(new Tier4(Crops.LAPIS_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "lapis_seeds");
    public static final Item REDSTONE_SEEDS = register(new Tier4(Crops.REDSTONE_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "redstone_seeds");
    public static final Item QUARTZ_SEEDS = register(new Tier4(Crops.QUARTZ_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "quartz_seeds");
    public static final Item GLOWSTONE_SEEDS = register(new Tier4(Crops.GLOWSTONE_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "glowstone_seeds");
    public static final Item FIRE_SEEDS = register(new Tier4(Crops.FIRE_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "fire_seeds");

    public static final Item OBSIDIAN_SEEDS = register(new Tier5(Crops.OBSIDIAN_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "obsidian_seeds");
    public static final Item DIAMOND_SEEDS = register(new Tier5(Crops.DIAMOND_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "diamond_seeds");
    public static final Item EMERALD_SEEDS = register(new Tier5(Crops.EMERALD_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "emerald_seeds");
    public static final Item NETHERITE_SEEDS = register(new Tier5(Crops.NETHERITE_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "netherite_seeds");
    public static final Item STAR_SEEDS = register(new Tier5(Crops.STAR_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "star_seeds");
    public static final Item WITHER_SEEDS = register(new Tier5(Crops.WITHER_CROP, new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "wither_seeds");
    public static final Item DIRT_FRUIT = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "dirt_fruit");
    public static final Item STONE_FRUIT = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "stone_fruit");
    public static final Item WOOD_FRUIT = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "wood_fruit");
    public static final Item COAL_FRUIT = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "coal_fruit");
    public static final Item COPPER_FRUIT = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "copper_fruit");
    public static final Item IRON_FRUIT = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "iron_fruit");
    public static final Item GOLD_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "gold_fruit");
    public static final Item LAPIS_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "lapis_fruit");
    public static final Item REDSTONE_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "redstone_fruit");
    public static final Item QUARTZ_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "quartz_fruit");
    public static final Item GLOWSTONE_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "glowstone_fruit");
    public static final Item FIRE_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "fire_fruit");
    public static final Item DIAMOND_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "diamond_fruit");
    public static final Item EMERALD_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "emerald_fruit");
    public static final Item OBSIDIAN_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "obsidian_fruit");
    public static final Item NETHERITE_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "netherite_fruit");
    public static final Item STAR_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "star_fruit");
    public static final Item WITHER_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "wither_fruit");
    public static final Item DIRT_ESSENCE = register("dirt_essence");
    public static final Item STONE_ESSENCE = register("stone_essence");
    public static final Item WOOD_ESSENCE = register("wood_essence");
    public static final Item COAL_ESSENCE = register("coal_essence");
    public static final Item GOLD_ESSENCE = register("gold_essence");
    public static final Item IRON_ESSENCE = register("iron_essence");
    public static final Item COPPER_ESSENCE = register("copper_essence");
    public static final Item NETHERITE_ESSENCE = register("netherite_essence");
    public static final Item OBSIDIAN_ESSENCE = register("obsidian_essence");
    public static final Item QUARTZ_ESSENCE = register("quartz_essence");
    public static final Item GLOWSTONE_ESSENCE = register("glowstone_essence");
    public static final Item FIRE_ESSENCE = register("fire_essence");
    public static final Item LAPIS_ESSENCE = register("lapis_essence");
    public static final Item REDSTONE_ESSENCE = register("redstone_essence");
    public static final Item DIAMOND_ESSENCE = register("diamond_essence");
    public static final Item EMERALD_ESSENCE = register("emerald_essence");
    public static final Item WITHER_ESSENCE = register("wither_essence");
    public static final Item STAR_ESSENCE = register("star_essence");
    public static final Item DIRT_PLATE = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "dirt_plate");
    public static final Item STONE_PLATE = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "stone_plate");
    public static final Item WOOD_PLATE = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "wood_plate");
    public static final Item GRAVEL_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "gravel_plate");
    public static final Item SAND_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "sand_plate");
    public static final Item CLAY_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "clay_plate");
    public static final Item SNOW_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "snow_plate");
    public static final Item SOUL_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "soul_plate");
    private static Item register(String name) {
        return register(new BaseItem(p -> p.group(ModItemGroupMinecraft.ITEMGROUP)), name);
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
