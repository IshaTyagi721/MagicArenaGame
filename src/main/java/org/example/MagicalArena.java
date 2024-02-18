package org.example;


// We are using a Singleton class for representing the Magical Arena as we only need one
// instance of this class per execution
class MagicalArena {
    private static MagicalArena magicalArena;
    private final Factory factory;

    private MagicalArena() {
        factory = new MagicalFactory();
    }

    public static MagicalArena getInstance() {
        if (magicalArena == null) {
            magicalArena = new MagicalArena();
        }
        return magicalArena;
    }

    public void startMatch(Player player1, Player player2) {
        // Determine which player attacks first based on health
        Player firstAttacker = (player1.getHealth() < player2.getHealth()) ? player1 : player2;
        Player secondAttacker = (firstAttacker == player1) ? player2 : player1;

        Command attackCommand = new AttackCommand();
        DiceStrategy attackingStrategy = new MagicalDiceStrategy(factory.createDice(Action.ATTACK));
        DiceStrategy defendingStrategy = new MagicalDiceStrategy(factory.createDice(Action.DEFEND));

        while (firstAttacker.getHealth() > 0 && secondAttacker.getHealth() > 0) {
            int attackRoll = attackingStrategy.rollDice();
            int defendRoll = defendingStrategy.rollDice();
            attackCommand.execute(firstAttacker, secondAttacker, attackRoll, defendRoll);

            // Switch roles for the next turn
            Player temp = firstAttacker;
            firstAttacker = secondAttacker;
            secondAttacker = temp;
        }
        // Match ends, perform any cleanup or end-of-match actions
    }
}
