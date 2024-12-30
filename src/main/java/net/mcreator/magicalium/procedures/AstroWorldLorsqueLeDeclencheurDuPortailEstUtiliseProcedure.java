package net.mcreator.magicalium.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.magicalium.init.MagicaliumModMobEffects;

public class AstroWorldLorsqueLeDeclencheurDuPortailEstUtiliseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MagicaliumModMobEffects.EFFECTASTROFOREST.get(), 60, 1, true, false));
		}
	}
}
