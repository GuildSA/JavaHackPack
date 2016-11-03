package org.guildsa;

public class Main {

    // Enumerations

    // An enumeration defines a common type for a group of related values and
    // enables you to work with those values in a type-safe way within your code.

    public enum GamePadDirection {
        Up,
        Down,
        Left,
        Right
    }

    //------------------------------------------------------------------------------

    // Associated Values

    // Enumeration cases can have actual values assigned to them
    // as long as they are all of the same type.

    public enum Letters {

        A("Alpha"),
        B("Bravo"),
        C("Charlie");

        private String value;

        Letters(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }



    public static void main(String[] args) {

        GamePadDirection gamePadInput = GamePadDirection.Up;

        System.out.println("Game pad is being pushed: " + String.valueOf(gamePadInput) + ".");

        // Write out all the possible values of the GamePadDirection enum:
        // Write out all the possible values of the GamePadDirection enum:
        for(GamePadDirection direction : GamePadDirection.values()) {
            System.out.println(direction);
        }

        //------------------------------------------------------------------------------

        // A switch statement is a great way to process the value of a variable that is
        // an enumeration type.

        gamePadInput = GamePadDirection.Down;

        switch(gamePadInput) {

            case Up:
                System.out.println("The game pad is being pushed up!");
                break;

            case Down:
                System.out.println("The game pad is being pushed down!");
                break;

            case Left:
                System.out.println("The game pad is being pushed left!");
                break;

            case Right:
                System.out.println("The game pad is being pushed right!");
                break;

            default:
                System.out.println("Unknown GamePadDirection!");
                break;
        }

        //------------------------------------------------------------------------------

        // Now, if you're wondering why enumerations are useful, consider the typical
        // alternative. Instead of using an enumeration to represent the possible
        // Game pad Directions we could've defined a bunch of simple constants values,
        // but if we do this, we lose the type safety that enumerations enforce!

        /*
        final int GamePadUp = 1;
        final int GamePadDown = 2;
        final int GamePadLeft = 3;
        final int GamePadRight = 4;

        // This works and looks reasonable... so far so good!
        int gamePadDirection = GamePadUp;

        // But without type safety, we can also do this which makes no sense!
        gamePadDirection = 55;

        // What does the value 55 mean? Java will not mark this an error because 55
        // is just as valid a value as 1,2,3, or 4 which are used by the constants.
        */

        //------------------------------------------------------------------------------

        // Write out all the possible values of the Letters enum:

        for(Letters letter : Letters.values()) {
            System.out.println(letter);
        }

        // If we assign Associated Values to the enumeration constants we can
        // access these values if needed.

        Letters possibleLetter = Letters.A;

        System.out.println(possibleLetter);
        System.out.println(possibleLetter.getValue());
    }
}
