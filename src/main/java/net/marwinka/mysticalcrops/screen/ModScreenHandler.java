package net.marwinka.mysticalcrops.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModScreenHandler {
    public static ScreenHandlerType<BotanicalTableScreenHandler> BOTANICAL_TABLE_SCREEN_HANDLER =
            new ExtendedScreenHandlerType<>(BotanicalTableScreenHandler::new);
    public static ScreenHandlerType<RitualTableScreenHandler> RITUAL_TABLE_SCREEN_HANDLER =
            new ExtendedScreenHandlerType<>(RitualTableScreenHandler::new);
    public static ScreenHandlerType<InfusionTableScreenHandler> INFUSION_TABLE_SCREEN_HANDLER =
            new ExtendedScreenHandlerType<>(InfusionTableScreenHandler::new);
    public static void registerAllScreenHandlers() {
        Registry.register(Registry.SCREEN_HANDLER, new Identifier(MysticalCrops.MOD_ID, "botanical_table_cut"),
                BOTANICAL_TABLE_SCREEN_HANDLER);
        Registry.register(Registry.SCREEN_HANDLER, new Identifier(MysticalCrops.MOD_ID, "botanical_ritual_table_craft"),
                RITUAL_TABLE_SCREEN_HANDLER);
        Registry.register(Registry.SCREEN_HANDLER, new Identifier(MysticalCrops.MOD_ID, "infusion_table_craft"),
                INFUSION_TABLE_SCREEN_HANDLER);
    }
}