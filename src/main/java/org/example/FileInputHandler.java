package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FileInputHandler implements InputHandler {
    private String fileName;

    public FileInputHandler(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public Player[] readInput() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Player player1 = readPlayer(reader.readLine());
            Player player2 = readPlayer(reader.readLine());
            return new Player[]{player1, player2};
        }
    }
    public Player readPlayer(String line){
        String[] parts = line.split(" ");
        int health = Integer.parseInt(parts[0]);
        int strength = Integer.parseInt(parts[1]);
        int attack = Integer.parseInt(parts[2]);
        String username = String.valueOf(parts[3]);
        return new Player(health, strength, attack, username, new HealthObserver());
    }
}
