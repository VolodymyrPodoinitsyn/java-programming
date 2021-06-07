package day09_scanner_practice;
import java.util.Scanner;
public class Fahrenheit2Celsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** FAHRENHEIT TO CELSIUS *****");
        System.out.println("Enter Fahrenheit value: ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " fahrenheit in celsius: " + celsius);


    }
}
