package controllpanel.adminpanel;

import controllpanel.adminpanel.Listenner.EventsListen;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdminPanel extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("I'm starting");
        Bukkit.getServer().getPluginManager().registerEvents(new EventsListen(), this);

        getCommand("lightning").setExecutor(new CommandKit());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}