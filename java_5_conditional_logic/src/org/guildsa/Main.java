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

        // A switch statement provides an alternative to the if statement when we need
        // to compare a value against several possible matches.

        int monthNumber = 8;

        String monthString;

        switch(monthNumber) {

            case 1:  monthString = "January";
                break;

            case 2:  monthString = "February";
                break;

            case 3:  monthString = "March";
                break;

            case 4:  monthString = "April";
                break;

            case 5:  monthString = "May";
                break;

            case 6:  monthString = "June";
                break;

            case 7:  monthString = "July";
                break;

            case 8:  monthString = "August";
                break;

            case 9:  monthString = "September";
                break;

            case 10: monthString = "October";
                break;

            case 11: monthString = "November";
                break;

            case 12: monthString = "December";
                break;

            default: monthString = "Invalid month passed!";
                break;
        }

        System.out.println("monthString = " + monthString);


        //------------------------------------------------------------------------------

        String monthName = "June";

        monthNumber = 0;

        switch(monthName.toLowerCase()) {

            case "january":
                monthNumber = 1;
                break;

            case "february":
                monthNumber = 2;
                break;

            case "march":
                monthNumber = 3;
                break;

            case "april":
                monthNumber = 4;
                break;

            case "may":
                monthNumber = 5;
                break;

            case "june":
                monthNumber = 6;
                break;

            case "july":
                monthNumber = 7;
                break;

            case "august":
                monthNumber = 8;
                break;

            case "september":
                monthNumber = 9;
                break;

            case "october":
                monthNumber = 10;
                break;

            case "november":
                monthNumber = 11;
                break;

            case "december":
                monthNumber = 12;
                break;

            default:
                monthNumber = 0;
                break;
        }

        System.out.println("monthNumber = " + String.valueOf(monthNumber));

    }
}
