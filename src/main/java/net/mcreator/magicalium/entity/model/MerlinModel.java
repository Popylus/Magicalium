package net.mcreator.magicalium.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class MerlinModel extends GeoModel<MerlinEntity> {
	@Override
	public ResourceLocation getAnimationResource(MerlinEntity entity) {
		return new ResourceLocation("magicalium", "animations/merlin_le_boss_for_gekho.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MerlinEntity entity) {
		return new ResourceLocation("magicalium", "geo/merlin_le_boss_for_gekho.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MerlinEntity entity) {
		return new ResourceLocation("magicalium", "textures/entities/" + entity.getTexture() + ".png");
	}

}