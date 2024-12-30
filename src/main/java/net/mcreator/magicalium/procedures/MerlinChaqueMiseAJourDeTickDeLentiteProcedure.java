package net.mcreator.magicalium.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MerlinChaqueMiseAJourDeTickDeLentiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == MagicaliumModBlocks.DUNGEONFLORRMAGICAL.get()) {
			if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) == entity) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("detected player"), false);
			}
		}
	}
}
