
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.magicalium.client.model.Modellecacadetriops;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MagicaliumModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modellecacadetriops.LAYER_LOCATION, Modellecacadetriops::createBodyLayer);
	}
}
