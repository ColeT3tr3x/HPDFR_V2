package Dispatch;
import Core.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import Dispatch.Unit;

import java.util.HashMap;

import static Core.ColorUtil.color;

public class Commands implements CommandExecutor {

    private Main main;
    private HashMap<Unit, Player> map = new HashMap<>();
    Unit un = new Unit("u");


    public Commands(Main plugin) {
        this.main = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You Can't Dispatch From Console!");
            return true;

        if (args.length == 0) {
            {
                sender.sendMessage(color("Don't know the command? Try /dispatch help"));
                return true;
            }
        }
        if ((args.length == 1) && args[1].equalsIgnoreCase("help")) {
            sender.sendMessage(color("&1&l[======= &4&lHPDFR Dispatch Menu! &1&l=======]"));
            sender.sendMessage(color("&l/dispatch add <Unit> &f-Add a unit!"));
            sender.sendMessage(color("&l/dispatch hire <Player> <Unit> &f-Hire Someone to a unit"));
            sender.sendMessage(color("&1&l[=========== &5&lMade by T3tr3x &1&l=========]"));
        }
        if ((args.length == 1) && args[0].equalsIgnoreCase("add")) {
            !map.containsValue(Object args[1]);
            if (!map.containsKey(Unit)) {
                 map.keySet(Unit);
            }
                 map.put(Unit, args[1]);
                 sender.sendMessage(color(args[1] + "&lHas Been Added!"));
        }

        }
        sender.sendMessage("False");
        return true;
        }

        }







//Ignore
//COMMAND ARG0 ARG1 ARG2

