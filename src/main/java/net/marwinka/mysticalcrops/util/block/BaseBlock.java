package net.marwinka.mysticalcrops.util.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
public class BaseBlock extends Block {

    public BaseBlock(Material material, BlockSoundGroup sound) {
        super(FabricBlockSettings.of(material).sounds(sound).strength(5, 5));
    }
}