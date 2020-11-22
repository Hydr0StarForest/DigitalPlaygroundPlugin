package net.eve0415.spigot.Template;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Copy the config.yml in the plugin configuration folder if it doesn't exists.
        this.saveDefaultConfig();
        // Do something if your plugin needs it (registering commands / listeners)
        getLogger().info("Plugin enabled");
    }

    @Override
    public void onDisable() {
        // Do something if your plugin needs it (saving custom configs, clearing cache,
        // closing connections...)
        getLogger().info("Plugin disabled");
    }
}
