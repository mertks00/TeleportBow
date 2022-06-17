package me.oyuncozucu.teleportbow;

import me.oyuncozucu.teleportbow.commands.GiveCommand;
import me.oyuncozucu.teleportbow.listeners.BowListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeleportBow extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("bow").setExecutor(new GiveCommand());
        Bukkit.getPluginManager().registerEvents(new BowListener(), this);

    }

}
