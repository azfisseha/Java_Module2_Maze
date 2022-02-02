package edu.wctc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("-----------Welcome to the Mansion-----------");

        while(!maze.isFinished()){
            System.out.println("You are in the " + maze.getCurrentRoomName());
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println(maze.getCurrentRoomExits());

            System.out.println("Please select a command (n s e w u d - move, i - interact, l - loot, x - exit, v - view inventory");
            char input = keyboard.nextLine().charAt(0);

            switch (input) {
                case 'n', 's', 'e', 'w', 'u', 'd':
                    if (!maze.move(input)) System.out.println(input + " is not a valid direction");
                    break;
                case 'i':
                    System.out.println(maze.interactWithCurrentRoom());
                    break;
                case 'l':
                    System.out.println(maze.lootCurrentRoom());
                    break;
                case 'x':
                    System.out.println(maze.exitCurrentRoom());
                    break;
                case 'v':
                    System.out.println(maze.getPlayerInventory());
                    break;
                default:
                    break;
            }
        }

        System.out.println("You find yourself... out?   Your score: " + maze.getPlayerScore());
    }
}
