package edu.wctc.Rooms.Concrete;

import edu.wctc.Player;
import edu.wctc.Rooms.Interactable;
import edu.wctc.Rooms.Room;

public class Menagerie extends Room implements Interactable {
    public Menagerie(String roomName) {
        super(roomName);
    }

    private final String[] ANIMALS = {"lion", "zebra", "snake", "koala", "panda", "baboon", "jaguar", "polar bear", "guinea pig", "rhino"};

    private String randomAnimal(){
        int rand = (int) (Math.random() * 10);
        return ANIMALS[rand];
    }

    @Override
    public String interact(Player p) {
        p.addToScore(-20);
        return "You step closer to one of the cages, only to unintentionally antagonize the " + randomAnimal() + " inside it.  It breaks out of the cage and attacks you.  After a harrowing battle of life and death, you manage to scare it off.";
    }

    @Override
    public String getDescription() {
        return "This large room is lined with glass cages housing a variety of live animals.  If this mansion is truly abandoned, who's caring for them?";
    }
}
