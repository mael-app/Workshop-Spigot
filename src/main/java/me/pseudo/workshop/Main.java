package me.pseudo.workshop;

import me.pseudo.workshop.commands.SayCommand;
import me.pseudo.workshop.listeners.JoinQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinQuitEvent(), this);

        getCommand("say").setExecutor(new SayCommand());
    }

    @Override
    public void onDisable() {

    }
}

