package OfficeHours.Practice_03_22_2021;

import java.util.*;

public class ScannerNextLine {

    public static void main(String[] args) {

        // nest() vs nextLine
        /*

        next() -> read a String value from the console
                   it only reads a single word -> spaces separate word

        nextLine() -> read a String value  from the console
                      it will read multiple words
                      -> Also accepts the enter input
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        System.out.println("Enter you name");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println(number);
        System.out.println(name);


    }

}
