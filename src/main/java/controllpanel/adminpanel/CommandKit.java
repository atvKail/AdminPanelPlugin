package controllpanel.adminpanel;

import com.google.common.primitives.Ints;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandKit implements CommandExecutor {
    static public void light(Player p, int count){
        for(int i = 0; i < count; i++) {
            p.getWorld().strikeLightning(p.getLocation());
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (cmd.getName().equalsIgnoreCase("lightning")){
            int count = 1;
            if (args.length >= 2 && Ints.tryParse(args[1]) != null) {
                count = Integer.parseInt(args[1]);
            }
            if (args[0].equalsIgnoreCase("@a")){
                for (Player p : Bukkit.getOnlinePlayers()){
                    light(p, count);
                }
            }
            if (Bukkit.getPlayer(args[0]) != null) {
                Player victim = Bukkit.getPlayer(args[0]);
                light(victim, count);
            }
        }
        return  true;
    }
}
