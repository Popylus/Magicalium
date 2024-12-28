package net.mcreator.magicalium.client.model;

import net.minecraftforge.client.model.data.ModelData;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Modellecacadetriops extends EntityModel<Entity> {
	public final ModelPart bb_main;

	public Modellecacadetriops(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -37.0F, -4.0F, 8.0F, 5.0F, 8.0F, new Dilation(0.0F)).uv(0, 13).cuboid(-2.0F, -42.0F, -2.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.0F)),
				ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}