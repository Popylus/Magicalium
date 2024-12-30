package net.mcreator.magicalium.procedures;

import net.minecraft.world.entity.Entity;

public class EffectastroforestTickActifSurEffetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setMaxUpStep(3);
	}
}
