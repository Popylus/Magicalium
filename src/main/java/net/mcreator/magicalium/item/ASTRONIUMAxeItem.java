
package net.mcreator.magicalium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.magicalium.init.MagicaliumModItems;

public class ASTRONIUMAxeItem extends AxeItem {
	public ASTRONIUMAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 6f;
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
		}, 1, 2f, new Item.Properties());
	}
}
