package net.marwinka.mysticalcrops.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import static net.marwinka.mysticalcrops.MysticalCrops.ITEMGROUPCLASSIC;

public class Items extends Item {
    protected final int tier;
    public Items(int tiers) {
        super(new FabricItemSettings().group(ITEMGROUPCLASSIC));
        tier = tiers;
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("item.mysticalcrops.tier_" + tier + ".tooltip") );
        super.appendTooltip(stack, world, tooltip, context);
    }
}
