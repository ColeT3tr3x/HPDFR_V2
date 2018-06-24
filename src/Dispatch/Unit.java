package Dispatch;
import org.bukkit.entity.Player;

public class Unit {
    private String unitName;
    private Player player;

    public Unit(String Name, Player player) {
        this.unitName = Name;
        this.player = Player;
        Commands.units.add(this);
    }

    public Player getPlayer(){
        return player;
    }

    public String getName(){
        return unitName;
    }

    public String toString() {
        return this.playerName+"is at"+unitLocation;
    }


}
/*
map.get(player)//returns the unit
        unit.getPlayers()//returns the other players
*/