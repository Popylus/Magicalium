package net.mcreator.magicalium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.magicalium.entity.GravitoEntity;

public class GravitoModel extends GeoModel<GravitoEntity> {
	@Override
	public ResourceLocation getAnimationResource(GravitoEntity entity) {
		return new ResourceLocation("magicalium", "animations/gravito.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GravitoEntity entity) {
		return new ResourceLocation("magicalium", "geo/gravito.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GravitoEntity entity) {
		return new ResourceLocation("magicalium", "textures/entities/" + entity.getTexture() + ".png");
	}

}
