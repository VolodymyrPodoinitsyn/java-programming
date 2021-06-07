package day10_shorthand_operators;

import java.util.Scanner;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars = " + cars);
        cars += 2;
        System.out.println("cars = " + cars);
        cars++;
        System.out.println("cars = " + cars);

        cars -= 7;
        System.out.println("cars = " + cars);

//        cars -= 6;
//        System.out.println("cars = " + cars);

        int electricCars = 13;
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word += " programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word+= 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        parkingFee /= 2;
        System.out.println(" erly bird parking fee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = " + parkingFee);

    }
}
