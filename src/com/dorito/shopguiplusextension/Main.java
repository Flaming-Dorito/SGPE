package com.dorito.shopguiplusextension;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		SGPEListener listener = new SGPEListener(this);
		pm.registerEvents(listener, this);
		getLogger().info("GSPE Plugin has been enabled :D");
	}

	@Override
	public void onDisable() {
		getLogger().info("GSPE Plugin has been disabled :D");
	}

	

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		if (!(sender instanceof Player)) {

//			Player player = (Player) sender;
			
			String lowerCmd = cmd.getName().toLowerCase();
			
			switch (lowerCmd) {
			case "spawnerconfirm":
				if (args.length < 3 || args.length > 3) {
					sender.sendMessage("SpawnerConfirm Usage: /spawnerconfirm [player] [mob] [price]");
					return true;
				} else {
					// main code for confirmation
					Server server = Bukkit.getServer();
					server.dispatchCommand(server.getConsoleSender(), "eco give " + args[0] + " " + args[2]);
					boolean success = SGPEGUI.openGUI(Bukkit.getServer().getPlayer(args[0]), args[1], Integer.parseInt(args[2]));
					if (!success) {
						sender.sendMessage("Something went wrong");
					}
					return true;
				}
				
			default:
				return true;
			}
		}
		sender.sendMessage("You cannot execute this command.");
		return true;
	}
	
	public int getConfirm(Player player) {
		return 1;
	}
	
}

//TODO:
//	check if typing random command like /sdgfsdfs causes the 'you cannot execute' message