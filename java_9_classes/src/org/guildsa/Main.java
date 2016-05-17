package org.guildsa;

// A class allow us to group variables and functions together as a new type.
// Below is a new class called Dog which defines what it means to be a Dog.
// Typically, when people learn Java or any Object Oriented Programming
// language, they'll be shown something like this Dog class.
//
// Please note, when a class declares variables, we call those its
// "Instance Variables", and when it declares functions we call those its
// "Methods".

class Dog {

    // Our Dog class has 3 Instance Variables:
    String name;
    int age;
    float weight;

    // Our Dog class has 1 Method called speak().
    void speak() {
        System.out.println("Woof!");
    }
}

public class Main {

    public static void main(String[] args) {

        // Use our new Dog class to create an instance of a Dog!

        Dog dog = new Dog();

        // Now, access and assign values to our dog's Instance Variables.
        dog.name = "Spot";
        dog.age = 2;
        dog.weight = 12.5f;

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.weight);

        // Finally, call our dog's speak() method.
        dog.speak();

        //------------------------------------------------------------------------------

        // Next, we'll use our new Enemy class to create an instance of an Enemy!
        // This enemy will simply use the default constructor which just uses
        // the default value set on the Instance Variables.

        Enemy typicalEnemy = new Enemy();

        System.out.println(typicalEnemy.getWeapon());
        System.out.println(typicalEnemy.getAttackDamage());
        System.out.println(typicalEnemy.getAttackDamage());

        typicalEnemy.attack();
        typicalEnemy.applyDamage(10);

        //------------------------------------------------------------------------------

        // Use our new Enemy class to create a second instance of an Enemy!
        // This enemy will use our custom constructor which overwrites the default
        // values of the Instance Variables with new values.

        Enemy bossEnemy = new Enemy("Magic Sword", 35, 200);

        System.out.println(bossEnemy.getWeapon());
        System.out.println(bossEnemy.getAttackDamage());
        System.out.println(bossEnemy.getHealthPoints());

        bossEnemy.attack();
        bossEnemy.applyDamage(10);
    }
}
