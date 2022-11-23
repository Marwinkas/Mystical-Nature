package net.marwinka.mysticalcrops.util.group;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.init.Crops;
import net.marwinka.mysticalcrops.init.Items;
import net.marwinka.mysticalcrops.init.itemfromothermods.OtherCrops;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroupOtherMods {
    public static final ItemGroup ITEMGROUP = FabricItemGroupBuilder.build(
            new Identifier(MysticalCrops.MOD_ID, "mysticalcropsothermods"), () -> new ItemStack(Items.EMERALD_FRUIT));
}
