package net.marwinka.mysticalcrops.block.Chests;

import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.init.ModBlockChest;
import net.marwinka.mysticalcrops.util.group.ModItemGroupClassic;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ChestBlockItem {
    public static final BlockItem COMMON_CHEST = new BlockItem(ModBlockChest.COMMON_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final BlockItem UNCOMMON_CHEST = new BlockItem(ModBlockChest.UNCOMMON_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final BlockItem WONDERFUL_CHEST = new BlockItem(ModBlockChest.WONDERFUL_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final BlockItem EXCELLENT_CHEST = new BlockItem(ModBlockChest.EXCELLENT_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static final BlockItem PERFECT_CHEST = new BlockItem(ModBlockChest.PERFECT_CHEST, new Item.Settings().group(ModItemGroupClassic.ITEMGROUP));
    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "common_chest"), COMMON_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "uncommon_chest"), UNCOMMON_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "wonderful_chest"), WONDERFUL_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "excellent_chest"), EXCELLENT_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, "perfect_chest"), PERFECT_CHEST);
    }
}
