package controllpanel.adminpanel;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventsListen implements Listener{
    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e){
        Player actor = e.getPlayer();
        if (actor.hasPermission("admin")){
            String message = ChatColor.DARK_BLUE + String.format("Administrator %s joined", actor.getDisplayName());
            for (Player p : Bukkit.getOnlinePlayers()){
                p.sendMessage(message);
            }
            actor.playSound(actor.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 70, 10);
        }
    }
}
