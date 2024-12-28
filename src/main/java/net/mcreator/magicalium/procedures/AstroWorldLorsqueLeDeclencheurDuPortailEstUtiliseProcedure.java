package net.mcreator.magicalium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.magicalium.init.MagicaliumModMobEffects;

public class AstroWorldLorsqueLeDeclencheurDuPortailEstUtiliseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		while (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("magicalium:astroniumforest"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MagicaliumModMobEffects.EFFECTASTROFOREST.get(), 60, 1, false, false));
		}
	}
}
