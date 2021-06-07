package OfficeHours.Practice_04_06_2021;

import java.util.*;

public class RandomSixDigitNumber {

    public static void main(String[] args) {

        /*
        CHALLENGE - THIS WIIL BE DIFFICALT BUT TRY IT. DONT SPEND TOO MUCH TIME
        Generate a random number that is six digits long. Each digit in this number should be unique,
        meaning the number 6 digit number have 6 different character numbers that make it up.
        print the number.
        HINTS: Loops, String, Random
         */

        Random random = new Random();

        String randomNumber = "";

        while (randomNumber.length() != 6) {
            int eachRandom = random.nextInt(10); // 0-9
          //int eachRandom = random.nextInt(9) + 1; // 1-9

            if (!randomNumber.contains("" + eachRandom)) {
                randomNumber += eachRandom;
            }
        }

        System.out.println("Random number: " + randomNumber);


    }

}
