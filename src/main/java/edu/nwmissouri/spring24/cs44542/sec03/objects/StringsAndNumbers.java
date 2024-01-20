/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec03.objects;

import java.util.Random;
//import java.math.*;

/**
 *
 * @author S572818 SRILAKSHMI CHEEKATI
 */
public class StringsAndNumbers {

    public static void main(String[] args) {
        //Intialization and Basic Operations on Strings
        System.out.println("----------------------------------------STRING CLASS------------------------------");
        String stringExample = "Working with String Methods in Java!";//variable declaration and initialization
        System.out.println("The String is: " + stringExample);//Prints value of variable
        System.out.println("The Length of string is" + stringExample.length());//Prints length of the variable using length()
        char word = stringExample.charAt(5);//Storing value of the index given at charAt() 
        System.out.println("The Character at 5th index : " + word);//Prints value that stored in the variable word
        //SubString and Comparision
        String ss = stringExample.substring(11, 18);//ss stores substring from index 11 to 17 in stringExample
        System.out.println("The Substring from index 11 to 17 is : " + ss);
        //Checks wether the Methods substring present in the String or not it prints "Present" if it is there otherwise prints "not present"
        System.out.println(stringExample.contains("Methods") ? "The substring Methods is Present within the stringExample" : "The substring Methods is Not Present within the stringExample");

        /*if (stringExample.contains("Methods")) {
            System.out.println("The substring Methods is Present within the stringExample");
        } else {
            System.out.println("The substring Methods is Not Present within the stringExample");
        }*/
        //String Modification and Case Conversion
        String firstName = "Srilakshmi";
        String lastName = "Cheekati";
        String fullName = firstName + "_" + lastName;//Combines firstName and lastName with "_" and stores in variable fullName
        //String lCase = fullName.toLowerCase();//Converts fullName to Lowercase and stores in lCase variable and prints on the screen
        System.out.println("The Concatenated String in Lowercase is: " + fullName.toLowerCase());
        //String uCase = fullName.toUpperCase();//Converts fullName to Uppercase and stores in uCase variable and prints on the screen
        System.out.println("The Concatenated String in Uppercase is: " + fullName.toUpperCase());
        //Manipulation and Replacement
        String sampleText = "There are many String methods in Java!";
        // String newText = sampleText.replace("many", "various");//Replaces the First given string with the second string given and stores in another variable
        System.out.println("The result after replacement is:" + sampleText.replace("many", "various"));
        //Searching and Trimming:
        String searchText = " Java is an Object-Oriented Programming Language. Java is a high level, robust and secure programming language. ";
        //int secondJavaIndex = searchText.indexOf("Java", searchText.indexOf("Java") + 1);  // Find from after the first occurrence
        System.out.println("The index of second occurence of java is: " + searchText.indexOf("Java", searchText.indexOf("Java") + 1));
        //String trimmedText = searchText.trim();
        System.out.println("The searchText after trimming the spaces at the begining and end is: " + searchText.trim());
        //Equality and Comaparision
        String messageA = "hello";
        String messageB = "HELLO";

        // Check for equality ignoring case sensitivity
        //boolean areEqualIgnoreCase = messageA.equalsIgnoreCase(messageB);
        System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is: " + messageA.equalsIgnoreCase(messageB));

        // ii. Check for equality considering case sensitivity
        //boolean areEqual = messageA.equals(messageB);
        System.out.println("The result of comparing messageA and messageB considering case sensitivity is: " + messageA.equals(messageB));
        //Joining
        // Join firstName and lastName with a hyphen and print the result
        String joinedName = firstName + "-" + lastName;
        System.out.println("The result after joining firstName and lastName with a hyphen is: " + joinedName);
        System.out.println("-----------------------------------------Random Class--------------------------");
        //Random Class
        int[] availableBalls = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};  // Array to store available ball labels
        int numAvailableBalls = availableBalls.length;

        // 2. Player 1 of Team 2 picks a ball
        Random random = new Random();
        int randomIndex = random.nextInt(numAvailableBalls);  // Generate a random index within the array's bounds
        int player1Ball = availableBalls[randomIndex];        // Get the ball label at that index

        // Swap the picked ball with the last ball in the array to "remove" it
        availableBalls[randomIndex] = availableBalls[numAvailableBalls - 1];
        numAvailableBalls--;  // Decrement the number of available balls

