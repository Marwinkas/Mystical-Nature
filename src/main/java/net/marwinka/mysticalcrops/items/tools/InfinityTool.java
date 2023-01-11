package net.marwinka.mysticalcrops.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.util.group.ModItemGroupClassic;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class InfinityTool extends SwordItem {
    public InfinityTool(ToolMaterial toolMaterial) {
        super(toolMaterial, 0, 0, new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP).maxCount(1));
    }
    @Override
    public boolean isDamageable() {
        return false;
    }
}
