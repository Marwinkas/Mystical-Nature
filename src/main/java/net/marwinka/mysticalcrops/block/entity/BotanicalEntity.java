package net.marwinka.mysticalcrops.block.entity;

import net.marwinka.mysticalcrops.recipe.BotanicalRecipe;
import net.marwinka.mysticalcrops.registry.ModBlockEntities;
import net.marwinka.mysticalcrops.registry.ModRecipes;
import net.marwinka.mysticalcrops.screenhandler.BotanicalHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class BotanicalEntity extends AbstractTableEntity {
    public BotanicalEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BOTANICAL_TABLE, pos, state,200);
    }
    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new BotanicalHandler(syncId, inv, this, this.propertyDelegate);
    }
    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {
        return slot == 2;
    }
    public void tick() {
        if (!this.world.isClient) {
            SimpleInventory inventory = new SimpleInventory(this.size());
            for (int i = 0; i < this.size(); i++) {
                inventory.setStack(i, this.getStack(i));
            }
            Optional<BotanicalRecipe> recipe = this.getWorld().getRecipeManager().getFirstMatch(ModRecipes.BOTANICAL_RECIPE, inventory, this.getWorld());

            if (recipe.isPresent() && canInsertAmountIntoOutputSlot(inventory) && canInsertItemIntoOutputSlot(inventory, recipe.get().getOutput().getItem())) {
                this.progress++;
                if (this.progress >= this.maxProgress) {
                    this.getStack(1).decrement(1);
                    this.setStack(2, new ItemStack(recipe.get().getOutput().getItem(),this.getStack(2).getCount() + recipe.get().getOutput().getCount()));
                    DamageItem();
                }
            }
            else
            {
                resetProgress();
            }
        }
    }
}