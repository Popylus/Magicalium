
package net.mcreator.magicalium.item;

import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class Magical_glass_armorArmorItem extends ArmorItem {

	public Magical_glass_armorArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 15;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{2, 5, 6, 2}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MagicaliumModItems.MAGICALGLASS.get()));
			}

			@Override
			public String getName() {
				return "magical_glass_armor_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends Magical_glass_armorArmorItem {

		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "magicalium:textures/models/armor/magical_glass_armor_layer_1.png";
		}

	}

	public static class Chestplate extends Magical_glass_armorArmorItem {

		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "magicalium:textures/models/armor/magical_glass_armor_layer_1.png";
		}

	}

	public static class Leggings extends Magical_glass_armorArmorItem {

		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "magicalium:textures/models/armor/magical_glass_armor_layer_2.png";
		}

	}

	public static class Boots extends Magical_glass_armorArmorItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "magicalium:textures/models/armor/magical_glass_armor_layer_1.png";
		}

	}

}