        // System.out.println("Player 1 of Team 2 picked ball " + player1Ball);
        // 3. Player 2 of Team 2 picks a ball
        randomIndex = random.nextInt(numAvailableBalls);
        int player2Ball = availableBalls[randomIndex];

        // Swap the picked ball with the last ball in the array to "remove" it
        availableBalls[randomIndex] = availableBalls[numAvailableBalls - 1];
        numAvailableBalls--;

        //System.out.println("Player 2 of Team 2 picked ball " + player2Ball);
        // 4. Calculate and display the team's score
        int team2Score = player1Ball + player2Ball;
        System.out.println("The Total score for Team 2 is: " + team2Score);

        //random second scenario
        // i. Instantiate the Random class with a seed value of 20.
        Random randomWithSeed = new Random(20);

        // ii. Generate and print 5 pseudo-random floating-point values between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println("Random values between 0.0 and 1.0 with seed value of 20 ");
        for (int i = 0, j = 1; i < 5; i++, j++) {

            System.out.println("Random value " + j + " " + randomWithSeed.nextDouble());
        }

        // iii. Instantiate the Random class with no seed value.
        Random randomNoSeed = new Random();

        // iv. Generate and print 5 pseudo-random floating-point values between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println("Random values between 0.0 and 1.0 with no seed value ");
        for (int i = 0, j = 1; i < 5; i++, j++) {
            System.out.println("Random value " + j + " " + randomNoSeed.nextDouble());
        }

        boolean sameResults = areResultsSame(randomNoSeed);
        System.out.println("Results " + (sameResults ? "are same" : "are not same") + " when no seed is provided.");
        System.out.println("-------------------------------MATH CLASS---------------------------------------------");
        //Maths class
        //absolute value
        System.out.println("The Absolute difference between -20 and 15 is: " + Math.abs(-20 - 15));
        //rounded value
        System.out.println("The result of (14.6 * 3.8) rounded to the nearest integer is: " + Math.ceil(14.6 * 3.8));
        //floor value
        System.out.println("The floor value of (29.7/4.2) is: " + Math.floor(29.7 / 4.2));
        //square root finding and printing
        System.out.println("The Square root of the sum of squares of 10 and 20 is: " + Math.sqrt(Math.pow(10, 2) + Math.pow(20, 2)));
        //logarithm base
        System.out.println("The value of Logarithm base 2 of 256 is: " + Math.log(256) / Math.log(2));
        //Minimum value
        System.out.println("The Minimum value among -5, -10, 0, 15, and 8 is: " + Math.min(Math.min(-5, -10), Math.min(0, Math.min(15, 8))));
        //Maximum value
        System.out.println("The Maximum value between the product of 7 and 9 and the quotient of 40 divided by 5 is: " + Math.max(7 * 9, 40 / 5));
        //Trignometry sin
        System.out.println("The Result of sine of 30 degrees multiplied by the cosine if 60 degrees is: " + Math.sin(Math.toRadians(30)) * Math.cos(Math.toRadians(60)));
        //Trignometry tan
        System.out.println("The result of the Tangent of the difference between 45 and 30 degrees is: " + Math.tan(Math.toRadians(45 - 30)));
        //Evaluate the expression
        System.out.println("The Result of the expression is: " + ((Math.abs(3 - 5) + Math.sqrt(25) - (7 * 2)) / 2));
        System.out.println("Answer for Bonus question 1: ");
        System.out.println("The equals() method in Java is used for case-sensitive string comparison. It checks if the content of two strings is exactly the same, including the case.");

        System.out.println("The equalsIgnoreCase() method, on the other hand, is used for case-insensitive string comparison.It checks if the content of two strings is the same, ignoring differences in case (uppercase or lowercase).");
        System.out.println("Answer for Bonus question 2: ");
        System.out.println("Setting a specific seed value for a random number generator in Java ensures a deterministic sequence of random numbers, providing reproducibility. This is valuable in scientific experiments, simulations, or testing scenarios, allowing for consistent results across different program runs.");
        System.out.println("Answer for Bonus question 3: ");
        System.out.println("To access Math class methods in Java, use the class name 'Math' followed by a dot operator and the desired method, such as Math.sqrt(value) for square root calculation.");

    }

    private static boolean areResultsSame(Random random) {
        double firstRunValue = random.nextDouble();
        double secondRunValue = random.nextDouble();

        return firstRunValue == secondRunValue;
    }
}
