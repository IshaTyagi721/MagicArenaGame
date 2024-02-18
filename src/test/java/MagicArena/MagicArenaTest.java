package MagicArena;

import org.example.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class MagicArenaTest {
    @Test
    public void testMatch_draw() {
        Player player1 = new Player(50, 20, 50, "Player1", new HealthObserver());
        Player player2 = new Player(50, 30, 10, "Player 2", new HealthObserver());
        MagicalArena magicalArena = MagicalArena.getInstance();
        magicalArena.startMatch(player1, player2);
        assertTrue(player1.getHealth() <= 0 || player2.getHealth() <= 0);
    }
    @Test
    public void testMatch_Player1Wins() {
        Player player1 = new Player(8000, 1800, 1200, "Player1", new HealthObserver());
        Player player2 = new Player(1, 1, 0, "Player 2", new HealthObserver());


        MagicalArena arena = MagicalArena.getInstance();
        arena.startMatch(player1, player2);

        assertTrue(player2.getHealth() <= 0);
    }

    @Test
    public void testMatch_Player2Wins() {
        Player player2 = new Player(8000, 1800, 1200, "Player1", new HealthObserver());
        Player player1 = new Player(1, 1, 0, "Player 2", new HealthObserver());

        MagicalArena arena = MagicalArena.getInstance();
        arena.startMatch(player1, player2);

        assertTrue(player1.getHealth() <= 0);
    }

    @Test(expected = IOException.class)
    public void testInvalidFile() throws IOException {
        InputHandler fileInputHandler = new FileInputHandler("nonexistent_file.txt");
        fileInputHandler.readInput();
    }
}

