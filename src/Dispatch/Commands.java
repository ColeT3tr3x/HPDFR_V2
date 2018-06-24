package Dispatch;
import Core.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

import static Core.ColorUtil.color;

public class Commands implements CommandExecutor {

    private Main main;
    private HashMap<String,String> map = new HashMap<>();
    public Commands(Main plugin) {
        this.main = plugin;
    }
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You Can't Dispatch From Console!");
            return true;
        } else {
            Player p = (Player) sender;
        }
        if (args.length == 0) {
        {
            sender.sendMessage(color("Don't know the command? Try /dispatch help"));
            return true;
        }
        if ((args.length == 1) && args[1].equalsIgnoreCase("help")) {
            sender.sendMessage(color("&1&l[==== &4&lHPDFR Dispatch Menu! &1&l=====]"));
            sender.sendMessage(color("&l/dispatch add <Unit> &f- This adds a unit!"));
        }
        if ((args.length == 1) && args[0].equalsIgnoreCase("add")) {
            Player target = 
            if ((target == null) && map.containsKey("Units")) {
                    if (!map.containsValue(args[1])) {
                            map.put("-", args[1]);
                            sender.sendMessage(color(args[1]+"Has Been Added!"));
                            }
                           }
                          }
                          sender.sendMessage("That Won't Work. /dispatch help for help!");
                          return true;
                         }

//Ignore
//COMMAND ARG0 ARG1 ARG2

    }



}
