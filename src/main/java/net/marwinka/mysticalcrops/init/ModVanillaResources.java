package net.marwinka.mysticalcrops.init;

import net.marwinka.mysticalcrops.util.block.Crop;
import net.fabricmc.loader.api.FabricLoader;
import net.marwinka.mysticalcrops.util.block.*;
import net.marwinka.mysticalcrops.util.group.ModItemGroupMinecraft;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static net.marwinka.mysticalcrops.MysticalCrops.MOD_ID;

public class ModVanillaResources {
    private static final List<Crop> crops = new ArrayList<>();
    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();
    public static final Crop FIRE = register(withRequiredMods(new Crop("fire",  "2"), "minecraft"));
    public static final Crop WATER = register(withRequiredMods(new Crop("water",  "2"), "minecraft"));
    public static final Crop AIR = register(withRequiredMods(new Crop("air",  "2"), "minecraft"));
    public static final Crop DIRT = register(withRequiredMods(new Crop("dirt",  "2"), "minecraft"));
    public static final Crop STONE = register(withRequiredMods(new Crop("stone",  "2"), "minecraft"));
    public static final Crop WOOD = register(withRequiredMods(new Crop("wood",  "2"), "minecraft"));
    public static final Crop COAL = register(withRequiredMods(new Crop("coal",  "3"), "minecraft"));
    public static final Crop COPPER = register(withRequiredMods(new Crop("copper",  "3"), "minecraft"));
    public static final Crop IRON = register(withRequiredMods(new Crop("iron",  "3"), "minecraft"));
    public static final Crop NETHER = register(withRequiredMods(new Crop("nether",  "3"), "minecraft"));
    public static final Crop SAND = register(withRequiredMods(new Crop("sand",  "3"), "minecraft"));
    public static final Crop GRAVEL = register(withRequiredMods(new Crop("gravel",  "3"), "minecraft"));
    public static final Crop SNOW = register(withRequiredMods(new Crop("snow",  "3"), "minecraft"));
    public static final Crop CLAY = register(withRequiredMods(new Crop("clay",  "3"), "minecraft"));
    public static final Crop PRISMARINE = register(withRequiredMods(new Crop("prismarine",  "3"), "minecraft"));
    public static final Crop SOUL = register(withRequiredMods(new Crop("soul",  "3"), "minecraft"));
    public static final Crop AMETHYST = register(withRequiredMods(new Crop("amethyst",  "4"), "minecraft"));
    public static final Crop GOLD = register(withRequiredMods(new Crop("gold",  "4"), "minecraft"));
    public static final Crop LAPIS = register(withRequiredMods(new Crop("lapis",  "4"), "minecraft"));
    public static final Crop REDSTONE = register(withRequiredMods(new Crop("redstone",  "4"), "minecraft"));
    public static final Crop QUARTZ = register(withRequiredMods(new Crop("quartz",  "4"), "minecraft"));
    public static final Crop GLOWSTONE = register(withRequiredMods(new Crop("glowstone",  "4"), "minecraft"));
    public static final Crop DYE = register(withRequiredMods(new Crop("dye",  "4"), "minecraft"));
    public static final Crop ENDER = register(withRequiredMods(new Crop("ender",  "4"), "minecraft"));
    public static final Crop END = register(withRequiredMods(new Crop("end",  "4"), "minecraft"));
    public static final Crop NATURE = register(withRequiredMods(new Crop("nature",  "4"), "minecraft"));
    public static final Crop COW = register(withRequiredMods(new Crop("cow",  "4"), "minecraft"));
    public static final Crop CHICKEN = register(withRequiredMods(new Crop("chicken",  "4"), "minecraft"));
    public static final Crop SHEEP = register(withRequiredMods(new Crop("sheep",  "4"), "minecraft"));
    public static final Crop OBSIDIAN = register(withRequiredMods(new Crop("obsidian",  "5"), "minecraft"));
    public static final Crop DIAMOND = register(withRequiredMods(new Crop("diamond",  "5"), "minecraft"));
    public static final Crop EMERALD = register(withRequiredMods(new Crop("emerald",  "5"), "minecraft"));
    public static final Crop NETHERITE = register(withRequiredMods(new Crop("netherite",  "5"), "minecraft"));
    public static final Crop STAR = register(withRequiredMods(new Crop("star",  "5"), "minecraft"));
    public static final Crop WITHER = register(withRequiredMods(new Crop("wither",  "5"), "minecraft"));
    public static final Crop ECHO = register(withRequiredMods(new Crop("echo",  "5"), "minecraft"));
    public static Crop getCropById(String id) {
        return crops.stream().filter(c -> id.equals(c.getId())).findFirst().orElse(null);
    }
    public static Crop register(Crop crop) {
        if (crop.isEnabled())
            crops.add(crop);
        return crop;
    }
    public static void registerBlocks() {
        crops.forEach(c -> {
            CropBlock defaultCrop;

            defaultCrop = new MysticalCropBlock( c);
            c.setCrop(() -> defaultCrop);

            Registry.register(Registry.BLOCK, new Identifier(MOD_ID, c.getId() + "_crop"), defaultCrop);
        });
    }

    public static void registerItems() {
        crops.forEach(c -> {

            Item defaultEssence;
            defaultEssence = new MysticalEssenceItem(c, p -> p.group(ModItemGroupMinecraft.ITEMGROUP));
            c.setEssence(() -> defaultEssence);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, c.getId() + "_essence"), defaultEssence);

            Item defaultfruit;
            defaultfruit = new MysticalFruitItem(c, p -> p.group(ModItemGroupMinecraft.ITEMGROUP));
            c.setFruit(() -> defaultfruit);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, c.getId() + "_fruit"), defaultfruit);

            AliasedBlockItem defaultSeeds;
            defaultSeeds = new MysticalSeedItem(c, p -> p.group(ModItemGroupMinecraft.ITEMGROUP));
            c.setSeeds(() -> defaultSeeds);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, c.getId() + "_seeds"), defaultSeeds);
        });
    }
    private static Crop withRequiredMods(Crop crop, String... mods) {
        for (String mod : mods) {
            if (FabricLoader.getInstance().isModLoaded(mod))
                return crop.setEnabled(true);
        }
        return crop.setEnabled(false);
    }
}
