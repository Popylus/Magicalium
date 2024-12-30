package net.mcreator.magicalium.procedures;

import net.minecraftforge.eventbus.api.Event;

public class EffectastroforestTickActifSurEffetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			entity.setMaxUpStep(3);
		}
	}
}
