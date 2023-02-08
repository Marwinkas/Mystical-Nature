package net.marwinka.mysticalcrops.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.marwinka.mysticalcrops.MysticalCrops.ITEMGROUPCLASSIC;

public class EssenceTool extends SwordItem {
    public EssenceTool(ToolMaterial toolMaterial) {
        super(toolMaterial, 0, 0, new FabricItemSettings().group(ITEMGROUPCLASSIC).maxCount(1));
    }
    @Override
    public boolean isDamageable() {
        return true;
    }
}
