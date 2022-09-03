package net.marwinka.mysticalcrops.util.block;

import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

import java.util.function.Function;

public class BaseBlock extends Block {
    public BaseBlock(Material material, Function<FabricBlockSettings, FabricBlockSettings> settings) {
        super(settings.apply(FabricBlockSettings.of(material)));
    }

    public BaseBlock(Material material, BlockSoundGroup sound, float hardness, float resistance) {
        super(FabricBlockSettings.of(material).sounds(sound).strength(hardness, resistance).requiresTool());
    }
}