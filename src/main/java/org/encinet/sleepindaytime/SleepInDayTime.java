package org.encinet.sleepindaytime;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SleepInDayTime extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("SleepInDay has already started.");
    }
    @Override
    public void onDisable() {
        getLogger().info("SleepInDay has already stopped.");
    }
    @EventHandler
    public void getPlayerBedInfo(PlayerBedEnterEvent event) {
        Block bed = event.getBed();
        Material bedType = bed.getType();
        if (bedType.name().endsWith("_BED")) {
            event.setUseBed(Event.Result.ALLOW);
        }
    }
}
