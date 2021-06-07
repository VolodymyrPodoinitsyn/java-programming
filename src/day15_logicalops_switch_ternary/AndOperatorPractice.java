package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden spoon";

        if (onSale && freeShipping) {
            System.out.println("I would add " + itemName + " in cart" );
        } else {
            System.out.println("Continue shopping for good deal on - " + itemName);
        }

        if (onSale && freeShipping && itemName.equals("Wooden spoon")) {
            System.out.println("I would add " + itemName + " in cart" );
        } else {
            System.out.println("Continue shopping for good deal on - " + itemName);
        }


    }
}
