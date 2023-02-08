package net.marwinka.mysticalcrops.registry;

import net.marwinka.mysticalcrops.util.block.Crop;
import net.marwinka.mysticalcrops.util.block.MysticalCropBlock;
import net.marwinka.mysticalcrops.util.block.MysticalFruitItem;
import net.marwinka.mysticalcrops.util.block.MysticalSeedItem;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

import static net.marwinka.mysticalcrops.MysticalCrops.ITEMGROUPVANILLA;

public class ModCrops {
    private static final List<Crop> crops = new ArrayList<>();
    public static final Crop ESSENCE_TIER_1 = register(new Crop("essence_tier_1",  1));
    public static final Crop ESSENCE_TIER_2 = register(new Crop("essence_tier_2",  2));
    public static final Crop ESSENCE_TIER_3 = register(new Crop("essence_tier_3",  3));
    public static final Crop ESSENCE_TIER_4 = register(new Crop("essence_tier_4",  4));
    public static final Crop ESSENCE_TIER_5 = register(new Crop("essence_tier_5",  5));

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
