package edu.wctc.Rooms.Concrete;

import edu.wctc.Player;
import edu.wctc.Rooms.Interactable;
import edu.wctc.Rooms.Lootable;
import edu.wctc.Rooms.Room;

public class Kitchen extends Room implements Lootable, Interactable {
    public Kitchen(String roomName) {
        super(roomName);
    }

    @Override
    public String loot(Player p) {
        p.addToScore(20);
        p.addToInventory("Spoon");
        return "You consider grabbing a knife for self defence, but this is a school project - there wouldn't be any violence here.  Instead you grab a spoon in case theres ice cream in the freezer.";
    }

    @Override
    public String getDescription() {
        return "You find yourself in an impressive kitchen.  Pots and pans hang from the ceiling alongside a dazzling display of chef's knives.  One of the hooks among the chef's knives is empty.";
    }

    @Override
    public String interact(Player p) {
        p.addToScore(-20);
        return "You can't help but grab a spatula and clang it across the hanging cookware.  After a minute you manage to put together a decent melody.  When you stop, you notice a matching clanging coming from somewhere else in the mansion.";
    }
}
