package org.example;

import java.io.IOException;
import java.util.Scanner;

public class CommandLineInputHandler implements InputHandler{
    private Scanner scanner;
    public CommandLineInputHandler(){
        scanner = new Scanner(System.in);
    }
    @Override
    public Player[] readInput() throws IOException {
        System.out.println("Enter details for Player 1 (health, strength, attack, username):");
        Player player1 = readPlayer();
        System.out.println("Enter details for Player 2 (health, strength, attack, username):");
        Player player2 = readPlayer();
        return new Player[]{player1, player2};
    }
    public Player readPlayer(){
        System.out.print("Enter health:");
        int health = scanner.nextInt();
        System.out.print("Enter strength:");
        int strength = scanner.nextInt();
        System.out.print("Enter attack:");
        int attack = scanner.nextInt();
        System.out.println("Enter username:");
        String username = scanner.next();
        return new Player(health, strength, attack, username, new HealthObserver());
    }
}
