package org.guildsa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Collection Types

        // Java provides several collection types such as ArrayList, HashMap and
        // HashSet which can be used to store a collections of values.

        //------------------------------------------------------------------------------

        // ArrayList

        // Collection types such as the ArrayList or more powerful than a regular array
        // such as the weaponsArray below:

        String[] weaponsArray = { "Dagger", "Sword", "Club" };

        // Most notably, an ArrayList can grow in size after being declared where as a
        // regular array can not.
        //
        // http://java67.blogspot.com/2012/12/difference-between-array-vs-arraylist-java.html


        // Here's an ArrayList to hold some weapon names for our game!

        ArrayList<String> weaponsList = new ArrayList<>(Arrays.asList("Dagger", "Sword", "Club"));

        // Since the order of our ArrayList entries are maintained, we can get the data held at a
        // certain index position by passing a number into the get() method.
        System.out.println(weaponsList.get(0));
        System.out.println(weaponsList.get(1));
        System.out.println(weaponsList.get(2));

        // We can also call the toString() method to have the collection type dump out its
        // values for printing.
        System.out.println(weaponsList.toString());

        // Be careful though! Trying to get an array position that doesn't exist can cause a crash!
        //System.out.println(weaponsList.get(3));

        // We can also use the set() method to assign a new value to existing position.

        weaponsList.set(2, "Battle Mace"); // Upgrade that old Club to a Battle Mace!

        System.out.println(weaponsList.get(2));

        // We can add new entries to the ArrayList by calling the append method. The append
        // method always adds to the end of the array.
        weaponsList.add("Long Bow");

        System.out.println(weaponsList.toString());

        // If we want to add something at a certain index, we can use a special version
        // of the add() method to insert a new value at that index.
        weaponsList.add(2, "Broad Sword");

        System.out.println(weaponsList.toString());

        // Likewise, we can also remove items.
        weaponsList.remove(1);

        System.out.println(weaponsList.toString());

        //------------------------------------------------------------------------------

        // While we're talking about these new collections types it's important to
        // understand that they can not be used to store primitive types such as int,
        // float, double, char, etc. They can only store objects!

        // To help us work around this restriction, Java provides a series of classes
        // that act as wrappers around the 8 primitive types, so we can store them
        // inside collection types:
        //
        //    Byte
        //    Short
        //    Integer
        //    Long
        //    Float
        //    Double
        //    Character

        // Here's an example of creating a primitive int vs an Integer object.

        // Declare a primitive int variable.
        int myPrimitiveInt = 42;

        System.out.println(myPrimitiveInt);


        // Declare an Integer object variable having the same value.
        Integer myObjectInt = 42;

        // Integer, like other objects, has a method called toString() that will
        // turn the value into a String.
        System.out.println(myObjectInt.toString());

        // We can use the Integer class to find out what the MIN and MAX values
        // are that Integer can support.
        System.out.println("Integer Min value: " + Integer.MIN_VALUE);
        System.out.println("Integer Max value: " + Integer.MAX_VALUE);

        // Also, Integer can help us turn a String that holds a number into
        // an actual primitive int value.
        int myInt = new Integer("2016");

        System.out.println(myInt);

        //------------------------------------------------------------------------------

        // HashMap

        // The HashMap class uses an internal data-structure called a hash-table to
        // implement a mapping of keys to their values. This allows the execution time
        // of basic operations, such as get() and put(), to remain constant even for
        // large data sets.


        // Here's how to create a HashMap of player names and their scores. The player's
        // name is the key which points to the score which is the value.

        HashMap<String, Integer> playerScores = new HashMap<>();

        playerScores.put("Calvin", 2100);
        playerScores.put("Jennifer", 2700);

        System.out.println("Total number of players: " + playerScores.size());
        System.out.println(playerScores.toString());

        // We can an update the value of a key using the put() method. Note how it
        // returns the old value.
        int oldValue = playerScores.put("Calvin", 2900);

        System.out.println("Removed value: " + String.valueOf(oldValue));
        System.out.println(playerScores.toString());

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

        letters.add('A');

        System.out.println("Our set has " + letters.size() + " items.");

        System.out.println(letters.toString());

        letters.add('A'); // Our set already has an "A", so this will do nothing.

        System.out.println(letters.toString());

        letters.add('B');

        System.out.println(letters.toString());

        // We can use the contains() method to check for an entry in the Set.
        if(letters.contains('B')) {
            System.out.println("Our set has a B!");
        } else {
            System.out.println("Our set has NO B!");
        }

        letters.add('C');

        System.out.println(letters.toString());

        // We can use the remove() method to remove an entry from the Set.
        letters.remove('C');

        System.out.println(letters.toString());

        // We can use the clear() method to remove all entries from the Set.
        letters.clear();

        System.out.println("After clear(), our set has " + letters.size() + " items.");
    }
}
