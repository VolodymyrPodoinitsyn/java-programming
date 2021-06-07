package OfficeHours.Practice_03_30_2021;

import  java.util.*;

public class MaxNumberFrom5 {

    public static void main(String[] args) {
        /*
        [Max and Min from 5 numbers]
        - Write a program that can ask the user "enter a number" five time and return the maximum number
        - Write a program that can ask the user "enter a number" five times and return the minimum number
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int first = scan.nextInt();
        int max = first;
        int min = first;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            int number = scan.nextInt();

            if (number > max) {
                max = number;
            }
            if (number > min) {
                min = number;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min = " + min);

//        int numOne = scan.nextInt();
//        int numTwo = scan.nextInt();
//
//        int max = 0;
//
//        if (numOne > max) {
//            max = numOne;
//        }
//        if (numTwo > max) {
//            max = numTwo;
//        }
    }

}
