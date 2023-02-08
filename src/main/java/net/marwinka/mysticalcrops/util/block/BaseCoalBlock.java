package net.marwinka.mysticalcrops.util.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BaseCoalBlock extends Block {
    protected final int tier;
    public BaseCoalBlock(int tiers) {
        super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(5, 5));
        tier = tiers;
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(new TranslatableText("item.mysticalcrops.coaltier_" + tier + ".tooltip") );
        super.appendTooltip(stack, world, tooltip, options);
    }
}