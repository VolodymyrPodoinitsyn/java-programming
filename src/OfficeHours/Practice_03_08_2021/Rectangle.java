package OfficeHours.Practice_03_08_2021;
/*
    Make a class Rectangle
    create a main method

        - Declare two variables: length and width

           - Calculate the Perimeter 2(l + w)
           - Calculate the Area (w * l)

        -  Print properties of the Rectangle

        - modify to accept Scanner inputs
 */
// PIC: package->import->class

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {

        // Hard coded values

//        double length = 5;
//        double width = 3;

        // dynamic with Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you length: ");
        double length = scan.nextDouble();
        System.out.println("Enter you width: ");
        double width = scan.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);



    }
}
