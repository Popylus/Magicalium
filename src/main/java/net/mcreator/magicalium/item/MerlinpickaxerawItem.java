
package net.mcreator.magicalium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.magicalium.init.MagicaliumModItems;

public class MerlinpickaxerawItem extends PickaxeItem {
	public MerlinpickaxerawItem() {
		super(new Tier() {
			public int getUses() {
				return 20;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MagicaliumModItems.MAGICALGLASS.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
