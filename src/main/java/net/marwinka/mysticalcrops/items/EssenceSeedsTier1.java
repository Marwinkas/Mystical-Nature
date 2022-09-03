package net.marwinka.mysticalcrops.items;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class EssenceSeedsTier1 extends AliasedBlockItem {

    public EssenceSeedsTier1(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.mysticalcrops.essence_seeds_tier_1.tooltip.shift"));
        } else {
            tooltip.add(Text.translatable("item.mysticalcrops.essence_seeds_tier_1.tooltip") );
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
