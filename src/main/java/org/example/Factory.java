package org.example;

// Factory interface for creating players and dice

interface Factory {
    Player createPlayer(int health, int strength, int attack, String username, Observer observer);
    Dice createDice(Action action);
}
