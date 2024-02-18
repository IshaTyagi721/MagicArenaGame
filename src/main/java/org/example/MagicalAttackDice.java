package org.example;

import java.util.Random;

class MagicalAttackDice implements Dice {
    private final Random random;

    public MagicalAttackDice() {
        random = new Random();
    }

    @Override
    public int roll() {
        return random.nextInt(6) + 1; // Assuming a 6-sided dice
    }
}
