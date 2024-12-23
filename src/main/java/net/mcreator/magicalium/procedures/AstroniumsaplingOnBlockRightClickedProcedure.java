package net.mcreator.magicalium.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AstroniumsaplingOnBlockRightClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(5);
		}
	}
}
