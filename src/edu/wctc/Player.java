package edu.wctc;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score;
    private List<String> inventory = new ArrayList<String>();

    public void addToInventory(String item){
        inventory.add(item);
    }

    public void addToScore(int points){
        score += points;
    }

    public String getInventory(){
        if(inventory.isEmpty()) return "No items in inventory";

        StringBuilder output = new StringBuilder();
        for(String x: inventory){
            output.append(x).append(" ");
        }
        return output.toString();
    }

    public int getScore(){
        return score;
    }

}
