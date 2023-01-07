package net.marwinka.mysticalcrops.blockentities;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.marwinka.mysticalcrops.init.ModBlockEntities;
import net.marwinka.mysticalcrops.recipe.RitualTableRecipe;
import net.marwinka.mysticalcrops.screen.RitualTableScreenHandler;
import net.marwinka.mysticalcrops.util.inventory.ImplementedInventory;
import net.marwinka.mysticalcrops.util.tags;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class RitualTableEntity  extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {

    public RitualTableEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BOTANICAL_RITUAL_TABLE, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return RitualTableEntity.this.progress;
                    case 1: return RitualTableEntity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: RitualTableEntity.this.progress = value; break;
                    case 1: RitualTableEntity.this.maxProgress = value; break;
                }
            }

            public int size() {
                return 10;
            }
        };
    }
    public int progress = 0;
    public int maxProgress = 300;

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        if (side == Direction.UP) {
            if (!stack.isStackable()) {
                return slot == 0;
            }
            else if(this.getStack(5).isEmpty()){
                return slot == 5;
            }
        }
        if (side == Direction.DOWN || side == Direction.NORTH || side == Direction.SOUTH || side == Direction.WEST || side == Direction.EAST) {
            if (!stack.isStackable()) {
                return slot == 0;
            }
            if (stack.isStackable() && this.getStack(1).getCount() <= this.getStack(2).getCount() && this.getStack(1).getCount() <= this.getStack(3).getCount() && this.getStack(1).getCount() <= this.getStack(4).getCount() && this.getStack(1).getCount() <= this.getStack(6).getCount() && this.getStack(1).getCount() <= this.getStack(7).getCount() && this.getStack(1).getCount() <= this.getStack(8).getCount() && this.getStack(1).getCount() <= this.getStack(9).getCount()) {
                return slot == 1;
            }
            if (stack.isStackable() && this.getStack(2).getCount() <= this.getStack(1).getCount() && this.getStack(2).getCount() <= this.getStack(3).getCount() && this.getStack(2).getCount() <= this.getStack(4).getCount() && this.getStack(2).getCount() <= this.getStack(6).getCount() && this.getStack(2).getCount() <= this.getStack(7).getCount() && this.getStack(2).getCount() <= this.getStack(8).getCount() && this.getStack(2).getCount() <= this.getStack(9).getCount()) {
                return slot == 2;
            }
            if (stack.isStackable() && this.getStack(3).getCount() <= this.getStack(1).getCount() && this.getStack(3).getCount() <= this.getStack(2).getCount() && this.getStack(3).getCount() <= this.getStack(4).getCount() && this.getStack(3).getCount() <= this.getStack(6).getCount() && this.getStack(3).getCount() <= this.getStack(7).getCount() && this.getStack(3).getCount() <= this.getStack(8).getCount() && this.getStack(3).getCount() <= this.getStack(9).getCount()) {
                return slot == 3;
            }
            if (stack.isStackable() && this.getStack(4).getCount() <= this.getStack(1).getCount() && this.getStack(4).getCount() <= this.getStack(3).getCount() && this.getStack(4).getCount() <= this.getStack(2).getCount() && this.getStack(4).getCount() <= this.getStack(6).getCount() && this.getStack(4).getCount() <= this.getStack(7).getCount() && this.getStack(4).getCount() <= this.getStack(8).getCount() && this.getStack(4).getCount() <= this.getStack(9).getCount()) {
                return slot == 4;
            }
            if (stack.isStackable() && this.getStack(6).getCount() <= this.getStack(1).getCount() && this.getStack(6).getCount() <= this.getStack(3).getCount() && this.getStack(6).getCount() <= this.getStack(4).getCount() && this.getStack(6).getCount() <= this.getStack(2).getCount() && this.getStack(6).getCount() <= this.getStack(7).getCount() && this.getStack(6).getCount() <= this.getStack(8).getCount() && this.getStack(6).getCount() <= this.getStack(9).getCount()) {
                return slot == 6;
            }
            if (stack.isStackable() && this.getStack(7).getCount() <= this.getStack(1).getCount() && this.getStack(7).getCount() <= this.getStack(3).getCount() && this.getStack(7).getCount() <= this.getStack(4).getCount() && this.getStack(7).getCount() <= this.getStack(6).getCount() && this.getStack(7).getCount() <= this.getStack(2).getCount() && this.getStack(7).getCount() <= this.getStack(8).getCount() && this.getStack(7).getCount() <= this.getStack(9).getCount()) {
                return slot == 7;
            }
            if (stack.isStackable() && this.getStack(8).getCount() <= this.getStack(1).getCount() && this.getStack(8).getCount() <= this.getStack(3).getCount() && this.getStack(8).getCount() <= this.getStack(4).getCount() && this.getStack(8).getCount() <= this.getStack(6).getCount() && this.getStack(8).getCount() <= this.getStack(7).getCount() && this.getStack(8).getCount() <= this.getStack(2).getCount() && this.getStack(8).getCount() <= this.getStack(9).getCount()) {
                return slot == 8;
            }
            if (stack.isStackable() && this.getStack(9).getCount() <= this.getStack(1).getCount() && this.getStack(9).getCount() <= this.getStack(3).getCount() && this.getStack(9).getCount() <= this.getStack(4).getCount() && this.getStack(9).getCount() <= this.getStack(6).getCount() && this.getStack(9).getCount() <= this.getStack(7).getCount() && this.getStack(9).getCount() <= this.getStack(8).getCount() && this.getStack(9).getCount() <= this.getStack(2).getCount()) {
                return slot == 9;
            }
        }
        return false;
    }
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(11, ItemStack.EMPTY);
    public void resetProgress() {
        this.progress = 0;
    }
    @Override
    public Text getDisplayName() {
        return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new RitualTableScreenHandler(syncId, inv, this, this.propertyDelegate);
    }
    protected final PropertyDelegate propertyDelegate;
    public void setInventory(DefaultedList<ItemStack> inventory) {
        for (int i = 0; i < inventory.size(); i++) {
            this.inventory.set(i, inventory.get(i));
        }
    }
    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }
    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }
    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
        nbt.putInt("progress", this.progress);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.inventory);
        this.progress = nbt.getInt("progress");
    }

    private boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(5).getCount() == 1;
    }
    public void tick(){
        if (!this.world.isClient) {
            SimpleInventory inventory = new SimpleInventory(this.size());
            for (int i = 0; i < this.size(); i++) {
                inventory.setStack(i, this.getStack(i));
            }
            Optional<RitualTableRecipe> recipe = this.getWorld().getRecipeManager()
                    .getFirstMatch(RitualTableRecipe.Type.GF, inventory, this.getWorld());

            if (recipe.isPresent() && canInsertAmountIntoOutputSlot(inventory)) {
                this.progress++;
                if (this.progress >= this.maxProgress) {

                    if(this.getStack(0).getItem().isDamageable()){
                        this.getStack(0).setDamage(this.getStack(0).getDamage() + 1);
                        if(this.getStack(0).getDamage() >= this.getStack(0).getItem().getMaxDamage())
                        {
                            this.removeStack(0, 1);
                        }
                    }

                    for(int i = 1; i < this.size(); i++){
                        if(i != 5) this.removeStack(i, 1);
                        else this.setStack(5, new ItemStack(recipe.get().getOutput().getItem(), 1));
                    }
                    resetProgress();
                    this.markDirty();
                }
            }
            else {
                resetProgress();
            }
        }
    }
    @Override
    public void markDirty() {
        super.markDirty();
        if (this.world instanceof ServerWorld world) {
            world.getChunkManager().markForUpdate(this.pos);
        }
    }
    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side)
    {
        if(this.getStack(5).isIn(tags.SEEDSS) || this.getStack(5).isIn(tags.CRAFT_SEEDS)){
            return false;
        }
        else return slot == 5;
    }

    public ItemStack getRenderStack8() {
        return this.getStack(5);
    }
    public ItemStack getRenderStack() {
        return this.getStack(1);
    }
    public ItemStack getRenderStack1() {
        return this.getStack(2);
    }
    public ItemStack getRenderStack2() {
        return this.getStack(3);
    }
    public ItemStack getRenderStack3() {
        return this.getStack(4);
    }
    public ItemStack getRenderStack4() {
        return this.getStack(6);
    }
    public ItemStack getRenderStack5() {
        return this.getStack(7);
    }
    public ItemStack getRenderStack6() {
        return this.getStack(8);
    }
    public ItemStack getRenderStack7() {
        return this.getStack(9);
    }

}
