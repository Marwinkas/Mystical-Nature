package net.marwinka.mysticalcrops;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.marwinka.mysticalcrops.init.*;
import net.marwinka.mysticalcrops.init.itemfromothermods.OtherCrops;
import net.marwinka.mysticalcrops.recipe.ModRecipes;
import net.marwinka.mysticalcrops.screen.ModScreenHandler;
import net.marwinka.mysticalcrops.util.generation.ModConfiguredFeatures;
import net.marwinka.mysticalcrops.util.generation.ModOreGeneration;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticalCrops implements ModInitializer {
	public static final String MOD_ID = "mysticalcrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity) -> {
			if(killedEntity instanceof PathAwareEntity && Math.random() < 0.4) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(classic_item.BASIC_ESSENCE)));
			}
			if(killedEntity instanceof PathAwareEntity && Math.random() < 0.1) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(classic_item.CRYSTAL_FRAGMENTS)));
			}
			if(killedEntity instanceof WitherSkeletonEntity && Math.random() < 0.07) {
				world.spawnEntity(new ItemEntity(world, killedEntity.getX(), killedEntity.getY(), killedEntity.getZ(), new ItemStack(classic_item.WITHER_SOUL)));
			}
			if (entity instanceof ServerPlayerEntity) {
				ServerPlayerEntity player = (ServerPlayerEntity) entity;
				Item item = player.getMainHandStack().getItem();
			}});
		BlockEntities.registerBlockEntities();
		Blocks.registerBlocks();
		Crops.registerCrops();
		Items.registerItems();
		classic_item.registerItems();
		OtherCrops.registerBlocks();
		OtherCrops.registerItems();
		new_system_seed.registerBlocks();
		new_system_seed.registerItems();
		ModScreenHandler.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
		Fuels.registerModStuffs();
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();

	}
}
