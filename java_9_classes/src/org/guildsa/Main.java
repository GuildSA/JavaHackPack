package org.guildsa;


// Java Object Oriented Programming Concepts

//------------------------------------------------------------------------------

// Now that we've covered all the basics of working with variables and
// functions we can start to understand the more advanced concepts of Java such
// as its support for Object Oriented Programming or OOP.

// As the name implies, Object Oriented Programming is all about building our
// programs out of Objects and to create these Object we will use a Java keyword
// called "class".

// A class allows us to group variables and functions together as a new type.
// Basically, it can be thought of as a blueprint that tells Java how to create
// or build the objects that we need for our program.

// The three main features of Object Oriented Programming are:

// 1 - Encapsulation
// 2 - Inheritance
// 3 - Polymorphism

//------------------------------------------------------------------------------

// Below is a new class called Animal which defines what it means to be an
// Animal.

// This Animal class demonstrates Encapsulation by grouping variables and
// functions together as a new type. Encapsulation also means hiding data and
// methods within an Object by using other keywords such as "public",
// "private", and "protected". For example, The Animal class uses the private
// keyword to hide or encapsulate its Instance Variables from direct access
// and modification.

// Please note, when a class declares variables, we call those its
// "Instance Variables", and when it declares functions we call those its
// "Methods".

class Animal {

    // Our Animal class has 3 private Instance Variables:
    private String name;
    private int age;
    private float weight;

    // Our Animal class has 1 Method called makeNoise() and 6 other methods
    // that allow access to it's private or encapsulated data.

    void makeNoise() {
        System.out.println("Some noise...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

//------------------------------------------------------------------------------

// Once we have the Animal class, we can demonstrate Inheritance by extending
// a new Dog and Cat class from Animal. When we extend Dog from Animal we say
// that Animal is the super class of Dog, and Dog is a subclass of Animal
//
// And finally, we demonstrate polymorphism by having the new Dog and Cat
// classes both override the makeNoise method so they can customize the
// type of noise they make.

class Dog extends Animal {

    // Dog's makeNoise() method uses Polymorphism to override or hide the
    // makeNoise() method declared by Animal.
    void makeNoise() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {

    // Cat's makeNoise() method uses Polymorphism to override or hide the
    // makeNoise() method declared by Animal.
    void makeNoise() {
        System.out.println("Meow.");
    }
}

//------------------------------------------------------------------------------


public class Main {

    public static void main(String[] args) {

        // Use our new Animal class to create an instance of an Animal!

        Animal animal = new Animal();

        // Now, access and assign values to our animal's Instance Variables.
        animal.setName("Unknown Animal");
        animal.setAge(1);
        animal.setWeight(100.0f);

        System.out.println("Our Animal's name is '" + animal.getName() + "'");
        System.out.println("Our Animal's age is " + animal.getAge());
        System.out.println("Our Animal's weight is " + animal.getWeight());

        // Finally, call our animal's speak() makeNoise.
        animal.makeNoise();

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        // Use our new Dog class to create an instance of a Dog!

        Dog dog = new Dog();

        // Now, access and assign values to our dog's Instance Variables.
        dog.setName("Spot");
        dog.setAge(2);
        dog.setWeight(12.2f);

        System.out.println("Our Dog's name is '" + dog.getName() + "'");
        System.out.println("Our Dog's age is " + dog.getAge());
        System.out.println("Our Dog's weight is " + dog.getWeight());

        // Finally, call our dog's makeNoise() method.
        dog.makeNoise();

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        // Use our new Cat class to create an instance of a Cat!

        Cat cat = new Cat();

        // Now, access and assign values to our cat's Instance Variables.
        cat.setName("Whiskers");
        cat.setAge(3);
        cat.setWeight(8.5f);

        System.out.println("Our Cat's name is '" + cat.getName() + "'");
        System.out.println("Our Cat's age is " + cat.getAge());
        System.out.println("Our Cat's weight is " + cat.getWeight());

        // Finally, call our cat's makeNoise() method.
        cat.makeNoise();


        //------------------------------------------------------------------------------

        // As another of a class, we'll use our new Enemy class to create an instance
        // of an Enemy! This enemy will simply use the default constructor which just
        // uses the default value set on the Instance Variables.

        Enemy typicalEnemy = new Enemy();

        System.out.println(typicalEnemy.getWeapon());
        System.out.println(typicalEnemy.getAttackDamage());
        System.out.println(typicalEnemy.getAttackDamage());

        typicalEnemy.attack();
        typicalEnemy.applyDamage(10);

        //------------------------------------------------------------------------------

        // Again, use our new Enemy class to create a second instance of an Enemy!
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
