package me.tifu.adminhelp;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class Spawner implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args) {
		if (cmd.getName().equalsIgnoreCase("spawner")) {
			if (args.length != 1) {
				sender.sendMessage("");
				sender.sendMessage("§6Dostepne argumenty:");
				sender.sendMessage(
						"§acrepper, skeleton, spider, zombie, slime, ghast, enderman, cave_spider, silverfish, blaze, magma_cube, bat, witch, pig, sheep, cow, chicken, squid, wolf, ocelot, horse, villager, ender_dragon, wither !");
				sender.sendMessage("§6------------------");
				sender.sendMessage("");
				return false;
			}
			List<String> str = new ArrayList<String>();
			for (EntityType en : EntityType.values()) {
				str.add(en.name());
			}
			if (str.contains(args[0].toUpperCase())) {
				if (sender instanceof Player)
					((Player) sender).getLocation().getWorld().spawnEntity(((Player) sender).getLocation(),
							EntityType.valueOf(args[0].toUpperCase()));
			}
		}
		return false;
	}
}
