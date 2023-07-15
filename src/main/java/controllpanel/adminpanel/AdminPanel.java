package controllpanel.adminpanel;

import controllpanel.adminpanel.Commands.GetPositionCommand;
import controllpanel.adminpanel.Commands.lightningCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdminPanel extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("I'm starting");
        Bukkit.getServer().getPluginManager().registerEvents(new EventsListen(), this);

        getCommand("lightning").setExecutor(new lightningCommand());
        getCommand("getposition").setExecutor(new GetPositionCommand());
    }
}
