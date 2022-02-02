package edu.wctc;

import edu.wctc.Rooms.Exitable;
import edu.wctc.Rooms.Interactable;
import edu.wctc.Rooms.Lootable;
import edu.wctc.Rooms.Room;
import edu.wctc.Rooms.Concrete.*;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean finished = false;

    public Maze(){
        this.player = new Player();

        this.currentRoom = new Foyer("Foyer");

        var kitchen = new Kitchen("Kitchen");
        var library = new Library("Library");
        var menagerie = new Menagerie("Menagerie");
        var portal = new Portal("Portal");
        var freezer = new Freezer("Freezer");

        var libraryHallway = new Hallway("LibraryHallway");
        this.currentRoom.setNorth(libraryHallway);
        libraryHallway.setNorth(library);
        libraryHallway.setSouth(this.currentRoom);
        library.setSouth(libraryHallway);

        var kitchenHallway = new Hallway("KitchenHallway");
        this.currentRoom.setEast(kitchenHallway);
        kitchenHallway.setEast(kitchen);
        kitchenHallway.setWest(this.currentRoom);
        kitchen.setWest(kitchenHallway);

        kitchen.setDown(freezer);
        freezer.setRoomUp(kitchen);

        var menagerieHallway = new Hallway("MenagerieHallway");
        kitchen.setNorth(menagerieHallway);
        menagerieHallway.setNorth(menagerie);
        menagerieHallway.setSouth(kitchen);
        menagerie.setSouth(menagerieHallway);

        library.setEast(menagerie);
        menagerie.setWest(library);

        menagerie.setRoomUp(portal);
        portal.setDown(menagerie);



    }

    public String exitCurrentRoom(){
        if(this.currentRoom instanceof Exitable){
            this.finished = true;
            return ((Exitable) this.currentRoom).exit(this.player);
        }
        return "The current room is not exitable";
    }

    public String interactWithCurrentRoom(){
        if(this.currentRoom instanceof Interactable){
            return ((Interactable) this.currentRoom).interact(this.player);
        }
        return "The current room is not interactable";
    }

    public String lootCurrentRoom(){
        if(this.currentRoom instanceof Lootable){
            return ((Lootable) this.currentRoom).loot(this.player);
        }
        return "The current room is not lootable";
    }

    public boolean move(char direction){
        if(this.currentRoom.isValidDirection(direction)){
            this.currentRoom = this.currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        return false;
    }

    public int getPlayerScore(){
        return this.player.getScore();
    }

    public String getPlayerInventory(){
        return this.player.getInventory();
    }

    public String getCurrentRoomDescription(){
        return this.currentRoom.getDescription();
    }

    //added for clarity
    public String getCurrentRoomName(){
        return this.currentRoom.getName();
    }

    public String getCurrentRoomExits(){
        return this.currentRoom.getExits();
    }

    public boolean isFinished(){
        return this.finished;
    }
}
