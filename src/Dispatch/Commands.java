package Dispatch;
import Core.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import Dispatch.Unit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static Core.ColorUtil.color;

public class Commands implements CommandExecutor {

    private Main main;
    public static List<Unit> units = new ArrayList<Unit>();


    public Commands(Main plugin) {
        this.main = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You Can't Dispatch From Console!");
            return true;
        }
        //Bracket should have closed off here as this is process of elimination.

        if (args.length == 0) {
            sender.sendMessage(color("Don't know the command? Try /dispatch help"));
            return true;
        }
        if ((args.length == 1) && args[1].equalsIgnoreCase("help")) {
            sender.sendMessage(color("&1&l[======= &4&lHPDFR Dispatch Menu! &1&l=======]"));
            sender.sendMessage(color("&l/dispatch add <Unit> &f-Add a unit!"));
            sender.sendMessage(color("&l/dispatch hire <Player> <Unit> &f-Hire Someone to a unit"));
            sender.sendMessage(color("&1&l[=========== &5&lMade by T3tr3x &1&l=========]"));
            return true;
        }
        if ((args.length == 2) && args[0].equalsIgnoreCase("add")) {
            //loop through existing units to see if the args already exists, return false if it does, process of elimination
            for (Unit unit : units)
                if (unit.getName().equalsIgnoreCase(args[1])) {
                return false;
            }
            //this stage will only be reached if the arg doesnt exist, create a new instance of the unit
            Unit u = new Unit("u", (Player)sender);
            sender.sendMessage(color(args[1] + "&lHas Been Added!"));
            return true;
        }

    }

}







//Ignore
//COMMAND ARG0 ARG1 ARG2

