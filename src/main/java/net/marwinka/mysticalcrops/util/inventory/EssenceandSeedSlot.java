package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.Items;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MinecartItem;
import net.minecraft.screen.slot.Slot;

public class EssenceandSeedSlot extends Slot {

    public EssenceandSeedSlot(Inventory inventory, int index, int x, int y) {
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
        if(stack.getItem() == net.minecraft.item.Items.BEETROOT_SEEDS){
            return true;
        }
        if(stack.getItem() == net.minecraft.item.Items.MELON_SEEDS){
            return true;
        }
        if(stack.getItem() == net.minecraft.item.Items.PUMPKIN_SEEDS){
            return true;
        }
        if(stack.getItem() == net.minecraft.item.Items.WHEAT_SEEDS){
            return true;
        }
        if(stack.getItem() == net.minecraft.item.Items.COCOA_BEANS){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_1){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_2){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_3){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_4){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_SEEDS_TIER_5){
            return true;
        }
        return false;
    }
}