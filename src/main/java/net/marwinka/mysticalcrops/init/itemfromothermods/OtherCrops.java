package net.marwinka.mysticalcrops.init.itemfromothermods;

import net.fabricmc.loader.api.FabricLoader;
import net.marwinka.mysticalcrops.util.block.*;
import net.marwinka.mysticalcrops.util.block.Crop;
import net.marwinka.mysticalcrops.util.group.ModItemGroupOtherMods;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

import static net.marwinka.mysticalcrops.MysticalCrops.MOD_ID;

public class OtherCrops {
    private static final List<Crop> crops = new ArrayList<>();
    public static final Crop WATER = register(withRequiredMods(new Crop("water",  "2"), "minecraft"));
    public static final Crop AIR = register(withRequiredMods(new Crop("air",  "2"), "minecraft"));
    public static final Crop NETHER = register(withRequiredMods(new Crop("nether",  "3"), "minecraft"));
    public static final Crop RUBBER = register(withRequiredMods(new Crop("rubber",  "2"), "techreborn"));
    public static final Crop GOBBER_GLOB = register(withRequiredMods(new Crop("gobber_glob",  "3"), "gobber2"));
    public static final Crop NETHER_GOBBER_GLOB = register(withRequiredMods(new Crop("nether_gobber_glob",  "4"), "gobber2"));
    public static final Crop END_GOBBER_GLOB = register(withRequiredMods(new Crop("end_gobber_glob",  "4"), "gobber2"));
    public static final Crop ZINC = register(withRequiredMods(new Crop("zinc",  "3"), "create","techreborn"));
    public static final Crop BRASS = register(withRequiredMods(new Crop("brass",  "4"), "create","techreborn"));
    public static final Crop CERTUS = register(withRequiredMods(new Crop("certus",  "3"), "ae2"));
    public static final Crop FLUIX = register(withRequiredMods(new Crop("fluix",  "4"), "ae2"));
    public static final Crop NIKOLITE = register(withRequiredMods(new Crop("nikolite",  "3"), "indrev"));
    public static final Crop NICKEL = register(withRequiredMods(new Crop("nickel",  "3"), "modern_industrialization","techreborn"));
    public static final Crop REFINED_IRON = register(withRequiredMods(new Crop("refined_iron",  "3"), "techreborn"));
    public static final Crop TIN = register(withRequiredMods(new Crop("tin",  "3"), "modern_industrialization","techreborn","indrev"));
    public static final Crop LEAD = register(withRequiredMods(new Crop("lead",  "3"), "modern_industrialization","techreborn","indrev"));
    public static final Crop ALUMINIUM = register(withRequiredMods(new Crop("aluminium",  "3"), "modern_industrialization","techreborn"));
    public static final Crop TITANIUM = register(withRequiredMods(new Crop("titanium",  "4"), "modern_industrialization","techreborn"));
    public static final Crop STEEL = register(withRequiredMods(new Crop("steel",  "4"), "ad_astra","modern_industrialization","techreborn","indrev"));
    public static final Crop ELECTRUM = register(withRequiredMods(new Crop("electrum",  "4"), "modern_industrialization","techreborn","indrev"));
    public static final Crop INVAR = register(withRequiredMods(new Crop("invar",  "4"), "modern_industrialization","techreborn"));
    public static final Crop ADVANCED_ALLOY = register(withRequiredMods(new Crop("advanced_alloy",  "4"), "techreborn"));
    public static final Crop PLATINUM = register(withRequiredMods(new Crop("platinum",  "4"), "modern_industrialization","techreborn"));
    public static final Crop BRONZE = register(withRequiredMods(new Crop("bronze",  "4"), "modern_industrialization","techreborn","indrev"));
    public static final Crop SILVER = register(withRequiredMods(new Crop("silver",  "4"), "modern_industrialization","techreborn","indrev"));
    public static final Crop CHROMIUM = register(withRequiredMods(new Crop("chromium",  "5"), "modern_industrialization","techreborn"));
    public static final Crop TUNGSTEN = register(withRequiredMods(new Crop("tungsten",  "5"), "modern_industrialization","techreborn","indrev"));
    public static final Crop TUNGSTENSTEEL = register(withRequiredMods(new Crop("tungstensteel",  "5"), "techreborn"  ));
    public static final Crop IRIDIUM = register(withRequiredMods(new Crop("iridium",  "5"), "modern_industrialization","techreborn"));
    public static final Crop DESH = register(withRequiredMods(new Crop("desh",  "4"), "ad_astra"));
    public static final Crop OSTRUM = register(withRequiredMods(new Crop("ostrum",  "4"), "ad_astra"));
    public static final Crop CALORITE = register(withRequiredMods(new Crop("calorite",  "5"), "ad_astra"));

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
            defaultEssence = new MysticalEssenceItem(c, p -> p.group(ModItemGroupOtherMods.ITEMGROUP));
            c.setEssence(() -> defaultEssence);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, c.getId() + "_essence"), defaultEssence);

            Item defaultfruit;
            defaultfruit = new MysticalFruitItem(c, p -> p.group(ModItemGroupOtherMods.ITEMGROUP));
            c.setFruit(() -> defaultfruit);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, c.getId() + "_fruit"), defaultfruit);

            AliasedBlockItem defaultSeeds;
            defaultSeeds = new MysticalSeedItem(c, p -> p.group(ModItemGroupOtherMods.ITEMGROUP));
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