
package net.mcreator.magicalium.item;

public class ASTRONIUMHoeItem extends HoeItem {
	public ASTRONIUMHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MagicaliumModItems.ASTRONIUM_INGOT.get()));
			}
		}, 0, 2f, new Item.Properties());
	}
}
