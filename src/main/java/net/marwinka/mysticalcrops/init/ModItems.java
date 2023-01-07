package net.marwinka.mysticalcrops.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.items.*;
import net.marwinka.mysticalcrops.util.group.ModItemGroupMinecraft;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModItems {
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();
    public static final Item DIRT_PLATE = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "dirt_plate");
    public static final Item STONE_PLATE = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "stone_plate");
    public static final Item WOOD_PLATE = register(new ItemTier2(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "wood_plate");
    public static final Item GRAVEL_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "gravel_plate");
    public static final Item SAND_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "sand_plate");
    public static final Item CLAY_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "clay_plate");
    public static final Item SNOW_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "snow_plate");
    public static final Item SOUL_PLATE = register(new ItemTier3(new FabricItemSettings().group(ModItemGroupMinecraft.ITEMGROUP)), "soul_plate");
    private static Item register(Item item, String name) {
        Identifier id = new Identifier(MysticalCrops.MOD_ID, name);
        ITEMS.put(item, id);
        return item;
    }
    public static void registerItems() {
        ITEMS.forEach((item, id) -> Registry.register(Registry.ITEM, id, item));
    }
}
