package org.guildsa;

public class Main {

    public static void main(String[] args) {

        // This one line is a comment!

        /*
            This is a comment that can span
            over multiple lines!
        */

        // Here we declare a variable called myScore and we assign to it the
        // value of 0. The "int" is a special keyword that tells Java that this
        // variable should hold an integer value.

        int myScore = 0;


        // We can use the final keyword to declare a constant. A constant holds
        // a value just like a variable but it can never be changed once it has been
        // assigned a value.

        final int maximumNumberOfGameContinues = 3;


        // We can declare multiple variables on a single line if we separate them by commas:

        int health = 100, armor = 25, goldCoins = 10, rubies = 5;


        //------------------------------------------------------------------------------

        // Here we declare a variable called shopKeeperText and we assign to it some text.
        // "String" is an just object used by Java to hold a list of characters.

        String shopKeeperText = "Would you like to buy something for your adventure?";

        // Java gives us several built-in functions which we are designed to help us out.
        // For example, we can use the println() function to print our data to the console.

        System.out.println(shopKeeperText);

        shopKeeperText = "How about a sword or a new suit of armor?";

        System.out.println(shopKeeperText);

        //------------------------------------------------------------------------------

        // If we want to build-up a String using some of our variables, we can use
        // the plus sign '+' to include the name of a constant or variable into a larger
        // string.

        String weapon = "Dagger";
        int price = 2;

        System.out.println("Are you sure you want to purchase the " + weapon + " for " + price + " gold coins?");

        weapon = "Short Sword";
        price = 10;

        System.out.println("Are you sure you want to purchase the " + weapon + " for " + price + " gold coins?");

        weapon = "Mystical Blade of Awesomeness";
        price = 1000;

        // If we're not sure if our variables contain valid data, we can pass them
        // into String.valueOf() to safely turn them into a String before we try to
        // add them into a larger string.

        System.out.println("Are you sure you want to purchase the " + String.valueOf(weapon) + " for " + String.valueOf(price) + " gold coins?");

    }
}
