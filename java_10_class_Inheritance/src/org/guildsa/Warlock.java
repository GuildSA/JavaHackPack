package org.guildsa;

// Below is a class called Enemy which a game could use to create new
// enemies for a player to fight. Unlike the Dog class, this is more
// like a real class that you would see in a real app.

public class Warlock extends Enemy {

    // On top of the Instance Variables we get from Enemy,
    // our Warlock class adds 2 more Instance Variables.
    private int spellDamage = 10;
    private int magicPoints = 500;

    // Our Warlock class has a default constructor that takes no arguments.
    Warlock() {

        // This will call the Enemy constructor so it sets all of its defaults
        // before we alter any of them.
        super();

        System.out.println("New Warlock Initialized with default values!");

        setWeapon("Magic Staff");
        setAttackDamage(25);
    }

    // Since our Warlock class has private Instance Variables, we'll need
    // to write accessor methods to set and get the values of our
    // Instance Variables.

    public int getSpellDamage() {
        return spellDamage;
    }

    public void setSpellDamage(int spellDamage) {
        this.spellDamage = spellDamage;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    // Our Warlock class will override the attack() method so it can do
    // its own version of an attack.

    @Override
    public void attack() {

        System.out.println("Warlock attacks with " + getWeapon() + " for " + getAttackDamage() + " points of damage!");

        this.magicPoints -= 5;
        System.out.println("Magic Points reduced to " + magicPoints);
    }

    // Finally, Our Warlock class will add two new Methods which only apply
    // to a Warlock and do not make sense for a regular Enemy.

    public void castSpell() {

        System.out.println("Warlock casts a spell for " + spellDamage + " points of damage!");

        magicPoints -= 10;
        System.out.println("Magic Points reduced to " + magicPoints);
    }

    public void teleport() {
        System.out.println("Warlock teleports to new a position!");
    }
}
