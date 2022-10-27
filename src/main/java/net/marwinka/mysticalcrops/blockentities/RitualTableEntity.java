package net.marwinka.mysticalcrops.blockentities;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.marwinka.mysticalcrops.block.BotanicalTableBlock;
import net.marwinka.mysticalcrops.block.RitualTableBlock;
import net.marwinka.mysticalcrops.init.BlockEntities;
import net.marwinka.mysticalcrops.init.Items;
import net.marwinka.mysticalcrops.networking.ModMessages;
import net.marwinka.mysticalcrops.recipe.RitualTableRecipe;
import net.marwinka.mysticalcrops.screen.RitualTableScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class RitualTableEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(11, ItemStack.EMPTY);


    public void setInventory(DefaultedList<ItemStack> inventory) {
        for (int i = 0; i < inventory.size(); i++) {
            this.inventory.set(i, inventory.get(i));
        }
    }

    @Override
    public void markDirty() {
        if(!world.isClient()) {
            PacketByteBuf data = PacketByteBufs.create();
            data.writeInt(inventory.size());
            for(int i = 0; i < inventory.size(); i++) {
                data.writeItemStack(inventory.get(i));
            }
            data.writeBlockPos(getPos());

            for (ServerPlayerEntity player : PlayerLookup.tracking((ServerWorld) world, getPos())) {
                ServerPlayNetworking.send(player, ModMessages.ITEM_SYNC, data);
            }
        }
        super.markDirty();
    }




    protected final PropertyDelegate propertyDelegate;
    public int progress = 0;
    private int maxProgress = 150;

    public RitualTableEntity(BlockPos pos, BlockState state) {
        super(BlockEntities.BOTANICAL_RITUAL_TABLE, pos, state);
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
                return 2;
            }
        };
    }
    public static boolean noseed;
    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Ritual Table");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new RitualTableScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("ritual_table.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("ritual_table.progress");
    }

    private void resetProgress() {
        this.progress = 0;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        Direction localDir = this.getWorld().getBlockState(this.pos).get(RitualTableBlock.FACING);

        if(side == Direction.UP || side == Direction.DOWN) {
            return false;
        }

        // Top insert 1
        // Right insert 1
        // Left insert 0
        return switch (localDir) {
            default ->
                    side.getOpposite() == Direction.NORTH && slot == 1 ||
                            side.getOpposite() == Direction.EAST && slot == 1 ||
                            side.getOpposite() == Direction.WEST && slot == 0;
            case EAST ->
                    side.rotateYClockwise() == Direction.NORTH && slot == 1 ||
                            side.rotateYClockwise() == Direction.EAST && slot == 1 ||
                            side.rotateYClockwise() == Direction.WEST && slot == 0;
            case SOUTH ->
                    side == Direction.NORTH && slot == 1 ||
                            side == Direction.EAST && slot == 1 ||
                            side == Direction.WEST && slot == 0;
            case WEST ->
                    side.rotateYCounterclockwise() == Direction.NORTH && slot == 1 ||
                            side.rotateYCounterclockwise() == Direction.EAST && slot == 1 ||
                            side.rotateYCounterclockwise() == Direction.WEST && slot == 0;
        };
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {
        Direction localDir = this.getWorld().getBlockState(this.pos).get(RitualTableBlock.FACING);

        if(side == Direction.UP) {
            return false;
        }

        // Down extract 2
        if(side == Direction.DOWN) {
            return slot == 2;
        }

        // bottom extract 2
        // right extract 2
        return switch (localDir) {
            default -> side.getOpposite() == Direction.SOUTH && slot == 2 ||
                    side.getOpposite() == Direction.EAST && slot == 2;
            case EAST -> side.rotateYClockwise() == Direction.SOUTH && slot == 2 ||
                    side.rotateYClockwise() == Direction.EAST && slot == 2;
            case SOUTH -> side == Direction.SOUTH && slot == 2 ||
                    side == Direction.EAST && slot == 2;
            case WEST -> side.rotateYCounterclockwise() == Direction.SOUTH && slot == 2 ||
                    side.rotateYCounterclockwise() == Direction.EAST && slot == 2;
        };
    }
    public static void tick(World world, BlockPos blockPos, BlockState state, RitualTableEntity entity) {
        if(world.isClient()) {
            return;
        }

        if(hasRecipe(entity)) {
            entity.progress++;

            markDirty(world, blockPos, state);
            if(entity.progress >= entity.maxProgress) {
                craftItem(entity);
            }
        } else {

            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private static void craftItem(RitualTableEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<RitualTableRecipe> recipe = entity.getWorld().getRecipeManager()
                .getFirstMatch(RitualTableRecipe.Type.GF, inventory, entity.getWorld());

        if(noseed) {
                if (entity.getStack(2).getItem() == Items.ADVANCE_ESSENCE) {
                    entity.setStack(10, new ItemStack(Items.ULTRA_ESSENCE,
                            entity.getStack(10).getCount() + 1));
                }
                if (entity.getStack(2).getItem() == Items.ULTRA_ESSENCE) {
                    entity.setStack(10, new ItemStack(Items.ULTIMATE_ESSENCE,
                            entity.getStack(10).getCount() + 1));
                }
                if (entity.getStack(2).getItem() == Items.UNCOMMON_ESSENCE) {
                    entity.setStack(10, new ItemStack(Items.ADVANCE_ESSENCE,
                            entity.getStack(10).getCount() + 1));
                }
                if (entity.getStack(2).getItem() == Items.BASIC_ESSENCE) {
                    entity.setStack(10, new ItemStack(Items.UNCOMMON_ESSENCE,
                            entity.getStack(10).getCount() + 1));
                }
            entity.getStack(0).setDamage(entity.getStack(0).getDamage() + 1);
            if(entity.getStack(0).getDamage() >= entity.getStack(0).getItem().getMaxDamage() && entity.getStack(0).getItem() != Items.INFINITY_CRYSTAL)
            {
                entity.removeStack(0, 1);
            }
            entity.removeStack(2, 1);
            entity.removeStack(4, 1);
            entity.removeStack(6, 1);
            entity.removeStack(8, 1);
                entity.resetProgress();
        }
        if(recipe.isPresent()) {
            entity.setStack(10, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(10).getCount() + recipe.get().getOutput().getCount()));


            entity.getStack(0).setDamage(entity.getStack(0).getDamage() + 1);
            if(entity.getStack(0).getDamage() >= entity.getStack(0).getItem().getMaxDamage() && entity.getStack(0).getItem() != Items.INFINITY_CRYSTAL)
            {
                entity.removeStack(0, 1);
            }

            entity.removeStack(1, 1);
            entity.removeStack(2, 1);
            entity.removeStack(3, 1);
            entity.removeStack(4, 1);
            entity.removeStack(5, 1);
            entity.removeStack(6, 1);
            entity.removeStack(7, 1);
            entity.removeStack(8, 1);
            entity.removeStack(9, 1);
            entity.resetProgress();
        }
    }
    private static boolean hasRecipe(RitualTableEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        if (entity.getStack(0).getItem() == Items.BASIC_CRYSTAL || entity.getStack(0).getItem() == Items.ADVANCE_CRYSTAL || entity.getStack(0).getItem() == Items.UNCOMMON_CRYSTAL || entity.getStack(0).getItem() == Items.ULTRA_CRYSTAL || entity.getStack(0).getItem() == Items.ULTIMATE_CRYSTAL || entity.getStack(0).getItem() == Items.INFINITY_CRYSTAL) {
            if (entity.getStack(2).getItem() == Items.UNCOMMON_ESSENCE) {
                if (entity.getStack(4).getItem() == Items.UNCOMMON_ESSENCE) {
                    if (entity.getStack(6).getItem() == Items.UNCOMMON_ESSENCE) {
                        if (entity.getStack(8).getItem() == Items.UNCOMMON_ESSENCE) {
                            if (entity.getStack(1).getItem() == net.minecraft.item.Items.AIR) {
                                if (entity.getStack(3).getItem() == net.minecraft.item.Items.AIR) {
                                    if (entity.getStack(5).getItem() == net.minecraft.item.Items.AIR) {
                                        if (entity.getStack(7).getItem() == net.minecraft.item.Items.AIR) {
                                            if (entity.getStack(9).getItem() == net.minecraft.item.Items.AIR) {
                                                if (entity.getStack(10).getItem() == net.minecraft.item.Items.AIR || entity.getStack(10).getItem() == Items.ADVANCE_ESSENCE) {
                                                    noseed = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (entity.getStack(1).getItem() == null) {
                                if (entity.getStack(3).getItem() == null) {
                                    if (entity.getStack(5).getItem() == null) {
                                        if (entity.getStack(7).getItem() == null) {
                                            if (entity.getStack(9).getItem() == null) {
                                                if (entity.getStack(10).getItem() == null || entity.getStack(10).getItem() == Items.ADVANCE_ESSENCE) {
                                                    noseed = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (entity.getStack(2).getItem() == Items.BASIC_ESSENCE) {
                if (entity.getStack(4).getItem() == Items.BASIC_ESSENCE) {
                    if (entity.getStack(6).getItem() == Items.BASIC_ESSENCE) {
                        if (entity.getStack(8).getItem() == Items.BASIC_ESSENCE) {
                            if (entity.getStack(1).getItem() == net.minecraft.item.Items.AIR) {
                                if (entity.getStack(3).getItem() == net.minecraft.item.Items.AIR) {
                                    if (entity.getStack(5).getItem() == net.minecraft.item.Items.AIR) {
                                        if (entity.getStack(7).getItem() == net.minecraft.item.Items.AIR) {
                                            if (entity.getStack(9).getItem() == net.minecraft.item.Items.AIR) {
                                                if (entity.getStack(10).getItem() == net.minecraft.item.Items.AIR || entity.getStack(10).getItem() == Items.UNCOMMON_ESSENCE) {
                                                    noseed = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (entity.getStack(1).getItem() == null) {
                                if (entity.getStack(3).getItem() == null) {
                                    if (entity.getStack(5).getItem() == null) {
                                        if (entity.getStack(7).getItem() == null) {
                                            if (entity.getStack(9).getItem() == null) {
                                                if (entity.getStack(10).getItem() == null || entity.getStack(10).getItem() == Items.UNCOMMON_ESSENCE) {
                                                    noseed = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (entity.getStack(2).getItem() == Items.ADVANCE_ESSENCE) {
                if (entity.getStack(4).getItem() == Items.ADVANCE_ESSENCE) {
                    if (entity.getStack(6).getItem() == Items.ADVANCE_ESSENCE) {
                        if (entity.getStack(8).getItem() == Items.ADVANCE_ESSENCE) {
                            if (entity.getStack(1).getItem() == net.minecraft.item.Items.AIR) {
                                if (entity.getStack(3).getItem() == net.minecraft.item.Items.AIR) {
                                    if (entity.getStack(5).getItem() == net.minecraft.item.Items.AIR) {
                                        if (entity.getStack(7).getItem() == net.minecraft.item.Items.AIR) {
                                            if (entity.getStack(9).getItem() == net.minecraft.item.Items.AIR) {
                                                if (entity.getStack(10).getItem() == net.minecraft.item.Items.AIR || entity.getStack(10).getItem() == Items.ULTRA_ESSENCE) {
                                                    noseed = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (entity.getStack(1).getItem() == null) {
                                if (entity.getStack(3).getItem() == null) {
                                    if (entity.getStack(5).getItem() == null) {
                                        if (entity.getStack(7).getItem() == null) {
                                            if (entity.getStack(9).getItem() == null) {
                                                if (entity.getStack(10).getItem() == null || entity.getStack(10).getItem() == Items.ULTRA_ESSENCE) {
                                                    noseed = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (entity.getStack(2).getItem() == Items.ULTRA_ESSENCE) {
                if (entity.getStack(4).getItem() == Items.ULTRA_ESSENCE) {
                    if (entity.getStack(6).getItem() == Items.ULTRA_ESSENCE) {
                        if (entity.getStack(8).getItem() == Items.ULTRA_ESSENCE) {
                            if (entity.getStack(1).getItem() == net.minecraft.item.Items.AIR) {
                                if (entity.getStack(3).getItem() == net.minecraft.item.Items.AIR) {
                                    if (entity.getStack(5).getItem() == net.minecraft.item.Items.AIR) {
                                        if (entity.getStack(7).getItem() == net.minecraft.item.Items.AIR) {
                                            if (entity.getStack(9).getItem() == net.minecraft.item.Items.AIR) {
                                                if (entity.getStack(10).getItem() == net.minecraft.item.Items.AIR || entity.getStack(10).getItem() == Items.ULTIMATE_ESSENCE) {
                                                    noseed = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (entity.getStack(1).getItem() == null) {
                                if (entity.getStack(3).getItem() == null) {
                                    if (entity.getStack(5).getItem() == null) {
                                        if (entity.getStack(7).getItem() == null) {
                                            if (entity.getStack(9).getItem() == null) {
                                                if (entity.getStack(10).getItem() == null || entity.getStack(10).getItem() == Items.ULTIMATE_ESSENCE) {
                                                    noseed = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else noseed = false;
        }
        else noseed = false;

        Optional<RitualTableRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(RitualTableRecipe.Type.GF, inventory, entity.getWorld());

            if(!noseed){
                return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                        && canInsertItemIntoOutputSlot(inventory,match.get().getOutput().getItem());
            }
            else
            {
                return noseed && canInsertAmountIntoOutputSlot(inventory)
                        && canInsertItemIntoOutputSlot(inventory,entity.getStack(10).getItem());
            }
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(10).getItem() == output || inventory.getStack(10).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(10).getMaxCount() > inventory.getStack(10).getCount();
    }
    public ItemStack getRenderStack8() {
        if(this.getStack(10) == null){
            return this.getStack(5);
        }
        else return this.getStack(10);
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
