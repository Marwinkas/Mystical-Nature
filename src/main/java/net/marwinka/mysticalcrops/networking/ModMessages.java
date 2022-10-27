package net.marwinka.mysticalcrops.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.marwinka.mysticalcrops.MysticalCrops;
import net.marwinka.mysticalcrops.networking.packet.ItemStackSyncS2CPacket;
import net.minecraft.util.Identifier;
public class ModMessages {
    public static final Identifier ITEM_SYNC = new Identifier(MysticalCrops.MOD_ID, "item_sync");




    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(ITEM_SYNC, ItemStackSyncS2CPacket::receive);
    }

}