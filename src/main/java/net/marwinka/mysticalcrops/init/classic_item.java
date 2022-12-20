package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.items.*;
import net.marwinka.mysticalcrops.items.tools.*;
import net.marwinka.mysticalcrops.util.block.BaseItem;
import net.marwinka.mysticalcrops.util.group.ModItemGroup;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.util.group.ModItemGroupClassic;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class classic_item {
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

    public static final Item ESSENCE_SEEDS_TIER_1 = register(new Tier1(Crops.ESSENCE_CROP_TIER_1, new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "essence_seeds_tier_1");
    public static final Item ESSENCE_SEEDS_TIER_2 = register(new Tier2(Crops.ESSENCE_CROP_TIER_2, new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "essence_seeds_tier_2");
    public static final Item ESSENCE_SEEDS_TIER_3 = register(new Tier3(Crops.ESSENCE_CROP_TIER_3, new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "essence_seeds_tier_3");
    public static final Item ESSENCE_SEEDS_TIER_4 = register(new Tier4(Crops.ESSENCE_CROP_TIER_4, new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "essence_seeds_tier_4");
    public static final Item ESSENCE_SEEDS_TIER_5 = register(new Tier5(Crops.ESSENCE_CROP_TIER_5, new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "essence_seeds_tier_5");
    public static final Item ESSENCE_FRUIT_TIER_1 = register(new ItemTier1(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_1");
    public static final Item ESSENCE_FRUIT_TIER_2 = register(new ItemTier2(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_2");
    public static final Item ESSENCE_FRUIT_TIER_3 = register(new ItemTier3(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_3");
    public static final Item ESSENCE_FRUIT_TIER_4 = register(new ItemTier4(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_4");
    public static final Item ESSENCE_FRUIT_TIER_5 = register(new ItemTier5(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "essence_fruit_tier_5");
    public static final Item CRAFT_SEEDS = register(new ItemTier0(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "craft_seeds");
    public static final Item CRAFT_SEEDS_TIER_2 = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "craft_seeds_tier_2");
    public static final Item CRAFT_SEEDS_TIER_3 = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "craft_seeds_tier_3");
    public static final Item CRAFT_SEEDS_TIER_4 = register(new ItemTier4(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "craft_seeds_tier_4");
    public static final Item CRAFT_SEEDS_TIER_5 = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "craft_seeds_tier_5");
    public static final Item BASIC_ESSENCE = register("basic_essence");
    public static final Item UNCOMMON_ESSENCE = register("uncommon_essence");
    public static final Item ADVANCE_ESSENCE = register("advance_essence");
    public static final Item ULTRA_ESSENCE = register("ultra_essence");
    public static final Item ULTIMATE_ESSENCE = register("ultimate_essence");
    public static final Item CRYSTAL_FRAGMENTS = register("crystal_fragments");
    public static final Item DARK_CRYSTAL = register("dark_crystal");
    public static final Item WITHER_SOUL = register(new Souls(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)),"wither_soul");
    public static final Item EMPTY_CRYSTAL = register("empty_crystal");
    public static final Item WITHER_CRYSTAL = register("wither_crystal");
    public static final Item BASIC_COAL = register(new CoalTier1(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "basic_coal");
    public static final Item UNCOMMON_COAL = register(new CoalTier2(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "uncommon_coal");
    public static final Item ADVANCE_COAL = register(new CoalTier3(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "advance_coal");
    public static final Item ULTRA_COAL = register(new CoalTier4(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "ultra_coal");
    public static final Item ULTIMATE_COAL = register(new CoalTier5(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP)), "ultimate_coal");
    public static final Item BASIC_CRYSTAL = register(new Crystal(CrystalDurability.CRYSTAL,0,0,new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "basic_crystal");
    public static final Item UNCOMMON_CRYSTAL = register(new CrystalUncommon(CrystalUNCOMMONDurability.UNCOMMON_CRYSTALS,0,0,new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "uncommon_crystal");
    public static final Item ADVANCE_CRYSTAL = register(new Crystaladvance(CrystalADVANCEdurability.ADVANCE_CRYSTALS,0,0,new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "advance_crystal");
    public static final Item ULTRA_CRYSTAL = register(new CrystalUltra(CrystalULTRAdurability.ULTRA_CRYSTALS,0,0,new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "ultra_crystal");
    public static final Item ULTIMATE_CRYSTAL = register(new CrystalUltimate(CrystalULTIMATEdurability.ULTIMATE_CRYSTALS,0,0,new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "ultimate_crystal");
    public static final Item INFINITY_CRYSTAL = register(new CrystalInfinity(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "infinity_crystal");
    public static final Item IRON_KNIFE = register(new Knife(ToolMaterials.IRON,0,-3,new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "iron_knife");
    public static final Item DIAMOND_KNIFE = register(new Knife(ToolMaterials.DIAMOND,0,-3,new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "diamond_knife");
    public static final Item NETHERITE_KNIFE = register(new Knife(ToolMaterials.NETHERITE,0,-3,new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1)), "netherite_knife");
    public static final Item WATERING_CAN = register( new wateringcan(p -> p.group(ModItemGroupClassic.ITEMGROUP)), "watering_can");

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
    }
}
