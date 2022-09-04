package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.items.EssenceFruitTier1;
import net.marwinka.mysticalcrops.items.EssenceSeedsTier1;
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

public class Items {
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

    public static final Item ESSENCE_SEEDS_TIER_1 = register(new EssenceSeedsTier1(Crops.ESSENCE_CROP_TIER_1, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "essence_seeds_tier_1");
    public static final Item DIAMOND_SEEDS = register(new AliasedBlockItem(Crops.DIAMOND_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "diamond_seeds");
    public static final Item EMERALD_SEEDS = register(new AliasedBlockItem(Crops.EMERALD_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "emerald_seeds");
    public static final Item GOLD_SEEDS = register(new AliasedBlockItem(Crops.GOLD_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "gold_seeds");
    public static final Item LAPIS_SEEDS = register(new AliasedBlockItem(Crops.LAPIS_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "lapis_seeds");
    public static final Item REDSTONE_SEEDS = register(new AliasedBlockItem(Crops.REDSTONE_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "redstone_seeds");
    public static final Item IRON_SEEDS = register(new AliasedBlockItem(Crops.IRON_CROP, new FabricItemSettings().group(ModItemGroup.ITEMGROUP)), "iron_seeds");

    public static final Item ESSENCE_FRUIT_TIER_1 = register(new EssenceFruitTier1(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_1");
    public static final Item DIAMOND_FRUIT = register(new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "diamond_fruit");
    public static final Item EMERALD_FRUIT = register(new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "emerald_fruit");
    public static final Item GOLD_FRUIT = register(new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "gold_fruit");
    public static final Item LAPIS_FRUIT = register(new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "lapis_fruit");
    public static final Item REDSTONE_FRUIT = register(new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "redstone_fruit");
    public static final Item IRON_FRUIT = register(new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "iron_fruit");

    public static final Item BASIC_ESSENCE = register("basic_essence");
    public static final Item UNCOMMON_ESSENCE = register("uncommon_essence");
    public static final Item ADVANCE_ESSENCE = register("advance_essence");
    public static final Item ULTRA_ESSENCE = register("ultra_essence");
    public static final Item ULTIMATE_ESSENCE = register("ultimate_essence");

    public static final Item DIAMOND_ESSENCE = register("diamond_essence");
    public static final Item EMERALD_ESSENCE = register("emerald_essence");
    public static final Item GOLD_ESSENCE = register("gold_essence");
    public static final Item LAPIS_ESSENCE = register("lapis_essence");
    public static final Item REDSTONE_ESSENCE = register("redstone_essence");
    public static final Item IRON_ESSENCE = register("iron_essence");

    public static final Item CRYSTAL = register(new Crystal(ToolMaterials.IRON,0,0,new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)), "crystal");
    public static final Item IRON_KNIFE = register(new Knife(ToolMaterials.IRON,0,0,new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)), "iron_knife");
    public static final Item DIAMOND_KNIFE = register(new Knife(ToolMaterials.DIAMOND,0,0,new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)), "diamond_knife");
    public static final Item NETHERITE_KNIFE = register(new Knife(ToolMaterials.NETHERITE,0,0,new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)), "netherite_knife");

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
