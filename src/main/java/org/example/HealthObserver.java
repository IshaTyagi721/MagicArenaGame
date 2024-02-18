package org.example;

// observer class implementing oberver interface
// is notified when a player's health reaches 0
class HealthObserver implements Observer {
    @Override
    public void update(Player player) {
        if (player.getHealth() <= 0) {
            // Perform action when player's health reaches 0 (e.g., remove from arena)
        }
    }
}
