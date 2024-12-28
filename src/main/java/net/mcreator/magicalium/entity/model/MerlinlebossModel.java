package net.mcreator.magicalium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.magicalium.entity.MerlinlebossEntity;

public class MerlinlebossModel extends GeoModel<MerlinlebossEntity> {
	@Override
	public ResourceLocation getAnimationResource(MerlinlebossEntity entity) {
		return new ResourceLocation("magicalium", "animations/merlin_le_boss_for_gekho.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MerlinlebossEntity entity) {
		return new ResourceLocation("magicalium", "geo/merlin_le_boss_for_gekho.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MerlinlebossEntity entity) {
		return new ResourceLocation("magicalium", "textures/entities/" + entity.getTexture() + ".png");
	}

}
