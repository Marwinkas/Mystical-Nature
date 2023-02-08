package net.marwinka.mysticalcrops.block.entity;

import net.marwinka.mysticalcrops.recipe.RitualRecipe;
import net.marwinka.mysticalcrops.registry.ModBlockEntities;
import net.marwinka.mysticalcrops.registry.ModRecipes;
import net.marwinka.mysticalcrops.screenhandler.RitualHandler;
import net.marwinka.mysticalcrops.util.tags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class RitualEntity extends AbstractTableEntity {
    public RitualEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.RITUAL_TABLE, pos, state, 600);
    }
    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new RitualHandler(syncId, inv, this, this.propertyDelegate);
    }
    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
            if (!stack.isStackable()) {
                return slot == 0;
            }
            else if(this.getStack(5).isEmpty()){
                return slot == 5;
            }
            else {
                if(slots == 4){
                    slots++;
                    return slot == slots - 1;
                }
                else if(slots != 9){
                    slots++;
                    return slot == slots;
                }
                else slots = 0;
            }
        return false;
    }
    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side)
    {
        if(this.getStack(5).isIn(tags.SEEDS) || this.getStack(5).isIn(tags.CRAFT_SEEDS)){
            return false;
        }
        else return slot == 5;
    }

    public void tick(){
        if (!this.world.isClient) {
            SimpleInventory inventory = new SimpleInventory(this.size());
            for (int i = 0; i < this.size(); i++) {
                inventory.setStack(i, this.getStack(i));
            }
            Optional<RitualRecipe> recipe = this.getWorld().getRecipeManager()
                    .getFirstMatch(ModRecipes.RITUAL_RECIPE, inventory, this.getWorld());

            if (recipe.isPresent() && this.getStack(5).getCount() == 1) {
                this.progress++;
                if (this.progress >= this.maxProgress) {
                    for(int i = 1; i < this.size(); i++){
                        if(i != 5) this.getStack(i).decrement(1);
                    }
                    this.setStack(5, recipe.get().getOutput());
                    DamageItem();
                }
            }
            else {
                resetProgress();
            }
        }
    }
}
