package net.mcreator.magicalium.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class EffectastroforestTickActifSurEffetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			entity.setMaxUpStep(3);
		}
	}
}
