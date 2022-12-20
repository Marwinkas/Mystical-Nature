package net.marwinka.mysticalcrops.init;

import net.marwinka.mysticalcrops.util.block.Crop;
import net.fabricmc.loader.api.FabricLoader;
import net.marwinka.mysticalcrops.util.block.*;
import net.marwinka.mysticalcrops.util.block.Crop;
import net.marwinka.mysticalcrops.util.group.ModItemGroupMinecraft;
import net.marwinka.mysticalcrops.util.group.ModItemGroupOtherMods;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

import static net.marwinka.mysticalcrops.MysticalCrops.MOD_ID;

public class new_system_seed {
    private static final List<Crop> crops = new ArrayList<>();
    public static final Crop WATER = register(withRequiredMods(new Crop("water",  "2"), "minecraft"));
    public static final Crop AIR = register(withRequiredMods(new Crop("air",  "2"), "minecraft"));
    public static final Crop NETHER = register(withRequiredMods(new Crop("nether",  "3"), "minecraft"));
    public static final Crop AMETHYST = register(withRequiredMods(new Crop("amethyst",  "4"), "minecraft"));
    public static final Crop SAND = register(withRequiredMods(new Crop("sand",  "3"), "minecraft"));
    public static final Crop GRAVEL = register(withRequiredMods(new Crop("gravel",  "3"), "minecraft"));
    public static final Crop SNOW = register(withRequiredMods(new Crop("snow",  "3"), "minecraft"));
    public static final Crop DYE = register(withRequiredMods(new Crop("dye",  "4"), "minecraft"));
    public static final Crop ENDER = register(withRequiredMods(new Crop("ender",  "4"), "minecraft"));
    public static final Crop END = register(withRequiredMods(new Crop("end",  "4"), "minecraft"));
    public static final Crop CLAY = register(withRequiredMods(new Crop("clay",  "3"), "minecraft"));
    public static final Crop NATURE = register(withRequiredMods(new Crop("nature",  "4"), "minecraft"));
    public static final Crop PRISMARINE = register(withRequiredMods(new Crop("prismarine",  "3"), "minecraft"));
    public static final Crop SOUL = register(withRequiredMods(new Crop("soul",  "3"), "minecraft"));
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
