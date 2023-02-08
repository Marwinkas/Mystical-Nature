package net.marwinka.mysticalcrops.block.entity;

import net.marwinka.mysticalcrops.recipe.InfusionRecipe;
import net.marwinka.mysticalcrops.registry.ModBlockEntities;
import net.marwinka.mysticalcrops.registry.ModRecipes;
import net.marwinka.mysticalcrops.screenhandler.InfusionHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class InfusionEntity extends AbstractTableEntity {
    public InfusionEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.INFUSION_TABLE, pos, state,100);
    }
    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new InfusionHandler(syncId, inv, this, this.propertyDelegate);
    }
    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {
        return slot == 5;
    }
    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        if (!stack.isStackable()) {
            return slot == 0;
        }
        else{
            if(slots != 4){
                slots++;
                return slot == slots;
            }
            else slots = 0;
        }
        return false;
    }
    public static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(5).getItem() == output || inventory.getStack(5).isEmpty();
    }

    public static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(5).getMaxCount() > inventory.getStack(5).getCount();
    }
    public void tick() {
        if (!this.world.isClient) {
            SimpleInventory inventory = new SimpleInventory(this.size());
            for (int i = 0; i < this.size(); i++) {
                inventory.setStack(i, this.getStack(i));
            }
            Optional<InfusionRecipe> recipe = this.getWorld().getRecipeManager()
                    .getFirstMatch(ModRecipes.INFUSE_RECIPE, inventory, this.getWorld());

            if (recipe.isPresent() && canInsertAmountIntoOutputSlot(inventory) && canInsertItemIntoOutputSlot(inventory, recipe.get().getOutput().getItem())) {
                this.progress++;
                if (this.progress >= this.maxProgress) {
                    for (int i = 1; i < this.size() - 1; i++) {
                        this.getStack(i).decrement(1);
                    }
                    this.setStack(5, new ItemStack(recipe.get().getOutput().getItem(),this.getStack(5).getCount() + 1));
                    DamageItem();
                }
            } else {
                resetProgress();
            }
        }
    }
}