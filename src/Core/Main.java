package Core;
import Dispatch.Commands;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    private static Main instance;
    private FileControl fc;

    @Override
    public void onEnable() {

        fc = new FileControl(new File(getDataFolder(), "config.yml"));
        fc.getConfig().set("Test1.Test2", false);
        fc.save();



        getLogger().info("Starting, HPDFR V: 2.0");
        getLogger().info("[=====================]");
        getLogger().info("[== LOADED HPDFR =====]");
        getLogger().info("[===== Woop Woop! ====]");
        getLogger().info("[=====================]");
        getLogger().warning("DISPATCH: ACTIVATED");
        getLogger().warning("Loading Commands...");
        registerCommands();
        getLogger().info("Loaded Commands!");
    }
    @Override
    public void onDisable() {

        getLogger().info("Ending, HPDFR V: 2.0");
        getLogger().info("[=====================]");
        getLogger().info("[== DISABLED HPDFR ===]");
        getLogger().info("[========= Bye! ========]");
        getLogger().info("[=====================]");
        getLogger().warning("DISPATCH: DISABLED");
        getLogger().warning("Commands UNLOADED...");
        fc.save();

        //Info Here

    }

    public static Main getInstance() { return instance; }
    private void registerCommands() {
        this.getCommand("dispatch").setExecutor(new Commands(this));
    }

    public FileControl getConfigfc() {
        return this.fc;
    }
}
