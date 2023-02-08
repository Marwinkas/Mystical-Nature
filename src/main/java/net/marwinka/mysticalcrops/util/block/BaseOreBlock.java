package net.marwinka.mysticalcrops.util.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.intprovider.UniformIntProvider;
public class BaseOreBlock extends OreBlock {
    public BaseOreBlock() {
        super(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool(), UniformIntProvider.create(2, 5));
    }
}
