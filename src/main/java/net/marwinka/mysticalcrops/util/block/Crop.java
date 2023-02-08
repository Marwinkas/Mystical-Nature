package net.marwinka.mysticalcrops.util.block;

import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;

import java.util.function.Supplier;

public class Crop {
    private final String id;
    private final int tier;
    private Supplier<? extends CropBlock> crop;
    private Supplier<? extends Item> essence;
    private Supplier<? extends Item> fruit;
    private Supplier<? extends AliasedBlockItem> seeds;
    private boolean enabled;

    public Crop(String id, int tier) {
        this.id = id;
        this.enabled = true;
        this.tier = tier;
    }

    public String getId() {
        return this.id;
    }
    public int getTier() {
        return this.tier;
    }

    public CropBlock getCrop() {
        return this.crop == null ? null : this.crop.get();
    }

    public Item getEssence() {
        return this.essence == null ? null : this.essence.get();
    }

    public ItemConvertible getSeeds() {
        return this.seeds == null ? null : this.seeds.get();
    }

    public ItemConvertible getFruits() {
        return this.fruit == null ? null : this.fruit.get();
    }

    public Crop setCrop(Supplier<? extends CropBlock> crop) {
        this.crop = crop;
        return this;
    }

    public Crop setEssence(Supplier<? extends Item> essence) {
        this.essence = essence;
        return this;
    }
    public Crop setFruit(Supplier<? extends Item> fruit) {
        this.fruit = fruit;
        return this;
    }
    public void setSeeds(Supplier<? extends AliasedBlockItem> seeds) {
        this.seeds = seeds;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public Crop setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
