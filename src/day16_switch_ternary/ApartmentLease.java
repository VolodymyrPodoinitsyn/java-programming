package day16_switch_ternary;

import java.sql.SQLOutput;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms = 1;
        double startingPrice = 0.0;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1755;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedroom unavailable");

        }
        System.out.println("Starting price = $" + startingPrice);



    }
}
