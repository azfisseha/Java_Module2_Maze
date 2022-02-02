package edu.wctc.Rooms.Concrete;

import edu.wctc.Player;
import edu.wctc.Rooms.Interactable;
import edu.wctc.Rooms.Lootable;
import edu.wctc.Rooms.Room;

public class Freezer extends Room implements Lootable, Interactable {
    private boolean interacted = false;

    public Freezer(String roomName) {
        super(roomName);
    }

    @Override
    public String interact(Player p) {
        interacted = true;
        p.addToScore(20);
        return "You push your way past a massive beef haunch and realize there was a stack of crates in the corner of the room the whole time.";
    }

    @Override
    public String loot(Player p) {
        if(interacted){
            p.addToInventory("RockyRoad");
            p.addToScore(200);
            return "Inside the crates are several dozen pints of Ben&Jerry's.  Whoever owns this mansion has a sweet tooth.  The top pint is half eaten.  You take the next one.";
        }else{
            return "You don't quite find anything you can carry, but you haven't eaten in a while and its a shame there isn't anything to munch on.";
        }
    }

    @Override
    public String getDescription() {
        return "A massive walkin freezer.  Huge cuts of meat hang from hooks in the ceiling.  What needs feeding in an empty mansion?";
    }
}
