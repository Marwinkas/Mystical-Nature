package net.marwinka.mysticalcrops.blockentities;
import net.marwinka.mysticalcrops.blocks.BotanicalRitualTableBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3f;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class BotanicalRitualTableEntityRenderer implements BlockEntityRenderer<BotanicalRitualTableEntity> {
    public BotanicalRitualTableEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(BotanicalRitualTableEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();

        ItemStack itemStack = entity.getRenderStack();
        ItemStack itemStack1 = entity.getRenderStack1();
        ItemStack itemStack2 = entity.getRenderStack2();
        ItemStack itemStack3 = entity.getRenderStack3();
        ItemStack itemStack4 = entity.getRenderStack4();
        ItemStack itemStack5 = entity.getRenderStack5();
        ItemStack itemStack6 = entity.getRenderStack6();
        ItemStack itemStack7 = entity.getRenderStack7();
        ItemStack itemStack8 = entity.getRenderStack8();

        matrices.push();
        matrices.translate(0.5f, 1.02f, 0.5f);
        matrices.scale(0.2f, 0.3f, 0.2f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack8, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 9);
        matrices.pop();

        matrices.push();
        matrices.translate(0.25f, 1.02f, 0.25f);
        matrices.scale(0.15f, 0.3f, 0.15f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 1);
        matrices.pop();

        matrices.push();
        matrices.translate(0.19f, 1.02f, 0.5f);
        matrices.scale(0.15f, 0.3f, 0.15f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack1, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 2);
        matrices.pop();
        matrices.push();
        matrices.translate(0.25f, 1.02f, 0.75f);
        matrices.scale(0.15f, 0.3f, 0.15f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack2, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 3);
        matrices.pop();

        matrices.push();
        matrices.translate(0.5f, 1.02f, 0.19f);
        matrices.scale(0.15f, 0.3f, 0.15f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack3, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 4);
        matrices.pop();
        matrices.push();
        matrices.translate(0.5f, 1.02f, 0.81f);
        matrices.scale(0.15f, 0.3f, 0.15f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack4, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 5);
        matrices.pop();

        matrices.push();
        matrices.translate(0.75f, 1.02f, 0.25f);
        matrices.scale(0.15f, 0.3f, 0.15f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack5, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 6);
        matrices.pop();
        matrices.push();
        matrices.translate(0.81f, 1.02f, 0.5f);
        matrices.scale(0.15f, 0.3f, 0.15f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack6, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 7);
        matrices.pop();
        matrices.push();
        matrices.translate(0.75f, 1.02f, 0.75f);
        matrices.scale(0.15f, 0.3f, 0.15f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-90));

        switch (entity.getCachedState().get(BotanicalRitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(270));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(0));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90));
        }

        itemRenderer.renderItem(itemStack7, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 8);
        matrices.pop();
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}