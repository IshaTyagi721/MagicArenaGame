package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputHandlerFactory factory = new InputHandlerFactoryImpl();
        System.out.println("Enter input source: CMD for command line and FILE for file");
        String inputSource = new Scanner(System.in).next();
        InputType inputType;
        if(inputSource.equals("FILE")){
            inputType = InputType.FILE;
        }
        else if(inputSource.equals("CMD")){
            inputType = InputType.COMMAND_LINE;
        }
        else{
            throw new IllegalArgumentException("Unsupported input source");
        }
        InputHandler inputHandler = factory.createInputHandler(inputType);
        try {
            Player[] players = inputHandler.readInput();
            if (players.length == 2) {
                MagicalArena arena = MagicalArena.getInstance();
                arena.startMatch(players[0], players[1]);
            } else {
                System.err.println("Invalid number of players.");
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}