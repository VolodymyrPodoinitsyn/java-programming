package OfficeHours.Practice_04_13_2021;


import java.util.*;

public class SmallestAndLongestWordFromArray {

    public static void main(String[] args) {

        /*
        Shortest and longest words from String array
        - Write a program that can return the shortest string element from a String Array
        - Write a program that can return the longest string element from a String Array
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many words will you enter:");
        String[] words = new String[scan.nextInt()];

        scan.nextLine();

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word: " + (i + 1));
            words[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(words));
        // String smallest = words[0];
        // String largest = words[0];
        String[] smallAndLarge = {words[0], words[0]};

        for (String eachWord : words) {
            if (eachWord.length() < smallAndLarge[0].length()) { //  if (eachWord.length() < smallest.length())
                smallAndLarge[0] = eachWord; // smallest = eachWord;
            }
            if (eachWord.length() > smallAndLarge[1].length()) { //  if (eachWord.length() < largest.length())
                smallAndLarge[1] = eachWord; // largest = eachWord;
            }
        }

        System.out.println("Smallest element: " + smallAndLarge[0]);// smallest
        System.out.println("Largest element: " + smallAndLarge[1]); // largest


    }

}
