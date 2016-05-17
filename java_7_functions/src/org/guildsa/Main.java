package org.guildsa;

public class Main {

    public static void main(String[] args) {

        // Example Function #1

        sayGameOver();

        // Example Function #2

        sayGameOver2("Robert");


        // Example Function #3

        // Here we call our function and then catch the return value in our var called
        // gameOverMessage.

        String gameOverMessage = sayGameOver3("Robert");

        System.out.println(gameOverMessage);

        gameOverMessage = sayGameOver3("Jennifer");

        System.out.println(gameOverMessage);


        // Example Function #4

        // To call this function, we can pass just a String for playersScore, but for
        // the second argument, we must specify the parameter's name when we pass the
        // value.

        System.out.println(sayGameOver4("Kim", 2500));
        System.out.println(sayGameOver4("Charles", 2000));
    }

    //------------------------------------------------------------------------------

    // Example Function #1

    // Functions are self-contained chunks of code that perform a specific task.
    // You give a function a name that identifies what it does, and this name
    // is used to “call” the function to perform its task when needed.

    // Here is a simple function called "sayGameOver". It takes no arguments and
    // returns no value. It simply prints "Game Over!".

    private static void sayGameOver() {

        System.out.println("Game Over!");
    }

    //------------------------------------------------------------------------------

    // Example Function #2

    // A function can be more useful if we pass it additional information via
    // parameters.

    // By adding a new parameter called "playersName" which is of type String, this
    // function can now print a customized game over message that includes the
    // player's name.

    private static void sayGameOver2(String playersName) {

        System.out.println("Game Over, " + playersName + "!");
    }

    //------------------------------------------------------------------------------

    // Example Function #3

    // Functions can also do work and return the result of that work as a return
    // value.

    // This version of our function does not print a message but returns is as a
    // String, which other code can use.

    private static String sayGameOver3(String playersName) {

        String text = "Game Over, " + playersName + "!";

        return text;
    }

    //------------------------------------------------------------------------------

    // Example Function #4

    // Functions can have more than one argument. This function takes two arguments:
    // one that is a String for the player's name and a second one that is an Int
    // which represents the player's score.

    private static String sayGameOver4(String playersName, int playersScore) {

        String text = "Game Over, " + playersName + "! Your final score is " + String.valueOf(playersScore) + ".";

        return text;
    }
}
