package me.tifu.adminhelp;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChatManagement implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("clean")) {
			if(sender.hasPermission("plugin.chat")) {
				for (int i = 0; i < 100; i++) {
					Bukkit.broadcastMessage("");
				}
				Bukkit.broadcastMessage(
						"§6→→→ §7Czat zostal §6wyczyszczony §7przez §6" + sender.getName() + "§7! §6←←←");
			}
		}
		return false;
	}
}