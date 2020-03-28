package me.noodles.nodrop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Event implements Listener {

    @EventHandler
    public void onThrow(PlayerDropItemEvent e) {
        e.setCancelled(!e.getPlayer().hasPermission("drop.allow"));
    }

}
