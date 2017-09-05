package me.tifu.adminhelp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpHere implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("tphere")){
			if(sender.hasPermission("plugin.tphere")){
				if(sender instanceof Player){
					if(args.length == 1){
						Player p = (Player) sender;
						Player cel = Bukkit.getPlayer(args[0]);
						Location l = p.getLocation();
						cel.teleport(l);
					}
					if(args.length != 1){
						sender.sendMessage("Za malo argumentow");
					}
				}
			}
		}
		return false;
	}
}
