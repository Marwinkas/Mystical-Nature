package net.marwinka.mysticalcrops.registry;

import net.marwinka.mysticalcrops.util.block.*;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

import static net.marwinka.mysticalcrops.MysticalCrops.ITEMGROUPVANILLA;

public class ModVanillaItems {
    public static final List<Crop> crops = new ArrayList<>();
    public static final Crop FIRE = register(new Crop("fire",  2));
    public static final Crop WATER = register(new Crop("water",  2));
    public static final Crop AIR = register(new Crop("air",  2));
    public static final Crop DIRT = register(new Crop("dirt",  2));
    public static final Crop STONE = register(new Crop("stone",  2));
    public static final Crop WOOD = register(new Crop("wood",  2));
    public static final Crop COAL = register(new Crop("coal",  3));
    public static final Crop COPPER = register(new Crop("copper",  3));
    public static final Crop IRON = register(new Crop("iron",  3));
    public static final Crop NETHER = register(new Crop("nether",  3));
    public static final Crop SAND = register(new Crop("sand",  3));
    public static final Crop GRAVEL = register(new Crop("gravel",  3));
    public static final Crop SNOW = register(new Crop("snow",  3));
    public static final Crop CLAY = register(new Crop("clay",  3));
    public static final Crop PRISMARINE = register(new Crop("prismarine",  3));
    public static final Crop SOUL = register(new Crop("soul",  3));
    public static final Crop AMETHYST = register(new Crop("amethyst",  4));
    public static final Crop GOLD = register(new Crop("gold",  4));
    public static final Crop LAPIS = register(new Crop("lapis",  4));
    public static final Crop REDSTONE = register(new Crop("redstone",  4));
    public static final Crop QUARTZ = register(new Crop("quartz",  4));
    public static final Crop GLOWSTONE = register(new Crop("glowstone",  4));
    public static final Crop DYE = register(new Crop("dye",  4));
    public static final Crop ENDER = register(new Crop("ender",  4));
    public static final Crop END = register(new Crop("end",  4));
    public static final Crop NATURE = register(new Crop("nature",  4));
    public static final Crop COW = register(new Crop("cow",  4));
    public static final Crop CHICKEN = register(new Crop("chicken",  4));
    public static final Crop SHEEP = register(new Crop("sheep",  4));
    public static final Crop OBSIDIAN = register(new Crop("obsidian",  5));
    public static final Crop DIAMOND = register(new Crop("diamond",  5));
    public static final Crop EMERALD = register(new Crop("emerald",  5));
    public static final Crop NETHERITE = register(new Crop("netherite",  5));
    public static final Crop STAR = register(new Crop("star",  5));
    public static final Crop WITHER = register(new Crop("wither",  5));
    
    public static Crop register(Crop crop) {
        crops.add(crop);
        return crop;
    }
    public static void registerBlocks() {
        crops.forEach(c -> {
            CropBlock defaultCrop;

            defaultCrop = new MysticalCropBlock( c);
            c.setCrop(() -> defaultCrop);

            Registry.register(Registry.BLOCK, new ModIdentifier(c.getId() + "_crop"), defaultCrop);
        });
    }
    public static void registerItems() {
        crops.forEach(c -> {

            Item defaultEssence;
            defaultEssence = new MysticalEssenceItem(c, p -> p.group(ITEMGROUPVANILLA));
            c.setEssence(() -> defaultEssence);
            Registry.register(Registry.ITEM, new ModIdentifier(c.getId() + "_essence"), defaultEssence);

            Item defaultfruit;
            defaultfruit = new MysticalFruitItem(c, p -> p.group(ITEMGROUPVANILLA));
            c.setFruit(() -> defaultfruit);
            Registry.register(Registry.ITEM, new ModIdentifier(c.getId() + "_fruit"), defaultfruit);

            AliasedBlockItem defaultSeeds;
            defaultSeeds = new MysticalSeedItem(c, p -> p.group(ITEMGROUPVANILLA));
            c.setSeeds(() -> defaultSeeds);
            Registry.register(Registry.ITEM, new ModIdentifier(c.getId() + "_seeds"), defaultSeeds);
        });
    }
}
