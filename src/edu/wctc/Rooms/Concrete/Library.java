package edu.wctc.Rooms.Concrete;

import edu.wctc.Player;
import edu.wctc.Rooms.Lootable;
import edu.wctc.Rooms.Room;

public class Library extends Room implements Lootable {
    public Library(String roomName) {
        super(roomName);
    }

    @Override
    public String loot(Player p) {
        p.addToScore(20);
        p.addToInventory("MadmansJournal");
        return "The papers on the table describe the thoughts of a person descending into madness.  There are pages and pages of ramblings on their fruitless journey through this mansion.  None of it is sensible.  You scrap together anything that looks legible and stow it in your bag.";
    }

    @Override
    public String getDescription() {
        return "You find yourself in a dusty library.  Books line the 12 foot high shelves on all sides, and on the tables in the center you see scattered pages and writings.";
    }
}
