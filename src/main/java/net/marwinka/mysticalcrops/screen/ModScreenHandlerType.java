package net.marwinka.mysticalcrops.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.marwinka.mysticalcrops.block.ChestTypes;
public class ModScreenHandlerType {
    public static ScreenHandlerType<GenericChestScreenHandler> COMMON_CHEST;
    public static ScreenHandlerType<GenericChestScreenHandler> UNCOMMON_CHEST;
    public static ScreenHandlerType<GenericChestScreenHandler> WONDERFUL_CHEST;
    public static ScreenHandlerType<GenericChestScreenHandler> EXCELLENT_CHEST;
    public static ScreenHandlerType<GenericChestScreenHandler> PERFECT_CHEST;

    public static void registerScreenHandlers() {
        COMMON_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MysticalCrops.MOD_ID, "common_chest"), (syncId, inventory) -> new GenericChestScreenHandler(COMMON_CHEST, ChestTypes.COMMON, syncId, inventory, ScreenHandlerContext.EMPTY));
        UNCOMMON_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MysticalCrops.MOD_ID, "uncommon_chest"), (syncId, inventory) -> new GenericChestScreenHandler(UNCOMMON_CHEST, ChestTypes.UNCOMMON, syncId, inventory, ScreenHandlerContext.EMPTY));
        WONDERFUL_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MysticalCrops.MOD_ID, "wonderful_chest"), (syncId, inventory) -> new GenericChestScreenHandler(WONDERFUL_CHEST, ChestTypes.WONDERFUL, syncId, inventory, ScreenHandlerContext.EMPTY));
        EXCELLENT_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MysticalCrops.MOD_ID, "excellent_chest"), (syncId, inventory) -> new GenericChestScreenHandler(EXCELLENT_CHEST, ChestTypes.EXCELLENT, syncId, inventory, ScreenHandlerContext.EMPTY));
        PERFECT_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MysticalCrops.MOD_ID, "perfect_chest"), (syncId, inventory) -> new GenericChestScreenHandler(PERFECT_CHEST, ChestTypes.PERFECT, syncId, inventory, ScreenHandlerContext.EMPTY));

    }
}