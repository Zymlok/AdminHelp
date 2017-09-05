package me.tifu.adminhelp;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Time implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("czas")) {
			if (sender.hasPermission("plugin.time")) {
				if (args.length == 1) {
					World w = ((Player) sender).getWorld();
					if (args[0].equalsIgnoreCase("dzien") || args[0].equalsIgnoreCase("d")) {
						w.setTime(8000);
						sender.sendMessage("§bZmieniles czas na: §6dzien!");
					} 
					else if (args[0].equalsIgnoreCase("noc") || args[0].equalsIgnoreCase("n")) {
						w.setTime(13000);
						sender.sendMessage("§bZmieniles czas na: §0noc!");
					} 
					else if (args[0].equalsIgnoreCase("poranek") || args[0].equalsIgnoreCase("r")) {
						w.setTime(1000);
						sender.sendMessage("§bZmieniles czas na: §aporanek!");
					} 
					else if (args[0].equalsIgnoreCase("wieczor") || args[0].equalsIgnoreCase("w")) {
						w.setTime(12500);
						sender.sendMessage("§bZmieniles czas na: §8wieczor!");
					} 
					else{
						sender.sendMessage("§4Wybierz: §6dzien§4, §0noc§4, §aporanek §4lub §8wieczor");
					}
				}
				else if(args.length == 2){
					String wName = args[1];
					if(Bukkit.getWorld(wName) != null){
						World w = Bukkit.getWorld(wName);
						if (args[0].equalsIgnoreCase("dzien") || args[0].equalsIgnoreCase("d")) {
							w.setTime(8000);
							sender.sendMessage("b7Zmieniles czas na: §6dzien!");
						} 
						else if (args[0].equalsIgnoreCase("noc") || args[0].equalsIgnoreCase("n")) {
							w.setTime(13000);
							sender.sendMessage("b7Zmieniles czas na: §0noc!");
						} 
						else if (args[0].equalsIgnoreCase("poranek") || args[0].equalsIgnoreCase("r")) {
							w.setTime(1000);
							sender.sendMessage("b7Zmieniles czas na: §aporanek!");
						} 
						else if (args[0].equalsIgnoreCase("wieczor") || args[0].equalsIgnoreCase("w")) {
							w.setTime(12500);
							sender.sendMessage("b7Zmieniles czas na: §8wieczor!");
						} 
						else {
							sender.sendMessage("§4Wybierz: §6dzien§4, §0noc§4, §aporanek §4lub §8wieczor");
						}
					}
				}
				else{
					sender.sendMessage("§4Wybierz: §6dzien§4, §0noc§4, §aporanek §4lub §8wieczor");
				}
			}
		}
		return false;
	}
}