package net.marwinka.mysticalcrops.blockentities;
import net.marwinka.mysticalcrops.block.RitualTableBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3f;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class InfusionTableEntityRenderer implements BlockEntityRenderer<InfusionTableEntity> {
    public InfusionTableEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(InfusionTableEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();

        ItemStack itemStack = entity.getRenderStack();
        ItemStack itemStack1 = entity.getRenderStack1();
        ItemStack itemStack2 = entity.getRenderStack2();
        ItemStack itemStack3 = entity.getRenderStack3();
        ItemStack itemStacks = entity.getRenderStack4();

        matrices.push();
        matrices.translate(0.5, 1.2, 0.7);
        matrices.scale(0.2f, 0.3f, 0.2f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(0));
        switch (entity.getCachedState().get(RitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(270));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
        }
        itemRenderer.renderItem(itemStack, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 1);
        matrices.pop();


        matrices.push();
        matrices.translate(0.3, 1.2, 0.5);
        matrices.scale(0.2f, 0.3f, 0.2f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(0));
        switch (entity.getCachedState().get(RitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(270));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
        }
        itemRenderer.renderItem(itemStack1, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 2);
        matrices.pop();


        matrices.push();
        matrices.translate(0.7, 1.2, 0.5);
        matrices.scale(0.2f, 0.3f, 0.2f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(0));
        switch (entity.getCachedState().get(RitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(270));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
        }
        itemRenderer.renderItem(itemStack2, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 3);
        matrices.pop();


        matrices.push();
        matrices.translate(0.5, 1.2, 0.3);
        matrices.scale(0.2f, 0.3f, 0.2f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(0));
        switch (entity.getCachedState().get(RitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(270));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
        }
        itemRenderer.renderItem(itemStack3, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 4);
        matrices.pop();


        matrices.push();
        matrices.translate(0.5, 1.4, 0.5);
        matrices.scale(0.2f, 0.3f, 0.2f);
        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(0));
        switch (entity.getCachedState().get(RitualTableBlock.FACING)) {
            case NORTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            case SOUTH -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            case EAST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(270));
            case WEST -> matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
        }
        itemRenderer.renderItem(itemStacks, ModelTransformation.Mode.GUI, getLightLevel(entity.getWorld(), entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, 5);
        matrices.pop();
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}