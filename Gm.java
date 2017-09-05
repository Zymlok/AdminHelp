package me.tifu.adminhelp;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gm implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("gm")){
			if(sender.hasPermission("plugin.gm")){
				if(args.length == 1){
					Player p = (Player) sender;
					if(args[0].equalsIgnoreCase("c")||args[0].equalsIgnoreCase("creative")|| args[0] == Integer.toString(1)){
						p.setGameMode(GameMode.CREATIVE);
						sender.sendMessage("§bTryb gry: §4Kreatywny");
					}
					if(args[0].equalsIgnoreCase("s")||args[0].equalsIgnoreCase("survival")|| args[0] == Integer.toString(0)){
						p.setGameMode(GameMode.SURVIVAL);
						sender.sendMessage("§bTryb gry: §2Przetrwanie");
					}
					if(args[0].equalsIgnoreCase("a")||args[0].equalsIgnoreCase("adventure")|| args[0] == Integer.toString(2)){
						p.setGameMode(GameMode.ADVENTURE);
						sender.sendMessage("§bTryb gry: §6Przygoda");
					}
				}
				if(args.length == 2){
					String pName = args[1];
					if(Bukkit.getPlayer(pName) != null){
						Player p = Bukkit.getPlayer(pName);
						String s = sender.getName();
						if(args[0].equalsIgnoreCase("c")||args[0].equalsIgnoreCase("creative")){
							p.setGameMode(GameMode.CREATIVE);
							p.sendMessage("§4"+s+" §bUstawil twoj tryb gry na: §4Kreatywny");
							sender.sendMessage("§bUstawiles §7"+pName+" §btryb gry: §4Kreatywny");
						}
						if(args[0].equalsIgnoreCase("s")||args[0].equalsIgnoreCase("survival")){
							p.setGameMode(GameMode.SURVIVAL);
							p.sendMessage("§4"+s+" §bUstawil twoj tryb gry na: §2Przetrwanie");
							sender.sendMessage("§bUstawiles §7"+pName+" §btryb gry: §2Przetrwanie");
						}
						if(args[0].equalsIgnoreCase("a")||args[0].equalsIgnoreCase("adventure")){
							p.setGameMode(GameMode.ADVENTURE);
							p.sendMessage("§4"+s+" §bUstawil twoj tryb gry na: §6Przygoda");
							sender.sendMessage("§bUstawiles §7"+pName+" §btryb gry: §6Przygoda");
						}
					}
					else{
						sender.sendMessage("Nie ma takiego gracza na serwerze! ");
					}
				}
			}
		}
		return false;
	}
}
