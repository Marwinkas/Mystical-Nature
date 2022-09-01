package net.marwinka.mysticalcrops.item;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class EssenceTier1Seed extends AliasedBlockItem {

    public EssenceTier1Seed(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.mysticalcrops.essence_tier_1_seeds.tooltip.shift"));
        } else {
            tooltip.add(Text.translatable("item.mysticalcrops.essence_tier_1_seeds.tooltip") );
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
