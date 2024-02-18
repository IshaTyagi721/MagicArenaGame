package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MagicArenaTest {
    @Test
    public void testMatch() {
        Player player1 = new Player(50, 20, 50, "Player1", new HealthObserver());
        Player player2 = new Player(50, 30, 10, "Player 2", new HealthObserver());
        MagicalArena magicalArena = MagicalArena.getInstance();
        magicalArena.startMatch(player1, player2);
        assertTrue(player1.getHealth() <= 0 || player2.getHealth() <= 0);
    }
}
