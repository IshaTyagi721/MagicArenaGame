package org.example;

// Command interface for different actions during a match
interface Command {
    void execute(Player attacker, Player defender, int attackRoll, int defendRoll);
}
