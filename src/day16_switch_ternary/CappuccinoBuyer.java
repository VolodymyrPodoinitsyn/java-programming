package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 3.69;
        int calories = 90;

        switch(size) {
            case "tall":
                System.out.println("Tall cappuccino please");
                System.out.println("price = " + price);
                System.out.println("calories = " + calories);
                break;
            case "grade":
                System.out.println("Grade cappuccino please");
                System.out.println("price = " + price);
                System.out.println("calories = " + calories);
                break;
            case "venti":
                System.out.println("Venti cappuccino please");
                System.out.println("price = " + price);
                System.out.println("calories = " + calories);
                break;
            default:
                System.out.println("We dont serve that " + size + "Cappuccino");
                break;

        }
        System.out.println("Total price: $" + price + "\n" + "You will consume " + calories + " calories of energy");

    }
}
