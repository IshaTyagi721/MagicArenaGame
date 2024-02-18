package org.example;

// Player class representing a player in the arena
public class Player {
    private int health;
    private int strength;
    private int attack;
    private String username;

    //Can be a list if there were more than one observer subscribing to a player
    private Observer observer;

    public Player(int health, int strength, int attack, String username, Observer observer) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.username = username;
        this.observer = observer;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (observer != null) {
            observer.update(this);
        }
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }
    public String getUsername(){return username;}
}



