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

        // Write out all the possible values of the JoystickDirection enum:
        for(GamePadDirection direction : GamePadDirection.values()) {
            System.out.println(direction);
        }

        GamePadDirection joystickInput = GamePadDirection.Up;

        System.out.println("Joystick is being pushed: " + String.valueOf(joystickInput) + "!");

        //------------------------------------------------------------------------------

        // A switch statement is a great way to process the value of a variable that is
        // an enumeration type.

        joystickInput = GamePadDirection.Down;

        switch(joystickInput) {

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
