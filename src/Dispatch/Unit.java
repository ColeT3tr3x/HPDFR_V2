package Dispatch;
import org.bukkit.entity.Player;

public class Unit {
    Unit un = new Unit("u");
    private String unitName;
    private Player playerName; //If Multiple, Print Both
    private Player unitLocation; //^^

    public Unit(String Name, Player) {
        this.unitName = Name;
        this.playerName = Player;
    }
    public String toString() {
    return this.playerName+"is at"+unitLocation;


    }


}
/*
map.get(player)//returns the unit
        unit.getPlayers()//returns the other players
*/