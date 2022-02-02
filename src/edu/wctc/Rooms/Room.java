package edu.wctc.Rooms;

public abstract class Room {
    private String name;

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    //renamed to avoid using the name 'setup'
    public void setRoomUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String roomName) {
        this.name = roomName;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction){
        switch (direction){
            case 'n': return north;
            case 's': return south;
            case 'e': return east;
            case 'w': return west;
            case 'u': return up;
            case 'd': return down;
            default:
                break;
        }
        return null;
    }

    public String getExits(){
        String output = "Exits are: ";
        if(north != null) output += "North ";
        if(south != null) output += "South  ";
        if(east != null) output += "East ";
        if(west != null) output += "West ";
        if(up != null) output += "Up ";
        if(down != null) output += "Down ";

        return output;
    }

    public String getName(){
        return this.name;
    }

    //What purpose does this method serve that isn't already served by getAdjoiningRoom?
    public boolean isValidDirection(char direction){
        return getAdjoiningRoom(direction) != null;
    }

}
