package com.dorito.shopguiplusextension;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;



public class SGPEGUI {
	
	public static CreateItem spawner = new CreateItem();
	public static Inventory confirmationGUI = Bukkit.createInventory(null, 45, "Spawner Confirmation");
	
	public SGPEGUI() {
		
	}
	
	public static boolean openGUI (Player player, String mob, int price) {
		confirmationGUI.setItem(0, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 0));
		confirmationGUI.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(4, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(8, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 0));
		
		confirmationGUI.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(10, spawner.create(mob, price, 0));
		confirmationGUI.setItem(11, spawner.create(mob, price, 1));
		confirmationGUI.setItem(12, spawner.create(mob, price, 2));
		confirmationGUI.setItem(13, spawner.create(mob, price, 3));
		confirmationGUI.setItem(14, spawner.create(mob, price, 4));
		confirmationGUI.setItem(15, spawner.create(mob, price, 5));
		confirmationGUI.setItem(16, spawner.create(mob, price, 6));
		confirmationGUI.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		
		confirmationGUI.setItem(18, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(19, spawner.create(mob, price, 8));
		confirmationGUI.setItem(20, spawner.create(mob, price, 10));
		confirmationGUI.setItem(21, spawner.create(mob, price, 12));
		confirmationGUI.setItem(22, spawner.create(mob, price, 14));
		confirmationGUI.setItem(23, spawner.create(mob, price, 16));
		confirmationGUI.setItem(24, spawner.create(mob, price, 18));
		confirmationGUI.setItem(25, spawner.create(mob, price, 20));
		confirmationGUI.setItem(26, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		
		confirmationGUI.setItem(27, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(28, spawner.create(mob, price, 26));
		confirmationGUI.setItem(29, spawner.create(mob, price, 32));
		confirmationGUI.setItem(30, spawner.create(mob, price, 38));
		confirmationGUI.setItem(31, spawner.create(mob, price, 44));
		confirmationGUI.setItem(32, spawner.create(mob, price, 50));
		confirmationGUI.setItem(33, spawner.create(mob, price, 56));
		confirmationGUI.setItem(34, spawner.create(mob, price, 64));
		confirmationGUI.setItem(35, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		
		confirmationGUI.setItem(36, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 0));
		confirmationGUI.setItem(37, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(38, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(39, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(40, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(41, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(42, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(43, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 5));
		confirmationGUI.setItem(44, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 0));
		player.openInventory(confirmationGUI);
		return true;
	}
	
}
