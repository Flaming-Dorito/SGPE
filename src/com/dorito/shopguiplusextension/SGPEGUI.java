package com.dorito.shopguiplusextension;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;





public class SGPEGUI {
	
	public static CreateItem spawner = new CreateItem();
	public static Inventory confirmationGUI = Bukkit.createInventory(null, 45, "Spawner Confirmation");
	
	public SGPEGUI() {
		
	}
	
	public static boolean openGUI (Player player, String mob, int price) {
		ItemStack redGlass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
		ItemMeta redIm = redGlass.getItemMeta();
		redIm.setDisplayName(ChatColor.BLACK + " ");
		redGlass.setItemMeta(redIm);
		ItemStack blackGlass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
		ItemMeta blackIm = blackGlass.getItemMeta();
		blackIm.setDisplayName(ChatColor.BLACK + " ");
		blackGlass.setItemMeta(blackIm);
		confirmationGUI.setItem(0, redGlass);
		confirmationGUI.setItem(1, blackGlass);
		confirmationGUI.setItem(2, blackGlass);
		confirmationGUI.setItem(3, blackGlass);
		confirmationGUI.setItem(4, blackGlass);
		confirmationGUI.setItem(5, blackGlass);
		confirmationGUI.setItem(6, blackGlass);
		confirmationGUI.setItem(7, blackGlass);
		confirmationGUI.setItem(8, redGlass);
		
		confirmationGUI.setItem(9, blackGlass);
		confirmationGUI.setItem(10, spawner.create(mob, price, 0));
		confirmationGUI.setItem(11, spawner.create(mob, price, 1));
		confirmationGUI.setItem(12, spawner.create(mob, price, 2));
		confirmationGUI.setItem(13, spawner.create(mob, price, 3));
		confirmationGUI.setItem(14, spawner.create(mob, price, 4));
		confirmationGUI.setItem(15, spawner.create(mob, price, 5));
		confirmationGUI.setItem(16, spawner.create(mob, price, 6));
		confirmationGUI.setItem(17, blackGlass);
		
		confirmationGUI.setItem(18, blackGlass);
		confirmationGUI.setItem(19, spawner.create(mob, price, 8));
		confirmationGUI.setItem(20, spawner.create(mob, price, 10));
		confirmationGUI.setItem(21, spawner.create(mob, price, 12));
		confirmationGUI.setItem(22, spawner.create(mob, price, 14));
		confirmationGUI.setItem(23, spawner.create(mob, price, 16));
		confirmationGUI.setItem(24, spawner.create(mob, price, 18));
		confirmationGUI.setItem(25, spawner.create(mob, price, 20));
		confirmationGUI.setItem(26, blackGlass);
		
		confirmationGUI.setItem(27, blackGlass);
		confirmationGUI.setItem(28, spawner.create(mob, price, 26));
		confirmationGUI.setItem(29, spawner.create(mob, price, 32));
		confirmationGUI.setItem(30, spawner.create(mob, price, 38));
		confirmationGUI.setItem(31, spawner.create(mob, price, 44));
		confirmationGUI.setItem(32, spawner.create(mob, price, 50));
		confirmationGUI.setItem(33, spawner.create(mob, price, 56));
		confirmationGUI.setItem(34, spawner.create(mob, price, 64));
		confirmationGUI.setItem(35, blackGlass);
		
		confirmationGUI.setItem(36, redGlass);
		confirmationGUI.setItem(37, blackGlass);
		confirmationGUI.setItem(38, blackGlass);
		confirmationGUI.setItem(39, blackGlass);
		confirmationGUI.setItem(40, blackGlass);
		confirmationGUI.setItem(41, blackGlass);
		confirmationGUI.setItem(42, blackGlass);
		confirmationGUI.setItem(43, blackGlass);
		confirmationGUI.setItem(44, redGlass);
		player.openInventory(confirmationGUI);
		return true;
	}
	
}
