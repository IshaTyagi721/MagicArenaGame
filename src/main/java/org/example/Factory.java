package org.example;

// Factory interface for creating players and dice

interface Factory {
    Player createPlayer(int health, int strength, int attack);
    Dice createDice(Action action);
}
