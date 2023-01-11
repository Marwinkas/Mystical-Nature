    package net.marwinka.mysticalcrops.init;

    import net.marwinka.mysticalcrops.MysticalCrops;
    import net.marwinka.mysticalcrops.block.ChestTypes;
    import net.marwinka.mysticalcrops.block.GenericChestBlock;
    import net.minecraft.block.Block;
    import net.minecraft.util.Identifier;
    import net.minecraft.util.registry.Registry;

    public class ModBlockChest {
        public static final Block COMMON_CHEST = new GenericChestBlock(ChestTypes.COMMON.setting(), ChestTypes.COMMON);
        public static final Block UNCOMMON_CHEST = new GenericChestBlock(ChestTypes.UNCOMMON.setting(), ChestTypes.UNCOMMON);
        public static final Block WONDERFUL_CHEST = new GenericChestBlock(ChestTypes.WONDERFUL.setting(), ChestTypes.WONDERFUL);
        public static final Block EXCELLENT_CHEST = new GenericChestBlock(ChestTypes.EXCELLENT.setting(), ChestTypes.EXCELLENT);
        public static final Block PERFECT_CHEST = new GenericChestBlock(ChestTypes.PERFECT.setting(), ChestTypes.PERFECT);
        public static void registerBlocks() {
            Registry.register(Registry.BLOCK, new Identifier(MysticalCrops.MOD_ID, "common_chest"), COMMON_CHEST);
            Registry.register(Registry.BLOCK, new Identifier(MysticalCrops.MOD_ID, "uncommon_chest"), UNCOMMON_CHEST);
            Registry.register(Registry.BLOCK, new Identifier(MysticalCrops.MOD_ID, "wonderful_chest"), WONDERFUL_CHEST);
            Registry.register(Registry.BLOCK, new Identifier(MysticalCrops.MOD_ID, "excellent_chest"), EXCELLENT_CHEST);
            Registry.register(Registry.BLOCK, new Identifier(MysticalCrops.MOD_ID, "perfect_chest"), PERFECT_CHEST);
        }
    }
