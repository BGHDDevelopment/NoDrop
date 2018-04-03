package me.noodles.nodrop;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Event implements Listener {

	
	
	  @EventHandler
	  public void onThrow(PlayerDropItemEvent e)
	  {
	    Player player = e.getPlayer();
	    if (!player.hasPermission("drop.allow"))  {
	    e.setCancelled(true);
	    }
	    if (player.hasPermission("drop.allow")) {
	      e.setCancelled(false);
	    }
	  }
	}