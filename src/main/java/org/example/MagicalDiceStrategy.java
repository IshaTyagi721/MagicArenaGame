package org.example;

// Concrete strategy for rolling a magical dice
class MagicalDiceStrategy implements DiceStrategy {
    private final Dice dice;

    public MagicalDiceStrategy(Dice dice) {
        this.dice = dice;
    }

    @Override
    public int rollDice() {
        return dice.roll();
    }
}