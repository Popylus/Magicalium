
package net.mcreator.magicalium.potion;

public class EffectastroforestMobEffect extends MobEffect {
	public EffectastroforestMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		BiomeEffectConditionDeTickActifProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}