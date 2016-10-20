package org.guildsa;

public class Main {

    public static void main(String[] args) {

        // We can use if-statements to have our code take some action if some
        // condition is true. The most basic control structure is the if-statement.

        int health = 0;

        // If the player's health is less than or equal to 0 - print "You're dead!"
        if(health <= 0) {
            System.out.println( "You're dead!" );
        }

        //------------------------------------------------------------------------------

        // Next, the if-else statement allows us to pick one of two possible actions instead
        // of a all-or-nothing choice.

        health = 75;

        // If the player's health is less than or equal to 0 - print "You're dead!"
        // Otherwise, print "You're alive!".
        if(health <= 0) {
            System.out.println( "You're dead!" );
        } else {
            System.out.println( "You're alive!" );
        }

        //------------------------------------------------------------------------------

        // The final form of an if-statement, uses an else-if combination to pick from
        // one of several possible actions by chaining two or more if statements
        // together.

        health = 24;

        // If the player's health is less than or equal to 0 - print "You're dead!"
        // But if the player is not dead, and the player's health is less than 25 -
        // print  "You're alive - but badly wounded!" Otherwise, print "You're alive!".
        if(health <= 0)  {
            System.out.println( "You're dead!" );
        } else if(health < 25) {
            System.out.println( "You're alive - but badly wounded!" );
        } else {
            System.out.println( "You're alive!" );
        }


        //------------------------------------------------------------------------------

        // If we want to write if-statements that check multiple expressions we can
        // use Logical Operators to decided if an if-statement should be executed
        // or not.

        // Swift Logical Operators

        // Logical AND (a && b) - Returns true if both expressions are true
        // Logical OR  (a || b) - Returns true if either of the two expressions are true
        // Logical NOT (!a)     - Negates or inverts the expression's result.

        int goldCoins = 800;
        int rubies = 5;

        int priceUsingGold = 500;
        int priceUsingRubies = 10;

        boolean hasSword = true; // Does the shop keeper have one to sell?

        // If the player has enough gold coins AND the shop keeper has a magic sword
        // to sell - ask the player if he would like to purchase it.

        if(goldCoins >= priceUsingGold && hasSword == true) {
            System.out.println("Would you like to purchase a magic sword?");
        } else {
            System.out.println("I'm sorry. The magic sword is unavailable.");
        }

        // If the player has enough gold coins OR the player has enough ruby gems -
        // ask the player if he would like to purchase it.

        if(goldCoins >= priceUsingGold || rubies >= priceUsingRubies) {
            System.out.println("Would you like to purchase a magic sword?");
        } else {
            System.out.println("I'm sorry. The magic sword is unavailable.");
        }

        // The 'not' Logical Operator just inverts or negates a Boolean variable or the
        // result of an expression.

        hasSword = false;

        if(!hasSword) {
            System.out.println("The shop keeper has no magic sword!");
        }

        //------------------------------------------------------------------------------

        // A switch statement provides an alternative to the if statement when we need
        // to compare a value against several possible matches.

        int monthNumber = 5;

        String monthString;

        switch(monthNumber) {

            case 1: monthString = "January"; break;
            case 2: monthString = "February"; break;
            case 3: monthString = "March"; break;
            case 4: monthString = "April"; break;
            case 5: monthString = "May"; break;
            case 6: monthString = "June"; break;
            case 7: monthString = "July"; break;
            case 8: monthString = "August"; break;
            case 9: monthString = "September"; break;
            case 10: monthString = "October"; break;
            case 11: monthString = "November"; break;
            case 12: monthString = "December"; break;

            default: monthString = "Invalid month passed!"; break;
        }

        System.out.println("monthString = " + monthString);


        //------------------------------------------------------------------------------

        String monthName = "may";

        monthNumber = 0;

        switch(monthName) {

            case "january": monthNumber = 1; break;
            case "february": monthNumber = 2; break;
            case "march": monthNumber = 3; break;
            case "april": monthNumber = 4; break;
            case "may": monthNumber = 5; break;
            case "june": monthNumber = 6; break;
            case "july": monthNumber = 7; break;
            case "august": monthNumber = 8; break;
            case "september": monthNumber = 9; break;
            case "october": monthNumber = 10; break;
            case "november": monthNumber = 11; break;
            case "december": monthNumber = 12; break;

            default: monthNumber = 0; break;
        }

        System.out.println("monthNumber = " + String.valueOf(monthNumber));
    }
}
