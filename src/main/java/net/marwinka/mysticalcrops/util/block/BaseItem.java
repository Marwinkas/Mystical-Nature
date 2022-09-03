package net.marwinka.mysticalcrops.util.block;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

import java.util.function.Function;

public class BaseItem extends Item {
    public BaseItem(Function<Settings, Settings> properties) {
        super(properties.apply(new Settings()));
    }

    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> items) {
            super.appendStacks(group, items);
    }
}
