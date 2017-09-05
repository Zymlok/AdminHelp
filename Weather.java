package me.tifu.adminhelp;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Weather implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("weather")){
			if(sender.hasPermission("plugin.weather")){
				if(args.length == 1){
					World w = ((Player) sender).getWorld();
					if(args[0].equalsIgnoreCase("s")|| args[0].equalsIgnoreCase("slonce")){
						w.setStorm(false);
						w.setThundering(false);
						sender.sendMessage("§bPogoda: §eSloneczna");
					}
					else if(args[0].equalsIgnoreCase("d")|| args[0].equalsIgnoreCase("deszcz")){
						w.setStorm(true);
						w.setThundering(false);
						sender.sendMessage("§bPogoda: §7Deszczowa");
					}
					else if(args[0].equalsIgnoreCase("b")|| args[0].equalsIgnoreCase("burza")){
						w.setStorm(true);
						w.setThundering(true);
						sender.sendMessage("§bPogoda: §8Burzowa");
					}
					else{
						sender.sendMessage("Wybierz: deszcz/d, slonce/s, burza/b");
					}
				}
				else{
					sender.sendMessage("Wybierz: deszcz/d, slonce/s, burza/b");
				}
			}
		}
		return false;
	}
}
