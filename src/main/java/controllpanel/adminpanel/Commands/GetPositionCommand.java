package controllpanel.adminpanel.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetPositionCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (cmd.getName().equalsIgnoreCase("getposition")){
            if (args.length > 0 && Bukkit.getPlayer(args[0]) != null) {
                Location loc = Bukkit.getPlayer(args[0]).getLocation();
                ((Player)sender).sendMessage(String.format
                        (
                                ChatColor.RED+"X:%d "+
                                ChatColor.BLUE+"Y:%d "+
                                ChatColor.YELLOW+"Z:%d ",
                                loc.getBlockX(), loc.getBlockY(), loc.getBlockZ()));
                return true;
            }
        }
        return  false;
    }
}
