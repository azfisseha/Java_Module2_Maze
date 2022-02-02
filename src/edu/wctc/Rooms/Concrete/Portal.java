package edu.wctc.Rooms.Concrete;

import edu.wctc.Player;
import edu.wctc.Rooms.Exitable;
import edu.wctc.Rooms.Room;

public class Portal extends Room implements Exitable {
    public Portal(String roomName) {
        super(roomName);
    }

    @Override
    public String exit(Player p) {
        p.addToScore(50);
        return "You step through the portal & into the unknown.";
    }

    @Override
    public String getDescription() {
        return "You find before you a room with a swirling portal encompassing the entire floor.";
    }
}
