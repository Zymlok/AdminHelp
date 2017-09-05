package me.tifu.adminhelp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tp implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("tp")){
			if(sender.hasPermission("plugin.tp")){
				if(sender instanceof Player){
					if(args.length == 1){
						Player cel = Bukkit.getPlayer(args[0]);
						Location l = cel.getLocation();
						((Player) sender).teleport(l);
					}
					else if(args.length == 2){
						if(!(Bukkit.getPlayer(args[0]) != null)){
							sender.sendMessage("Nie ma takiego gracza na serwerze !"+args[0]);
						}
						if(!(Bukkit.getPlayer(args[1]) != null)){
							sender.sendMessage("Nie ma takiego gracza na serwerze !"+args[1]);
						}
						Player cel = Bukkit.getPlayer(args[0]);
						Player p = Bukkit.getPlayer(args[1]);
						Location l = cel.getLocation();
						p.teleport(l);
					}
					else{
						sender.sendMessage("Za malo argumentow");
					}
				}
				return false;
			}
		}
		return false;
	}
}
