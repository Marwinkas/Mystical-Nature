package net.marwinka.mysticalcrops.screen;

import net.marwinka.mysticalcrops.blockentities.RitualTableEntity;
import net.marwinka.mysticalcrops.util.inventory.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class RitualTableScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;

    public final RitualTableEntity blockEntity;
    public RitualTableScreenHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(buf.readBlockPos()),
                new ArrayPropertyDelegate(11));
    }

    public RitualTableScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity entity, PropertyDelegate delegate) {
        super(ModScreenHandler.RITUAL_TABLE_SCREEN_HANDLER, syncId);
        checkSize(((Inventory) entity), 11);
        this.inventory = (Inventory)entity;
        inventory.onOpen(playerInventory.player);
        this.propertyDelegate = delegate;
        this.blockEntity = (RitualTableEntity) entity;

        this.addSlot(new CristalSlot(inventory, 0, 14, 32));
        this.addSlot(new NoSeedSlot(inventory, 1, 51, 0));
        this.addSlot(new EssenceSlot(inventory, 2, 49, 32));
        this.addSlot(new NoSeedSlot(inventory, 3, 51, 63));
        this.addSlot(new EssenceSlot(inventory, 4, 80, -2));
        this.addSlot(new SeedSlot(inventory, 5, 80, 32));
        this.addSlot(new NoSeedSlot(inventory, 6, 80, 65));
        this.addSlot(new NoSeedSlot(inventory, 7, 109, 0));
        this.addSlot(new EssenceSlot(inventory, 8, 111, 32));
        this.addSlot(new NoSeedSlot(inventory, 9, 109, 63));

        this.addSlot(new NoSeedSlot(inventory, 10, 0, 0));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(delegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);  // Max Progress
        int progressArrowSize = 92; // This is the width in pixels of your arrow

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        this.addSlot(new Slot(playerInventory, 9, 13, 91));
        this.addSlot(new Slot(playerInventory, 10, 12 + 18, 91));
        this.addSlot(new Slot(playerInventory, 11, 10 + 2 * 18, 91));
        this.addSlot(new Slot(playerInventory, 12, 9 + 3 * 18, 91));
        this.addSlot(new Slot(playerInventory, 13, 8 + 4 * 18, 91));
        this.addSlot(new Slot(playerInventory, 14, 7 + 5 * 18, 91));
        this.addSlot(new Slot(playerInventory, 15, 6 + 6 * 18, 91));
        this.addSlot(new Slot(playerInventory, 16, 5 + 7 * 18, 91));
        this.addSlot(new Slot(playerInventory, 17, 4 + 8 * 18, 91));
        this.addSlot(new Slot(playerInventory, 18, 13, 109));
        this.addSlot(new Slot(playerInventory, 19, 12 + 18, 109));
        this.addSlot(new Slot(playerInventory, 20, 10 + 2 * 18, 109));
        this.addSlot(new Slot(playerInventory, 21, 9 + 3 * 18, 109));
        this.addSlot(new Slot(playerInventory, 22, 8 + 4 * 18, 109));
        this.addSlot(new Slot(playerInventory, 23, 7 + 5 * 18, 109));
        this.addSlot(new Slot(playerInventory, 24, 6 + 6 * 18, 109));
        this.addSlot(new Slot(playerInventory, 25, 5 + 7 * 18, 109));
        this.addSlot(new Slot(playerInventory, 26, 4 + 8 * 18, 109));
        this.addSlot(new Slot(playerInventory, 27, 13, 127));
        this.addSlot(new Slot(playerInventory, 28, 12 + 18, 127));
        this.addSlot(new Slot(playerInventory, 29, 10 + 2 * 18, 127));
        this.addSlot(new Slot(playerInventory, 30, 9 + 3 * 18, 127));
        this.addSlot(new Slot(playerInventory, 31, 8 + 4 * 18, 127));
        this.addSlot(new Slot(playerInventory, 32, 7 + 5 * 18, 127));
        this.addSlot(new Slot(playerInventory, 33, 6 + 6 * 18, 127));
        this.addSlot(new Slot(playerInventory, 34, 5 + 7 * 18, 127));
        this.addSlot(new Slot(playerInventory, 35, 4 + 8 * 18, 127));
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        this.addSlot(new Slot(playerInventory, 0, 13, 149));
        this.addSlot(new Slot(playerInventory, 1, 12 + 18, 149));
        this.addSlot(new Slot(playerInventory, 2, 10 + 2 * 18, 149));
        this.addSlot(new Slot(playerInventory, 3, 9 + 3 * 18, 149));
        this.addSlot(new Slot(playerInventory, 4, 8 + 4 * 18, 149));
        this.addSlot(new Slot(playerInventory, 5, 7 + 5 * 18, 149));
        this.addSlot(new Slot(playerInventory, 6, 6 + 6 * 18, 149));
        this.addSlot(new Slot(playerInventory, 7, 5 + 7 * 18, 149));
        this.addSlot(new Slot(playerInventory, 8, 4 + 8 * 18, 149));
    }
}