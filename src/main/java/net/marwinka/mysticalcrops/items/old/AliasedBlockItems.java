package net.marwinka.mysticalcrops.items.old;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class AliasedBlockItems extends net.minecraft.item.AliasedBlockItem {
    public AliasedBlockItems(Block block) {
        super(block, new FabricItemSettings());
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.mysticalcrops.old") );
        super.appendTooltip(stack, world, tooltip, context);
    }
}