package org.example;

// observer class implementing oberver interface
// is notified when a player's health reaches 0
class HealthObserver implements Observer {
    private Runnable matchEndCallback;
    Player winner;
    @Override
    public void update(Player player) {
        if (player.getHealth() <= 0 && winner == null) {
            winner = player;
            System.out.println("Match has ended, the winner is " + winner.getUsername());
        }
    }
}
