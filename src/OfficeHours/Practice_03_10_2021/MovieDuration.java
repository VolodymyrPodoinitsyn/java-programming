package OfficeHours.Practice_03_10_2021;

/*
     [Movie duration]

     The length of the movie will determine how much it coast.
     Use a Scanner object to read the input from the user for how long the movie is and print
     out how much the movie will cost.
     The length will be given a decimal as hours.minutes
     > 1.0 - 8.99
     > 1.5 - 10.50
     > 2.0 - 14.50
     -> 3 or more - 15.99

 */

import java.util.Scanner;

public class MovieDuration {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter thr length of the movie");
        double movieLength = scan.nextDouble();
        double price = 0;

        if (movieLength == 1) {
            price = 8.99;
            System.out.println("Movie price = $" + price);
        } else if (movieLength == 1.5) {
            price = 10.50;
            System.out.println("Movie price = $" + price);
        } else if (movieLength == 2.0) {
            price = 14.50;
            System.out.println("Movie price = $" + price);
        } else if (movieLength >= 3.0) {
            price = 15.99;
            System.out.println("Movie price = $" + price);
        }
//        } else {
//            System.out.println("We dont have movie more then 3 hours");
//        }

    }

}
