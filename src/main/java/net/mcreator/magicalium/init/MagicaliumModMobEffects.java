
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.magicalium.potion.EffectastroforestMobEffect;
import net.mcreator.magicalium.MagicaliumMod;

public class MagicaliumModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MagicaliumMod.MODID);
	public static final RegistryObject<MobEffect> EFFECTASTROFOREST = REGISTRY.register("effectastroforest", () -> new EffectastroforestMobEffect());
}
