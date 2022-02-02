package edu.wctc.Rooms.Concrete;

import edu.wctc.Rooms.Room;

public class Hallway extends Room {
    public Hallway(String roomName) {
        super(roomName);
    }

    @Override
    public String getDescription() {
        return "You have stepped into a winding, dimly lit hallway.";
    }


}
