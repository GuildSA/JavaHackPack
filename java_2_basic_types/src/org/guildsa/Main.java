package org.guildsa;

public class Main {

    public static void main(String[] args) {

        // Java is a type-safe language. This means that we need to tell Java what
        // types our variables or constants are supposed to be. This way, if part of
        // our code expects a String, we can’t pass it an int by mistake.

        /*
            Java has eight primitive types:

            Type     Description
            ---------------------------------------------------------------
            byte     An 8-bit (1-byte) integer value
            short    A 16-bit (2-byte) integer value
            int	     A 32-bit (4-byte) integer value
            long     A 64-bit (8-byte) integer value

            float    A 32-bit (4-byte) floating-point value
            double   A 64-bit (8-byte) floating-point value

            char     A 16-bit (2-byte) character using the Unicode encoding scheme

            boolean	 A true or false value
        */

        //------------------------------------------------------------------------------

        // For integers or counting numbers we get 4 types that vary based on size or
        // supported range.

        byte myByte = 42;
        short myShort = 1500;
        int myInt = 9000;
        long myLong = 2147483647L;     // Note the 'L' on the end to denote a long value!

        //------------------------------------------------------------------------------

        // For fractional numbers we get to choose how much accuracy we want by using
        // either float or double. A float takes up less memory than a double but it
        // is less accurate or precise.

        float myFloat = 0.0f;     // Note the 'f' on the end to denote a float value!
        double myDouble = 0.0;

        // For example, if we use a double for our variable latitude, and the fractional
        // part has a lot of numbers, everything will still be fine.

        double latitude = 36.166667;
        System.out.println("latitude = " + latitude);

        // But notice how our longitude, which is using a float, loses the last 3
        // from its value's end when printed to the console. Does it matter? Well, that
        // depends on what you're going to do with the value.

        float longitude = -86.783333f;
        System.out.println("longitude = " + longitude);


        //------------------------------------------------------------------------------

        // Another built-in data type of Java is called boolean, which can only store
        // the values true or false.

        boolean myBoolean = true;

        // There's also a type called char which can only hold a single Unicode character value.
        // It's often used when processing or manipulating String data.

        char myChar = 'A';

        // https://en.wikipedia.org/wiki/List_of_Unicode_characters

        //------------------------------------------------------------------------------

        // Now, the String type is a class, so it is not a primitive data type, but
        // considering how often it gets used, most programmers mistakenly think of it
        // as a built-in, primitive type..

        String myString = "This is a string!";

        System.out.println("myString = " + myString);

        //------------------------------------------------------------------------------

        // Arrays

        // We can also define variables that are used to store many values of the same
        // type. These are called arrays. An array is an ordered collections of values.

        // This declares an array of integers.
        int[] myArray1;

        // This allocates memory for 10 integers
        myArray1 = new int[10];

        // Here we use the subscript syntax to specify the index for initialization.

        myArray1[0] = 100; // Initialize the first element
        myArray1[1] = 200; // Initialize the second element
        myArray1[2] = 300; // ... and so forth...
        myArray1[3] = 400;
        myArray1[4] = 500;
        myArray1[5] = 600;
        myArray1[6] = 700;
        myArray1[7] = 800;
        myArray1[8] = 900;
        myArray1[9] = 1000;

        System.out.println("Element at index 9 = " + myArray1[9]);
        System.out.println("myArray1 length = " + myArray1.length);

        //------------------------------------------------------------------------------

        // We can also declare, allocate and assign values to an array all in one
        // statement like this.
        int[] myArray2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Element at index 9 = " + myArray2[9]);
        System.out.println("myArray2 length = " + myArray2.length);

        //------------------------------------------------------------------------------

        // Similarly, you can declare arrays of other types like so:

        /*
            byte[] anArrayOfBytes;
            short[] anArrayOfShorts;
            long[] anArrayOfLongs;
            float[] anArrayOfFloats;
            double[] anArrayOfDoubles;
            boolean[] anArrayOfBooleans;
            char[] anArrayOfChars;
            String[] anArrayOfStrings;
        */

        // Here's an example of an array of Strings to hold some weapon names for a game!

        String[] weaponsArray = { "Dagger", "Sword", "Club" };

        System.out.println("weaponsArray length = " + weaponsArray.length);

        // Since the order of our array entries are maintained, we can index into the
        // array using a number.

        System.out.println("Weapon at index 0 = " + weaponsArray[0]);
        System.out.println("Weapon at index 1 = " + weaponsArray[1]);
        System.out.println("Weapon at index 2 = " + weaponsArray[2]);

        // We can also the subscript syntax to assign a new value to the var being stored
        // there.

        weaponsArray[2] = "Battle Mace"; // Upgrade that old Club to a Battle Mace!

        System.out.println("Weapon at index 2 = " + weaponsArray[2]);

        // Be careful though! Indexing an array position that doesn't exist can cause a crash!
        //System.out.println("Weapon at index 3: " + weaponsList[3]);

        //------------------------------------------------------------------------------

        // Finally, we can declare multidimensional arrays by using two or more sets of
        // brackets such as String[][] myVarName.

        // In the Java programming language, a multidimensional array is an array whose
        // components are themselves arrays. This is unlike arrays in C or C++.
        // A consequence of this is that the rows are allowed to vary in length,
        // as shown here:

        String[][] weaponTypes = {
            {"Bronze", "Iron", "Steel"},
            {"Sword", "Spear"}
        };

        // Array 0 at index 0 = Bronze
        // Array 1 at index 0 = Sword
        System.out.println(weaponTypes[0][0] + " " + weaponTypes[1][0]);

        // Array 0 at index 1 = Iron
        // Array 1 at index 0 = Sword
        System.out.println(weaponTypes[0][1] + " " + weaponTypes[1][0]);

        // Array 0 at index 1 = Iron
        // Array 1 at index 1 = Spear
        System.out.println(weaponTypes[0][1] + " " + weaponTypes[1][1]);

        // Array 0 at index 2 = Steel
        // Array 1 at index 1 = Spear
        System.out.println(weaponTypes[0][2] + " " + weaponTypes[1][1]);


        // Be careful when accessing length though... which length are you talking about!?
        System.out.println(weaponTypes.length); // The weaponTypes array has 2 sub-arrays.
        System.out.println(weaponTypes[0].length); // The length of the first sub-array is 3.
        System.out.println(weaponTypes[1].length); // The length of the second sub-array is 2.

        //------------------------------------------------------------------------------

        // NOTE: You can also place the brackets after the array's name when declaring
        // the variable, but this form is discouraged! This is how you can spot a C++
        // developer who now codes in Java! ;)

        // float[] anArrayOfFloats;  // YES! The Java Way!
        // float anArrayOfFloats[];  // Works but weird!
    }
}
