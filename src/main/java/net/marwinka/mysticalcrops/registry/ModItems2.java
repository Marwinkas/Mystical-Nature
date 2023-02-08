package net.marwinka.mysticalcrops.registry;

import net.marwinka.mysticalcrops.util.block.BaseItem;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

import static net.marwinka.mysticalcrops.MysticalCrops.ITEMGROUPVANILLA;
public class ModItems2 {
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();
    public static final Item DIRT_PLATE = register("dirt_plate");
    public static final Item STONE_PLATE = register("stone_plate");
    public static final Item WOOD_PLATE = register("wood_plate");
    public static final Item GRAVEL_PLATE = register("gravel_plate");
    public static final Item SAND_PLATE = register("sand_plate");
    public static final Item CLAY_PLATE = register("clay_plate");
    public static final Item SNOW_PLATE = register("snow_plate");
    public static final Item SOUL_PLATE = register("soul_plate");
    private static Item register(String name) {
        return register(new BaseItem(p -> p.group(ITEMGROUPVANILLA)), name);
    }
    private static Item register(Item item, String name) {
        ITEMS.put(item, new ModIdentifier(name));
        return item;
    }
    public static void registerItems() {
        ITEMS.forEach((item, id) -> Registry.register(Registry.ITEM, id, item));
    }
}
