package net.marwinka.mysticalcrops;

import net.fabricmc.api.ModInitializer;
import net.marwinka.mysticalcrops.init.*;
import net.marwinka.mysticalcrops.init.itemfromothermods.OtherCrops;
import net.marwinka.mysticalcrops.init.itemfromothermods.OtherItems;
import net.marwinka.mysticalcrops.networking.ModMessages;
import net.marwinka.mysticalcrops.recipe.ModRecipes;
import net.marwinka.mysticalcrops.screen.ModScreenHandler;
import net.marwinka.mysticalcrops.util.generation.ModConfiguredFeatures;
import net.marwinka.mysticalcrops.util.generation.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticalCrops implements ModInitializer {
	public static final String MOD_ID = "mysticalcrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockEntities.registerBlockEntities();
		Blocks.registerBlocks();
		Crops.registerCrops();
		Items.registerItems();
		OtherCrops.registerCrops();
		OtherItems.registerItems();
		ModScreenHandler.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
		ModMessages.registerC2SPackets();
		Fuels.registerModStuffs();
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();
	}
}
