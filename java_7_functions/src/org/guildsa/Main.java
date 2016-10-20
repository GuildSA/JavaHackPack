package org.guildsa;

public class Main {

    public static void main(String[] args) {

        // Example of calling function #1

        sayGameOver();


        // Example of calling function #2

        sayGameOver2("Robert");


        // Example of calling function #3

        // Here we call our function and then catch the return value in our
        // String variable called gameOverMessage.

        String gameOverMessage = sayGameOver3("Robert");

        System.out.println(gameOverMessage);

        gameOverMessage = sayGameOver3("Jennifer");

        System.out.println(gameOverMessage);


        // Example of calling function #4

        // To call this function, we pass a String for the player's name and an int for
        // the player's score.

        System.out.println( sayGameOver4("Kim", 2500) );
        System.out.println( sayGameOver4("Charles", 2000) );
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
    // one that is a String for the player's name and a second one that is an int
    // which represents the player's score.

    private static String sayGameOver4(String playersName, int playersScore) {

        String text = "Game Over, " + playersName + "! Your final score is " + String.valueOf(playersScore) + ".";

        return text;
    }
}
