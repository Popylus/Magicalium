
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.magicalium.client.renderer.MerlinlebossRenderer;
import net.mcreator.magicalium.client.renderer.GravitoRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MagicaliumModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MagicaliumModEntities.GRAVITO.get(), GravitoRenderer::new);
		event.registerEntityRenderer(MagicaliumModEntities.MERLINLEBOSS.get(), MerlinlebossRenderer::new);
	}
}
