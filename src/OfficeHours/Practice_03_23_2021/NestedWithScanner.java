package OfficeHours.Practice_03_23_2021;

import java.util.*;

public class NestedWithScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Enter a single word");
            String word = (scan.next());

            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }
        } else {

            System.out.println("Enter a character");
            char letter = scan.next().charAt(0);

            /*
            [Character Checker]
            Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' -->
            'G' --> uppercase 'o' --> uppercase
            Hint: Use the ASCII table
             */

            if (letter >= 'A' && letter <= 'Z') { // if (letter >= 65 && letter <= 90)
                System.out.println(letter + " is uppercase letter");
            } else if (letter >= 'a' && letter <= 'z') { // if (letter >= 97 && letter <= 122)
                System.out.println(letter + " is lowercase letter");
            } else {
                System.out.println(letter + "is not a valid latter");
            }

        }

    }

}
