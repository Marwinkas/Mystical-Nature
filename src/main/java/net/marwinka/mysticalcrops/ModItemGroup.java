package net.marwinka.mysticalcrops;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.marwinka.mysticalcrops.item.ModItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ITEMGROUP = FabricItemGroupBuilder.build(
            new Identifier(MysticalCrops.MOD_ID, "mysticalcrops"), () -> new ItemStack(ModItemRegister.DIAMOND_FRUIT));
}
