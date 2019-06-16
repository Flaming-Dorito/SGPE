package com.dorito.shopguiplusextension;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
//import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.RegisteredServiceProvider;

import net.milkbowl.vault.economy.Economy;

public class SGPEListener implements Listener{
	
	public static Economy econ = null;
	private boolean setupEconomy() {
	    RegisteredServiceProvider<Economy> economyProvider = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
	    if (economyProvider != null) {
	        econ = economyProvider.getProvider();
	    }

	    return (econ != null);
	}
	
	public SGPEListener(Main plugin) {
		
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {

		Player player = (Player) event.getWhoClicked();
		OfflinePlayer offPlayer = (OfflinePlayer) player;
//		Inventory inventory =  event.getInventory();
		String inventoryTitle = event.getView().getTitle();
		boolean goBack = false;
		if (inventoryTitle == "Spawner Confirmation" && event.getSlotType() != SlotType.OUTSIDE) {
			setupEconomy();
			if (event.getClick().isKeyboardClick() || event.getClick().isShiftClick()) {
				event.setCancelled(true);
			} else if (!(event.getCurrentItem().getType() == Material.STAINED_GLASS_PANE)){
				ItemStack clicked = event.getCurrentItem();
				Material clickedType = clicked.getType();
				int amount = clicked.getAmount();
				int price = Integer.parseInt(clicked.getItemMeta().getLore().get(1).replaceAll("" + ChatColor.COLOR_CHAR, ""));
				Server server = Bukkit.getServer();
				if (clickedType == Material.WOOL) {
					goBack = true;
					player.sendMessage("Spawner purchase cancelled successfully.");
				} else if (clickedType == Material.MOB_SPAWNER) {
					String mob = clicked.getItemMeta().getLore().get(0).replaceAll("" + ChatColor.COLOR_CHAR, "");
					if (amount == 1) {
						server.dispatchCommand(server.getConsoleSender(), "es give " + player.getName() + " " + mob + " " + Integer.toString(amount));
						server.dispatchCommand(server.getConsoleSender(), "eco take " + player.getName() + " " + Integer .toString(price*(amount)));
					} else if (econ.getBalance(offPlayer) >= (double) price*amount) {
						server.dispatchCommand(server.getConsoleSender(), "es give " + player.getName() + " " + mob + " " + Integer.toString(amount));
						server.dispatchCommand(server.getConsoleSender(), "eco take " + player.getName() + " " + Integer .toString(price*(amount)));
					} else {
						player.sendMessage("Insufficient Balance. $" + Integer.toString(amount*price) + " is required to purchase " + Integer.toString(amount) + " " + mob + " Spawners.");
					}
				}
				
				event.setCancelled(true);
				player.closeInventory();
				if (goBack) {
					server.dispatchCommand(server.getConsoleSender(), "sudo " + player.getName() + " shop MysticSpawnerss");
				}
			} else {
				event.setCancelled(true);
			}
			
		}
		
	}

	
}
