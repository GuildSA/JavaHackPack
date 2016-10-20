package org.guildsa;

public class Main {

    public static void main(String[] args) {

        // Arithmetic Operators

        // We've already seen the assignment operator (=) in action:

        int myVar = 42;

        // In addition to assignment, Java supports the four standard arithmetic
        // operators for all number types:
        // Addition (+)
        // Subtraction (-)
        // Multiplication (*)
        // Division (/)

        int testVar1 = 1 + 2;       // Equals 3
        int testVar2 = 5 - 3;       // Equals 2
        int testVar3 = 2 * 3;       // Equals 6
        double testVar4 = 10.0 / 2.5;  // Equals 4.0

        System.out.println("testVar1 = " + testVar1);
        System.out.println("testVar2 = " + testVar2);
        System.out.println("testVar3 = " + testVar3);
        System.out.println("testVar4 = " + testVar4);

        //------------------------------------------------------------------------------

        // Compound Assignment Operators

        // Like C, Java provides compound assignment operators that combine assignment
        // (=) with another operation. We can use these special assignment operators
        // to reduce the amount of code we have to write.

        int myNumber = 100;

        myNumber += 5; // Same as saying: myNumber = myNumber + 5

        System.out.println("myNumber = " + myNumber);

        myNumber -= 5; // Same as saying: myNumber = myNumber - 5

        System.out.println("myNumber = " + myNumber);

        myNumber *= 5; // Same as saying: myNumber = myNumber * 5

        System.out.println("myNumber = " + myNumber);

        myNumber /= 5; // Same as saying: myNumber = myNumber / 5

        System.out.println("myNumber = " + myNumber);

        //------------------------------------------------------------------------------

        // The addition operator is also supported for Strings. When the addition
        // operator is used to join two Strings together it is called, concatenation.

        System.out.println("Hello, " + "world!");  // Equals the single String, "Hello, world".

        //------------------------------------------------------------------------------

        // Increment and Decrement Operators

        // Like C, Java provides an increment operator (++) and a decrement operator (--)
        // as a shortcut to increase or decrease the value of a numeric variable by 1.
        // You can use these operators with variables of any integer or floating-point type.

        int i = 0;

        ++i; // i now equals 1. Essentially, ++i is shorthand for saying i = i + 1.

        System.out.println("i = " + i);

        --i; // And --i is shorthand for saying i = i - 1.

        System.out.println("i = " + i);

        // We can also place the increment and decrement operators after the variable.
        int j = 0;

        j++;

        System.out.println("j = " + j);

        j--;

        System.out.println("j = " + j);

        // When the operator is before the variable, we call it the prefix version of the
        // operator, and when it's after the variable, it is the postfix version of the
        // operator. Which one you choose to use doesn't matter unless the increment or
        // decrement operator is being used as part of a larger assignment.

        int a = 10;
        int b = 10;

        int x = ++a;   // Increments the value of 'a' BEFORE assigning it to 'x'.

        System.out.println("x = " + x);

        int y = b++;   // Increments the value of 'b' AFTER assigning it to 'y'.

        System.out.println("y = " + y);

        //------------------------------------------------------------------------------

        // Comparison Operators

        // Java supports all standard C comparison operators:

        // Equal to                  (a == b)
        // Not equal to              (a != b)
        // Greater than              (a > b)
        // Less than                 (a < b)
        // Greater than or equal to  (a >= b)
        // Less than or equal to     (a <= b)

        // This will print true, because 1 is equal to 1
        System.out.println("Equal to : " + String.valueOf( 1 == 1 ));

        // This will print true, because 2 is not equal to 1
        System.out.println("Not equal to : " + String.valueOf( 2 != 1 ));

        // This will print true, because 2 is greater than 1
        System.out.println("Greater than : " + String.valueOf( 2 > 1 ));

        // This will print true, because 1 is less than 2
        System.out.println("Less than : " + String.valueOf( 1 < 2 ));

        // This will print true, because 1 is greater than or equal to 1
        System.out.println("Greater than or equal to : " + String.valueOf( 1 >= 1 ));

        // This will print false, because 2 is not less than or equal to 1
        System.out.println("Less than or equal to : " + String.valueOf( 2 <= 1 ));

        //------------------------------------------------------------------------------

        // Logical Operators

        // Logical operators modify or combine the Boolean logic values true and false.
        // Java supports the three standard logical operators found in C-based languages:
        //
        // Logical AND (a && b) - Returns true if both expressions are true
        // Logical OR  (a || b) - Returns true if either of the two expressions are true
        // Logical NOT (!a)     - Negates or inverts the expression's result.

        // This will print true, because both 2 > 1 AND 4 > 2 are true.
        System.out.println("Logical AND : " + String.valueOf( 2 > 1 && 4 > 2 ));

         // This will print true, because at least one of the expressions is true.
        System.out.println("Logical OR : " + String.valueOf( 2 > 1 || 0 > 100 ));

        // This will print false because even though (1 == 1) is true the ! inverts
        // the result and makes it false.
        System.out.println("Logical NOT : " + String.valueOf( !(1 == 1) ));

        //------------------------------------------------------------------------------

        // Ternary Conditional Operator

        // The ternary conditional operator is a special operator with three parts, which
        // takes the form of question ? answer1 : answer2.

        int speed = 100;
        boolean turboButtonPressed = true;

        speed = (turboButtonPressed ? speed * 2 : speed);

        System.out.println("speed = " + speed);

        // With out a Ternary Conditional Operator, we would have to write a bit more
        // code to get the same result.

        speed = 100;
        turboButtonPressed = true;

        if(turboButtonPressed) {
            speed = speed * 2;
        }

        System.out.println("speed = " + speed);
    }
}
