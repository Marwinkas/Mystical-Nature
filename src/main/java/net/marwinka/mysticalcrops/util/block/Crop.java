package net.marwinka.mysticalcrops.util.block;


import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import java.util.function.Supplier;

import static net.marwinka.mysticalcrops.MysticalCrops.MOD_ID;

public class Crop {

    private final String id;
    private final String tier;
    private int essenceColor;
    private int flowerColor;
    private int seedColor;
    private Supplier<? extends CropBlock> crop;
    private Supplier<? extends Item> essence;
    private Supplier<? extends Item> fruit;
    private Supplier<? extends AliasedBlockItem> seeds;
    private boolean enabled;

    public Crop(String id, String tier) {
        this.id = id;
        this.enabled = true;
        this.tier = tier;
    }

    public String getId() {
        return this.id;
    }
    public String getTier() {
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

    public void setFlowerColor(int color) {
        this.flowerColor = color;
    }

    public void setEssenceColor(int color) {
        this.essenceColor = color;
    }

    public void setSeedColor(int color) {
        this.seedColor = color;
    }

    public Crop setColor(int color) {
        this.setFlowerColor(color);
        this.setEssenceColor(color);
        this.setSeedColor(color);

        return this;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public Crop setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }


    public Text getDisplayName() {
        return new TranslatableText(String.format("crop.%s.%s", MOD_ID, getId()));
    }


}
