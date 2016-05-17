package org.guildsa;

// Class Inheritance

// A class can inherit Methods, Instance Variables, and other characteristics
// from another class. When one class inherits from another, the inheriting
// class is known as a subclass, and the class it inherits from is known
// as its superclass.

public class Main {

    public static void main(String[] args) {

        // Use our Enemy class to create an instance of an Enemy!

        Enemy enemy = new Enemy();

        System.out.println(enemy.getWeapon());
        System.out.println(enemy.getAttackDamage());
        System.out.println(enemy.getHealthPoints());

        enemy.attack();
        enemy.applyDamage(10);

        // Next, we'll Use our new Warlock class to create an instance of a Warlock!

        Warlock warlock = new Warlock();

        System.out.println(warlock.getWeapon());
        System.out.println(warlock.getAttackDamage());
        System.out.println(warlock.getHealthPoints());
        System.out.println(warlock.getSpellDamage());
        System.out.println(warlock.getMagicPoints());

        warlock.attack();
        warlock.applyDamage(10);
        warlock.castSpell();
        warlock.teleport();
    }
}
