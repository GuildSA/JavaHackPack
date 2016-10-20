package org.guildsa;

// Interfaces

// An interface defines a collection of abstract methods that suit a particular
// task or a piece of functionality. The interface can then be used by a class
// to provide an actual implementation of those requirements.
//
// Any type that satisfies the requirements of an interface is said to conform
// to or implement that interface.

interface Weapon {

    void attack();
    void description();
}

// Any class that conforms to the Weapon interface must implement these methods.
// Below are two classes that conform to our new Weapon interface:

class ShortSword implements Weapon {

    public void attack() {
        System.out.println("The Short Sword slices!");
    }

    public void description() {
        System.out.println("A good beginner's Sword.");
    }
}

class BattleAx implements Weapon {

    public void attack() {
        System.out.println("The Battle Ax chops!");
    }

    public void description() {
        System.out.println("An upgrade over the basic Ax, but you need great strength to wield it!");
    }
}

//------------------------------------------------------------------------------

// If we create another interface that defines what it means for something to be
// magical or enchanted, we can use it to make new classes that are both weapons
// and enchanted.

interface Enchantment {

    void renderFx();
}

// Here's an example of a new class that is based on two different interfaces.
// This means it must implement everything required by both the Weapon and
// Enchantment interfaces.

class MagicSword implements Weapon, Enchantment {

    public void attack() {
        System.out.println("The Magic Sword slashes with Awesomeness!");
    }

    public void description() {
        System.out.println("An upgrade over the Sword, but you need magic to wield it!");
    }

    public void renderFx() {
        // Render some amazing special FXs here!
        System.out.println("Imagine some incredible special effects here!");
    }
}

public class Main {

    public static void main(String[] args) {

        ShortSword shortSword = new ShortSword();

        shortSword.description();
        shortSword.attack();

        BattleAx battleAx = new BattleAx();

        battleAx.description();
        battleAx.attack();

        MagicSword magicSword = new MagicSword();

        magicSword.description();
        magicSword.attack();
        magicSword.renderFx();
    }
}
