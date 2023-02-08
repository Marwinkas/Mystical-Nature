package net.marwinka.mysticalcrops.screenhandler;

import net.marwinka.mysticalcrops.block.entity.BotanicalEntity;
import net.marwinka.mysticalcrops.block.entity.RitualEntity;
import net.marwinka.mysticalcrops.registry.ModScreenHandler;
import net.marwinka.mysticalcrops.util.inventory.CrystalSlot;
import net.marwinka.mysticalcrops.util.inventory.SeedSlot;
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

public class RitualHandler extends ScreenHandler {
    private final PropertyDelegate propertyDelegate;
    public final RitualEntity blockEntity;
    private final Inventory inventory;
    public RitualHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(buf.readBlockPos()),
                new ArrayPropertyDelegate(10));
    }

    public RitualHandler(int syncId, PlayerInventory playerInventory, BlockEntity entity, PropertyDelegate delegate) {
        super(ModScreenHandler.RITUAL_HANDLER, syncId);
        checkSize(((Inventory) entity), 10);
        this.inventory = (Inventory)entity;
        inventory.onOpen(playerInventory.player);
        this.propertyDelegate = delegate;
        this.blockEntity = (RitualEntity) entity;

        this.addSlot(new CrystalSlot(inventory, 0, 8, 44));
        this.addSlot(new Slot(inventory, 1, 44, 8));
        this.addSlot(new Slot(inventory, 2, 44, 44));
        this.addSlot(new Slot(inventory, 3, 44, 80));
        this.addSlot(new Slot(inventory, 4, 80, 8));
        this.addSlot(new SeedSlot(inventory, 5, 80, 44));
        this.addSlot(new Slot(inventory, 6, 80, 80));
        this.addSlot(new Slot(inventory, 7, 116, 8));
        this.addSlot(new Slot(inventory, 8, 116, 44));
        this.addSlot(new Slot(inventory, 9, 116, 80));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(delegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public int getProgress() {
        return this.propertyDelegate.get(0);
    }
    @Override
    public boolean canUse(PlayerEntity player) {
        return this.blockEntity.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 102 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 160));
        }
    }
    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (index < this.blockEntity.size()) {
                if (!this.insertItem(originalStack, this.blockEntity.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.blockEntity.size(), false)) {
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
}