package net.marwinka.mysticalcrops.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandler {
    public static ScreenHandlerType<BotanicalTableScreenHandler> BOTANICAL_TABLE_SCREEN_HANDLER;
    public static ScreenHandlerType<BotanicalRitualTableScreenHandler> BOTANICAL_RITUAL_TABLE_SCREEN_HANDLER;
    public static void registerAllScreenHandlers() {
        BOTANICAL_TABLE_SCREEN_HANDLER = new ScreenHandlerType<>(BotanicalTableScreenHandler::new);
        BOTANICAL_RITUAL_TABLE_SCREEN_HANDLER = new ScreenHandlerType<>(BotanicalRitualTableScreenHandler::new);
    }
}