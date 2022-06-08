
package net.mcreator.teste.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.teste.init.TesteModItems;

public class DoomIngotAxeItem extends AxeItem {
	public DoomIngotAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 100f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TesteModItems.DOOM_INGOT_INGOT.get()));
			}
		}, 1, -1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
