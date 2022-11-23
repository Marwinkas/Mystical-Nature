package net.marwinka.mysticalcrops.util.inventory;

import net.marwinka.mysticalcrops.init.Items;
import net.marwinka.mysticalcrops.init.itemfromothermods.OtherCrops;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class FruitSlot extends Slot {

    public FruitSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        if(stack.getItem() == Items.COAL_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.COPPER_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.DIAMOND_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.EMERALD_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_1){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_2){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_3){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_4){
            return true;
        }
        if(stack.getItem() == Items.ESSENCE_FRUIT_TIER_5){
            return true;
        }
        if(stack.getItem() == Items.IRON_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.GOLD_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.LAPIS_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.OBSIDIAN_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.QUARTZ_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.DIRT_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.STONE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.WOOD_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.GLOWSTONE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.FIRE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.REDSTONE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.NETHERITE_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.STAR_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.WITHER_FRUIT){
            return true;
        }
        if(stack.getItem() == Items.ECHO_FRUIT){
            return true;
        }
        if(stack.getItem() == OtherCrops.GOBBER_GLOB.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.END_GOBBER_GLOB.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.ZINC.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.BRASS.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.FLUIX.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.CERTUS.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.TITANIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.NIKOLITE.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.NICKEL.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.TUNGSTEN.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.TUNGSTENSTEEL.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.STEEL.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.LEAD.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.TIN.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.ELECTRUM.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.CHROMIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.CALORITE.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.ALUMINIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.INVAR.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.ADVANCED_ALLOY.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.REFINED_IRON.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.PLATINUM.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.IRIDIUM.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.RUBBER.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.WATER.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.NETHER.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.AMETHYST.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.SAND.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.GRAVEL.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.SNOW.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.DYE.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.ENDER.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.END.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.CLAY.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.NATURE.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.PRISMARINE.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.SOUL.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.AIR.getFruits()){
            return true;
        }

        if(stack.getItem() == OtherCrops.BRONZE.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.SILVER.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.DESH.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.OSTRUM.getFruits()){
            return true;
        }
        if(stack.getItem() == OtherCrops.NETHER_GOBBER_GLOB.getFruits()){
            return true;
        }
        return false;
    }
}