package net.mcreator.magicalium.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ASTRONIUMArmorEvenementDeTickDuPlastronProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 1));
	}
}
