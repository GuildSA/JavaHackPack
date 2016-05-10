package org.guildsa;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // For looping

        // Java supports traditional C-style for loops with a condition and an incrementer.

        for(int index = 0; index < 3; ++index) {

            System.out.println("Index: " + String.valueOf(index));
        }

        // This can be very useful when you want to create a for loop that increments
        // in an unusual way, such as this one that starts at 2, increments by 2 as
        // in 2,4,6,8 and stops at 8.
        for(int i = 2; i < 10; i = i + 2) {

            System.out.println("i: " + String.valueOf(i));
        }

        //------------------------------------------------------------------------------

        // String provides a charAt() method which we can use with a for loop to print
        // each character of a String individually

        String myString = "LOL";

        for(int i = 0; i < myString.length(); ++i) {

            char c = myString.charAt(i);

            System.out.println(c);
        }

        //------------------------------------------------------------------------------

        // This example uses a newer enhanced for loop called a "for-each" loop that
        // iterates over an array of player weapons. Introduced in Java 5.

        String[] weaponsList = {"Dagger", "Sword", "Club"};

        for(String weapon : weaponsList) {

            System.out.println( "Player has a " + weapon);
        }

        //------------------------------------------------------------------------------

        // This example iterates over an HashMap of player's names and scores.

        HashMap<String, Integer> playerScores = new HashMap<String, Integer>();

        playerScores.put("Calvin", 2100);
        playerScores.put("Jennifer", 2700);
        playerScores.put("Debbie", 3000);

        // If you're only interested in the keys, you can iterate through the keySet() of the map like this:
        for(String key : playerScores.keySet()) {

            System.out.println( "key: " + key);
        }

        // If you only need the values, you can use values() of the map like this:
        for(Integer value : playerScores.values()) {

            System.out.println( "value: " + String.valueOf(value));
        }

        // Finally, if you want both the key and value, use entrySet():
        for(Map.Entry<String, Integer> entry : playerScores.entrySet()) {

            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " scored " + String.valueOf(value) + " points.");
        }

        //------------------------------------------------------------------------------

        // The while loop continues looping while the expression is true.

        int numRocketsToFire = 3;
        int rocketCount = 0;

        while(rocketCount < numRocketsToFire) {

            ++rocketCount;

            System.out.println( "Firing rocket #" + String.valueOf(rocketCount));
        }

        //------------------------------------------------------------------------------

        // We can use the 'break' keyword to break out of a while loop early if we find
        // a reason to.

        int number = 0;

        while(number < 10) {

            System.out.println( "while-break test " + String.valueOf(number));

            if(number == 5) {

                // If the number is 5 - stop looping and jump out of the loop's body!
                break;
            }

            ++number;
        }

        //------------------------------------------------------------------------------

        // The 'continue' keyword allows us to skip the rest of the loop's body and jump
        // to the loop's top.

        int answer = 0;

        while(answer < 100) {

            ++answer;

            if(answer != 42) {

                // If the answer is not equal to 42 - keep looping, but jump straight
                // back to the top!
                continue;
            }

            System.out.println("We just found it... The Answer to the Ultimate Question of Life, the Universe, and Everything!");
        }

        //------------------------------------------------------------------------------

        // Do-While

        // The other variation of the while loop, known as the do-while loop,
        // performs a single pass through the loop block first, before considering the
        // loop’s condition. It then continues to repeat the loop until the condition
        // is false.

        int doWhileNumber = 0;

        do {

            System.out.println( "do-while test " + String.valueOf(doWhileNumber));

            ++doWhileNumber;

        } while(doWhileNumber < 5);
    }
}
