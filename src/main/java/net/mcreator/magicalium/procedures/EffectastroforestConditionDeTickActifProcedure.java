package net.mcreator.magicalium.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class EffectastroforestConditionDeTickActifProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while (entity instanceof Player) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1, false, false));
		}
	}
}
