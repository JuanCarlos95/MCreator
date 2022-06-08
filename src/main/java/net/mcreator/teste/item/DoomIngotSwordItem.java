
package net.mcreator.teste.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.teste.init.TesteModItems;

public class DoomIngotSwordItem extends SwordItem {
	public DoomIngotSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 9997f;
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
		}, 3, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
