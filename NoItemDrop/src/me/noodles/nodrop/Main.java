package me.noodles.nodrop;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {	
	getServer().getPluginManager().registerEvents(new Event(), this);
	getServer().getConsoleSender().sendMessage("NoDrop has been enabled!");
	}
	
	@Override
	public void onDisable() {
	getServer().getConsoleSender().sendMessage("NoDrop has been disabled!");
	}
	
	
}
