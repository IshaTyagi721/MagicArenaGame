package org.example;

public class Main {
    public static void main(String[] args) {
        MagicalArena arena = MagicalArena.getInstance();
        HealthObserver healthObserver = new HealthObserver();
        // Sample usage
        Player player1 = new Player(5, 2, 4, "Player1", healthObserver);
        Player player2 = new Player(5, 2, 3, "Player2", healthObserver);

        arena.startMatch(player1, player2);
    }
}