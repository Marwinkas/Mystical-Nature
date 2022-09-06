package net.marwinka.mysticalcrops.init.itemfromothermods;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.init.Crops;
import net.marwinka.mysticalcrops.items.*;
import net.marwinka.mysticalcrops.util.block.BaseItem;
import net.marwinka.mysticalcrops.util.group.ModItemGroup;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.items.tools.Knife;
import net.marwinka.mysticalcrops.util.group.ModItemGroupOtherMods;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class OtherItems {
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();

    public static final Item GOBBER_GLOB_SEEDS = register(new Tier4(OtherCrops.GOBBER_GLOB_CROP, new FabricItemSettings().group(ModItemGroupOtherMods.ITEMGROUP)), "gobber_glob_seeds");
    public static final Item NETHER_GOBBER_GLOB_SEEDS = register(new Tier5(OtherCrops.NETHER_GOBBER_GLOB_CROP, new FabricItemSettings().group(ModItemGroupOtherMods.ITEMGROUP)), "nether_gobber_glob_seeds");
    public static final Item END_GOBBER_GLOB_SEEDS = register(new Tier5(OtherCrops.END_GOBBER_GLOB_CROP, new FabricItemSettings().group(ModItemGroupOtherMods.ITEMGROUP)), "end_gobber_glob_seeds");

    public static final Item GOBBER_GLOB_FRUIT = register(new ItemTier4(new FabricItemSettings().group(ModItemGroupOtherMods.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "gobber_glob_fruit");
    public static final Item NETHER_GOBBER_GLOB_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupOtherMods.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "nether_gobber_glob_fruit");
    public static final Item END_GOBBER_GLOB_FRUIT = register(new ItemTier5(new FabricItemSettings().group(ModItemGroupOtherMods.ITEMGROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())), "end_gobber_glob_fruit");

    public static final Item GOBBER_GLOB_ESSENCE = register("gobber_glob_essence");
    public static final Item NETHER_GOBBER_GLOB_ESSENCE = register("nether_gobber_glob_essence");
    public static final Item END_GOBBER_GLOB_ESSENCE = register("end_gobber_glob_essence");
    private static Item register(String name) {
        return register(new BaseItem(p -> p.group(ModItemGroupOtherMods.ITEMGROUP)), name);
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
