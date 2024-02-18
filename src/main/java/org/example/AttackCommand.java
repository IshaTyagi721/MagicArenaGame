package org.example;

// class implementing command interface representing an attack action
class AttackCommand implements Command {
    @Override
    public void execute(Player attacker, Player defender, int attackRoll, int defendRoll) {
        int attackDamage = attacker.getAttack() * attackRoll;
        int defendDamage = defender.getStrength() * defendRoll;
        int damageTaken = Math.max(attackDamage - defendDamage, 0);
        int newHealth = defender.getHealth() - damageTaken;
        defender.setHealth(newHealth);
    }
}