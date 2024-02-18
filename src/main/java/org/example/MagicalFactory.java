package org.example;

// Concrete factory for creating players and dice
class MagicalFactory implements Factory {
    @Override
    public Player createPlayer(int health, int strength, int attack, String username, Observer observer) {
        return new Player(health, strength, attack, username, observer);
    }

    @Override
    public Dice createDice(Action action) {
        if(action.equals(Action.ATTACK)) {
            return new MagicalAttackDice();
        }
        else if(action.equals(Action.DEFEND)){
            return new MagicalDefendDice();
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
