package edu.wctc.Rooms.Concrete;

import edu.wctc.Rooms.Room;

public class Foyer extends Room {

    public Foyer(String roomName) {
        super(roomName);
    }

    @Override
    public String getDescription() {
        return "You find yourself in the foyer of a grand mansion - or once grand mansion.  Dust and cobwebs hide the finer features of the hall.";
    }
}
