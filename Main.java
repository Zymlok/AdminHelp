package me.tifu.adminhelp;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		System.out.println("Uruchamiam ...");
		getCommand("heal").setExecutor(new Heal());
		getCommand("weather").setExecutor(new Weather());
		getCommand("gm").setExecutor(new Gm());
		getCommand("tp").setExecutor(new Tp());
		getCommand("tphere").setExecutor(new TpHere());
		getCommand("czas").setExecutor(new Time());
		getCommand("clean").setExecutor(new ChatManagement());
		getCommand("spawner").setExecutor(new Spawner());
	}
	public void onDisable(){
		System.out.println("Wy³¹czam...");
	}
	boolean stat = false;
}
