package com.dorito.shopguiplusextension;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CreateItem {
	public ItemStack makeItem(Material m, String name, ArrayList<String> desc, int amount) {
		
		ItemStack item = new ItemStack(Material.GLASS, 1);
		
		if (amount > 0) {
			item = new ItemStack(m, amount);
			//Create metadata
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(name);
			//Creates lore
			im.setLore(desc);
			im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			
			//Sets item meta
			item.setItemMeta(im);
		} else {
			item = new ItemStack(Material.WOOL, 1, (byte) 14);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Cancel");
			im.setLore(desc);
			im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item.setItemMeta(im);
		}
		
		return item;
	}
	
	public ItemStack create(String mob, int priceOfOne, int amount) {
		Material m = Material.MOB_SPAWNER;
		String name = ChatColor.WHITE + "" + ChatColor.BOLD + mob + " Spawner";		
		ArrayList<String> desc = new ArrayList<String>();
//		desc.add(mob);
		desc.add(convertToInvisibleString(mob));
//		desc.add(Integer.toString(priceOfOne));
		desc.add(convertToInvisibleString(Integer.toString(priceOfOne)));	
		
		return makeItem(m, name, desc, amount);
	}
	
    public static String convertToInvisibleString(String s) {
        String hidden = "";
        for (char c : s.toCharArray()) hidden += ChatColor.COLOR_CHAR + "" + c;
        return hidden;
    }

}
