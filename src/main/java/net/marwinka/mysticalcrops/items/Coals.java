package net.marwinka.mysticalcrops.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.marwinka.mysticalcrops.util.group.ModItemGroupClassic;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Coals extends Item {
    protected final int tier;
    public Coals(int tiers) {
        super(new FabricItemSettings().group(ModItemGroupClassic.ITEMGROUP));
        tier = tiers;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.mysticalcrops.coaltier_" + tier + ".tooltip") );
        super.appendTooltip(stack, world, tooltip, context);
    }
}