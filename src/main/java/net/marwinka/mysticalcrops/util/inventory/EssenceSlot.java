package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.Items;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class EssenceSlot extends Slot {

    public EssenceSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.getItem() == Items.BASIC_ESSENCE){
            return true;
        }
        if(stack.getItem() == Items.ADVANCE_ESSENCE){
            return true;
        }
        if(stack.getItem() == Items.UNCOMMON_ESSENCE){
            return true;
        }
        if(stack.getItem() == Items.ULTIMATE_ESSENCE){
            return true;
        }
        if(stack.getItem() == Items.ULTRA_ESSENCE){
            return true;
        }
        return false;
    }
}