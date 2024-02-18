package org.example;

import java.util.Random;

class MagicalDefendDice implements Dice {
    private final Random random;

    public MagicalDefendDice() {
        random = new Random();
    }

    @Override
    public int roll() {
        return random.nextInt(6) + 1; // Assuming a 6-sided dice
    }
}
