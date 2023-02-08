package net.marwinka.mysticalcrops.registry;

import net.marwinka.mysticalcrops.block.chest.ChestTypes;
import net.marwinka.mysticalcrops.screenhandler.*;
import net.marwinka.mysticalcrops.util.inventory.ModIdentifier;
import net.minecraft.screen.*;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.screenhandler.v1.*;

public class ModScreenHandler {
    public static ScreenHandlerType<BotanicalHandler> BOTANICAL_HANDLER;
    public static ScreenHandlerType<RitualHandler> RITUAL_HANDLER;
    public static ScreenHandlerType<InfusionHandler> INFUSION_HANDLER;

    public static ScreenHandlerType<GenericChestHandler> COMMON_CHEST;
    public static ScreenHandlerType<GenericChestHandler> UNCOMMON_CHEST;
    public static ScreenHandlerType<GenericChestHandler> WONDERFUL_CHEST;
    public static ScreenHandlerType<GenericChestHandler> EXCELLENT_CHEST;
    public static ScreenHandlerType<GenericChestHandler> PERFECT_CHEST;

    public static void register() {
        BOTANICAL_HANDLER = register("botanical_handler", BotanicalHandler::new);
        RITUAL_HANDLER = register("ritual_handler", RitualHandler::new);
        INFUSION_HANDLER = register("infusion_handler", InfusionHandler::new);

        COMMON_CHEST = ScreenHandlerRegistry.registerSimple(new ModIdentifier("common_chest"), (syncId, inventory) -> new GenericChestHandler(COMMON_CHEST, ChestTypes.COMMON, syncId, inventory, ScreenHandlerContext.EMPTY));
        UNCOMMON_CHEST = ScreenHandlerRegistry.registerSimple(new ModIdentifier("uncommon_chest"), (syncId, inventory) -> new GenericChestHandler(UNCOMMON_CHEST, ChestTypes.UNCOMMON, syncId, inventory, ScreenHandlerContext.EMPTY));
        WONDERFUL_CHEST = ScreenHandlerRegistry.registerSimple(new ModIdentifier("wonderful_chest"), (syncId, inventory) -> new GenericChestHandler(WONDERFUL_CHEST, ChestTypes.WONDERFUL, syncId, inventory, ScreenHandlerContext.EMPTY));
        EXCELLENT_CHEST = ScreenHandlerRegistry.registerSimple(new ModIdentifier("excellent_chest"), (syncId, inventory) -> new GenericChestHandler(EXCELLENT_CHEST, ChestTypes.EXCELLENT, syncId, inventory, ScreenHandlerContext.EMPTY));
        PERFECT_CHEST = ScreenHandlerRegistry.registerSimple(new ModIdentifier("perfect_chest"), (syncId, inventory) -> new GenericChestHandler(PERFECT_CHEST, ChestTypes.PERFECT, syncId, inventory, ScreenHandlerContext.EMPTY));
    }
    public static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ExtendedScreenHandlerType.ExtendedFactory<T> screenHandler) {
        return Registry.register(Registry.SCREEN_HANDLER, new ModIdentifier(id), new ExtendedScreenHandlerType<>(screenHandler));
    }
}