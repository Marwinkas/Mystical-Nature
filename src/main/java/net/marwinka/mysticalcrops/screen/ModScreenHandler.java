package net.marwinka.mysticalcrops.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandler {
    public static ScreenHandlerType<BotanicalTableScreenHandler> BOTANICAL_TABLE_SCREEN_HANDLER;
    public static ScreenHandlerType<BotanicalRitualTableScreenHandler> BOTANICAL_RITUAL_TABLE_SCREEN_HANDLER;
    public static void registerAllScreenHandlers() {
        BOTANICAL_TABLE_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(MysticalCrops.MOD_ID, "botanical_table"),
                        BotanicalTableScreenHandler::new);
        BOTANICAL_RITUAL_TABLE_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(MysticalCrops.MOD_ID, "botanical_ritual_table"),
                        BotanicalRitualTableScreenHandler::new);
    }
    }

