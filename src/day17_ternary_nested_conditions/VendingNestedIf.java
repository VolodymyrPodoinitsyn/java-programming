package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "coke";
        String snack = "chips";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drink.equals("coke")) {
                System.out.println("coke is selected");
            } else {
                System.out.println("tea is selected");
            }
        } else if (selection.equals("snake")) {
            System.out.println("snake option is selected");
            if (snack.equals("chips")) {
                System.out.println("ships is selected");
            } else {
                System.out.println("candy is selected");
            }
        }

    }

}

