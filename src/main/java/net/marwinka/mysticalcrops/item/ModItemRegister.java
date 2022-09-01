package net.marwinka.mysticalcrops.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.ModItemGroup;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.block.ModBlockRegister;
import net.marwinka.mysticalcrops.tools.Crystal;
import net.marwinka.mysticalcrops.tools.DiamondKnife;
import net.marwinka.mysticalcrops.tools.IronKnife;
import net.marwinka.mysticalcrops.tools.NetheriteKnife;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemRegister {
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MysticalCrops.MOD_ID, name), item);
    }
    public static final Item DIAMOND_SEED = registerItem("diamond_seed",
            new AliasedBlockItem(ModBlockRegister.DIAMOND_CROP,
                    new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));

    public static final Item DIAMOND_ESSENCE = registerItem("diamond_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));
    public static final Item DIAMOND_FRUIT = registerItem("diamond_fruit",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())));
    public static final Item ESSENCE_TIER_1_SEED = registerItem("essence_tier_1_seed",
            new EssenceTier1Seed(ModBlockRegister.ESSENCE_TIER_1_CROP,
                    new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));
    public static final Item ESSENCE_TIER_1_FRUIT = registerItem("essence_tier_1_fruit",
            new EssenceTier1Fruit(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())));
    public static final Item IRON_SEED = registerItem("iron_seed",
            new AliasedBlockItem(ModBlockRegister.IRON_CROP,
                    new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));

    public static final Item IRON_ESSENCE = registerItem("iron_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));
    public static final Item IRON_FRUIT = registerItem("iron_fruit",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build())));

    public static final Item BASIC_ESSENCE = registerItem("basic_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));
    public static final Item UNCOMMON_ESSENCE = registerItem("uncommon_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));
    public static final Item ADVANCE_ESSENCE = registerItem("advance_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));
    public static final Item ULTRA_ESSENCE = registerItem("ultra_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));
    public static final Item ULTIMATE_ESSENCE = registerItem("ultimate_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMGROUP)));
    //Tool
    public static final Item CRYSTAL = registerItem("crystal",
            new Crystal(ToolMaterials.IRON,0,0, new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)));
    public static final Item IRON_KNIFE = registerItem("iron_knife",
            new IronKnife(ToolMaterials.IRON,0,0, new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)));
    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife",
            new DiamondKnife(ToolMaterials.DIAMOND,0,0, new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)));
    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife",
            new NetheriteKnife(ToolMaterials.NETHERITE,0,0, new FabricItemSettings().group(ModItemGroup.ITEMGROUP).maxCount(1)));
    public static void ModItemregister() {
        MysticalCrops.LOGGER.debug("Registering ModBlocks for " + MysticalCrops.MOD_ID);
    }
}
