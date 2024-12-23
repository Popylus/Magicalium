package net.mcreator.magicalium.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AstroniumarbreprocedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("magicalium", "arbre_astronium"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
						_serverworld.random, 3);
			}
		}
	}
}
