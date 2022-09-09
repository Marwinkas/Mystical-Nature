package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.Items;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class NoSeedSlot extends Slot {

    public NoSeedSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.getItem() == net.minecraft.item.Items.BEETROOT_SEEDS){
            return false;
        }
        if(stack.getItem() == net.minecraft.item.Items.MELON_SEEDS){
            return false;
        }
        if(stack.getItem() == net.minecraft.item.Items.PUMPKIN_SEEDS){
            return false;
        }
        if(stack.getItem() == net.minecraft.item.Items.WHEAT_SEEDS){
            return false;
        }
        if(stack.getItem() == net.minecraft.item.Items.COCOA_BEANS){
            return false;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_1){
            return false;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_2){
            return false;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_3){
            return false;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_4){
            return false;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_5){
            return false;
        }
        return true;
    }
}