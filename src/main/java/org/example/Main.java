package org.example;

public class Main {
    public static void main(String[] args) {
        MagicalArena arena = MagicalArena.getInstance();

        // Sample usage
        Player player1 = new Player(100, 20, 10);
        Player player2 = new Player(120, 18, 12);
        player1.setObserver(new HealthObserver());
        player2.setObserver(new HealthObserver());

        arena.startMatch(player1, player2);
    }
}