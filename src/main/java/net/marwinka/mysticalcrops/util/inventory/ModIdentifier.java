package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.MysticalCrops;
import net.minecraft.util.Identifier;

public class ModIdentifier extends Identifier {
    public ModIdentifier(String path) {
        super(MysticalCrops.MOD_ID, path);
    }
}