package de.tomstahlberg.goldenskyblock;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.BoundingBox;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public final class Goldenskyblock extends JavaPlugin {

    public static HashMap<UUID, BoundingBox> islands; //owner, island corners/island region
    public static HashMap<UUID, List<UUID>> islandMembers; //owner, list with island members
    public static Plugin plugin; //accessible plugin
    @Override
    public void onEnable() {
        plugin = this;
        islands = new HashMap<>();
        islandMembers = new HashMap<>();

    }

    @Override
    public void onDisable() {

    }
}
