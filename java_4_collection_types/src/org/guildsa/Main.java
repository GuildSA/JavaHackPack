package org.guildsa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Collection Types

        // Java provides several collection types such as ArrayList and HashMap which
        // can be used for storing a collections of values.

        //------------------------------------------------------------------------------

        // ArrayList

        // Collection types such as the ArrayList or more powerful than a regular array
        // such as the weaponsArray below:
        //
        // String[] weaponsArray = { "Dagger", "Sword", "Club" };
        //
        // Most notably, an ArrayList can grow in size after being declared where as a
        // regular array can not.
        //
        // http://java67.blogspot.com/2012/12/difference-between-array-vs-arraylist-java.html


        // Here's an ArrayList to hold some weapon names for a game!

        ArrayList<String> weaponsList = new ArrayList<>(Arrays.asList("Dagger", "Sword", "Club"));

        // Since the order of our ArrayList entries are maintained, we can get the data held at a
        // certain index position by passing a number into the get() method.
        System.out.println(weaponsList.get(0));
        System.out.println(weaponsList.get(1));
        System.out.println(weaponsList.get(2));

        // Be careful though! Trying to get an array position that doesn't exist can cause a crash!
        //System.out.println(weaponsList.get(3));

        // We can also use the set() method to assign a new value to existing position.

        weaponsList.set(2, "Battle Mace"); // Upgrade that old Club to a Battle Mace!

        System.out.println("-------------------");

        for(String w : weaponsList) {
            System.out.println("Weapon: " + w);
        }

        // We can add new entries to the ArrayList by calling the append method. The append
        // method always adds to the end of the array.
        weaponsList.add("Long Bow");

        System.out.println("-------------------");

        for(String w : weaponsList) {
            System.out.println("Weapon: " + w);
        }

        // If we want to add something at a certain index, we can use a special version
        // of the add() method to insert a new value at that index.
        weaponsList.add(1, "Broad Sword");

        System.out.println("-------------------");

        for(String w : weaponsList) {
            System.out.println("Weapon: " + w);
        }

        // Likewise, we can also remove items.
        weaponsList.remove(0);

        System.out.println("-------------------");

        for(String w : weaponsList) {
            System.out.println("Weapon: " + w);
        }

        //------------------------------------------------------------------------------

        // HashMap

        // The HashMap class uses an internal data-structure called a hash-table to
        // implement a mapping of keys to their values. This allows the execution time
        // of basic operations, such as get() and put(), to remain constant even for
        // large daa sets.


        // Here's how to create a HashMap of player names and their scores. The player's
        // name is the key which points to the score which is the value.

        HashMap<String, Integer> playerScores = new HashMap<>();

        playerScores.put("Calvin", 2100);
        playerScores.put("Jennifer", 2700);

        System.out.println("Total number of players: " + playerScores.size());

        // We can an update the value of a key using the put() method. Note how it
        // returns the old value.
        int oldValue = playerScores.put("Calvin", 2900);


        // We can also ask our HashMap if it has a certain key or not.
        String searchKey = "Calvin";

        if(playerScores.containsKey(searchKey)) {

            System.out.println(playerScores.get(searchKey) + " points for " + searchKey + "!");
        }

        // Clear all values.
        playerScores.clear();

        System.out.println("Total number of players: " + playerScores.size());

        //------------------------------------------------------------------------------

        // A HashSet stores distinct values of the same type in a collection with no defined
        // ordering. You can use a set instead of an array when the order of items is not
        // important, or when you need to ensure that an item only appears once.

        HashSet<Character> letters = new HashSet<>();

        System.out.println("Our set has " + letters.size() + " items.");

        letters.add('A');

        System.out.println("Our set has " + letters.size() + " items.");

        letters.add('A'); // Our set already has an "A", so this will do nothing.

        System.out.println("Our set has " + letters.size() + " items.");

        letters.add('B');

        System.out.println("Our set has " + letters.size() + " items.");

        if(letters.contains('B')) {
            System.out.println("Our set has a B!");
        } else {
            System.out.println("Our set has NO B!");
        }

        letters.add('C');

        System.out.println("Our set has " + letters.size() + " items.");

        letters.remove('C');

        System.out.println("Our set has " + letters.size() + " items.");

        if(letters.contains('C')) {
            System.out.println("Our set has a C!");
        } else {
            System.out.println("Our set has NO C!");
        }

        letters.clear();

        System.out.println("Our set has " + letters.size() + " items.");
    }
}
