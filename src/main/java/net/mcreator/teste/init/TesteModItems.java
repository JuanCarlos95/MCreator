
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teste.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.teste.item.DoomIngotSwordItem;
import net.mcreator.teste.item.DoomIngotShovelItem;
import net.mcreator.teste.item.DoomIngotPickaxeItem;
import net.mcreator.teste.item.DoomIngotIngotItem;
import net.mcreator.teste.item.DoomIngotHoeItem;
import net.mcreator.teste.item.DoomIngotAxeItem;
import net.mcreator.teste.item.DoomIngotArmorItem;
import net.mcreator.teste.TesteMod;

public class TesteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TesteMod.MODID);
	public static final RegistryObject<Item> DOOM_INGOT_INGOT = REGISTRY.register("doom_ingot_ingot", () -> new DoomIngotIngotItem());
	public static final RegistryObject<Item> DOOM_INGOT_ORE = block(TesteModBlocks.DOOM_INGOT_ORE, CreativeModeTab.TAB_MATERIALS);
	public static final RegistryObject<Item> DOOM_INGOT_BLOCK = block(TesteModBlocks.DOOM_INGOT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOOM_INGOT_PICKAXE = REGISTRY.register("doom_ingot_pickaxe", () -> new DoomIngotPickaxeItem());
	public static final RegistryObject<Item> DOOM_INGOT_AXE = REGISTRY.register("doom_ingot_axe", () -> new DoomIngotAxeItem());
	public static final RegistryObject<Item> DOOM_INGOT_SWORD = REGISTRY.register("doom_ingot_sword", () -> new DoomIngotSwordItem());
	public static final RegistryObject<Item> DOOM_INGOT_SHOVEL = REGISTRY.register("doom_ingot_shovel", () -> new DoomIngotShovelItem());
	public static final RegistryObject<Item> DOOM_INGOT_HOE = REGISTRY.register("doom_ingot_hoe", () -> new DoomIngotHoeItem());
	public static final RegistryObject<Item> DOOM_INGOT_ARMOR_HELMET = REGISTRY.register("doom_ingot_armor_helmet",
			() -> new DoomIngotArmorItem.Helmet());
	public static final RegistryObject<Item> DOOM_INGOT_ARMOR_CHESTPLATE = REGISTRY.register("doom_ingot_armor_chestplate",
			() -> new DoomIngotArmorItem.Chestplate());
	public static final RegistryObject<Item> DOOM_INGOT_ARMOR_LEGGINGS = REGISTRY.register("doom_ingot_armor_leggings",
			() -> new DoomIngotArmorItem.Leggings());
	public static final RegistryObject<Item> DOOM_INGOT_ARMOR_BOOTS = REGISTRY.register("doom_ingot_armor_boots",
			() -> new DoomIngotArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
