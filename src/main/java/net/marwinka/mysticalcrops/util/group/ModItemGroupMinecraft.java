package net.marwinka.mysticalcrops.util.group;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.init.Items;
import net.marwinka.mysticalcrops.init.new_system_seed;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroupMinecraft {
    public static final ItemGroup ITEMGROUP = FabricItemGroupBuilder.build(
            new Identifier(MysticalCrops.MOD_ID, "mysticalcropsminecraft"), () -> new ItemStack(new_system_seed.DYE.getEssence()));
}
