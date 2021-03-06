package org.guildsa;

// Below is a class called Enemy which a game could use to create new
// enemies for a player to fight.
public class Enemy {

    // Our Enemy class has 3 Instance Variables, which are all private:
    private String weapon = "Club";
    private int attackDamage = 5;
    private int healthPoints = 100;

    // Our Enemy class has a default constructor that takes no arguments.
    Enemy() {
        System.out.println("New Enemy Initialized with default values!");
    }

    // Our Enemy class has a custom constructor that takes 3 arguments.
    Enemy(String weapon, int attackDamage, int healthPoints) {

        System.out.println("New Enemy Initialized with custom values!");

        this.weapon = weapon;
        this.attackDamage = attackDamage;
        this.healthPoints = healthPoints;
    }

    // Since our Enemy class has private Instance Variables, we'll need
    // to write accessor methods to set and get the values of our
    // Instance Variables.

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    // Our Enemy class also provides 2 other methods so Enemy instances
    // can attack and have damage applied to them.

    public void attack() {
        System.out.println("Enemy attacks with " + this.weapon + " for " + this.attackDamage + " points of damage!");
    }

    public void applyDamage(int damage) {

        this.healthPoints -= damage;

        System.out.println("Health Points reduced to " + this.healthPoints);
    }
}
