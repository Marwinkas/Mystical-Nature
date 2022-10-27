package net.marwinka.mysticalcrops.util.block;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static net.marwinka.mysticalcrops.MysticalCrops.MOD_ID;


public class CropType {

    private final String name;

    public CropType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}