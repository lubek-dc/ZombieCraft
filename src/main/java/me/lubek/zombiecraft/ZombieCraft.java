package me.lubek.zombiecraft;

import dev.lone.itemsadder.api.ItemsAdder;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class ZombieCraft extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public static void OnPlayerWalk(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        Block block = e.getPlayer().getLocation().getWorld().getBlockAt(e.getPlayer().getLocation().getBlockX(),e.getPlayer().getLocation().getBlockY()-1,e.getPlayer().getLocation().getBlockZ());
        if(block.getType()== Material.GOLD_BLOCK) {
            p.getWorld().strikeLightning(block.getLocation());
        }
    }
}
