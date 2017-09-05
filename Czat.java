package me.zymlok.czacik;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Czat implements Listener, CommandExecutor{
	
	public static Boolean chat;
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e){
		if(!chat){
			if(!e.getPlayer().hasPermission("plugin.chat.vip")){
				e.getPlayer().sendMessage("§cChat wylaczony!");
				e.setCancelled(true);
			}
		}
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("chat")){
			if(args.length ==1){
				return false;
			}
			if(args[0].equalsIgnoreCase("on")){
				if(chat){
					sender.sendMessage("chat wlaczony!");
					return true;
				}
				chat = true;
			}
			if(args[0].equalsIgnoreCase("off")){
				if(!chat){
					sender.sendMessage("chat wylaczony!");
					return true;
				}
				chat = false;
			}
			if(args[0].equalsIgnoreCase("toggle")){
				chat = !chat;
			}
			if(args[0].equalsIgnoreCase("clear")){
				int i = 0;
				while(i < 101){
					  for(Player p : Bukkit.getOnlinePlayers()){
					  	p.sendMessage("");
					  }
					i++;
				}
				Bukkit.broadcastMessage("§a§lChat wyczyszczony!");
			}
		}
		return false;
	}
}
