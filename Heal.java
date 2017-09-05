package me.tifu.adminhelp;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("heal")){
			if(sender.hasPermission("plugin.heal")){
				if(args.length == 0){
					if(!(sender instanceof Player)){
						return false;
					}
					Player p = (Player) sender;
					p.setFireTicks(0);
					p.setFoodLevel(20);
					p.setHealth(20);
					p.sendMessage("Zostales uleczony");
				}
				if(args.length == 1){
					String pName = args[0];
					if(Bukkit.getPlayer(pName) !=null){
						Player p = Bukkit.getPlayer(pName);
						p.setFireTicks(0);
						p.setFoodLevel(20);
						p.setHealth(20);
						p.sendMessage("Zostales uleczony");
					}
					else{
						sender.sendMessage("Nie ma takiego gracza na serwerze !");
					}
				}
			}
		}
		return false;
	}
}
