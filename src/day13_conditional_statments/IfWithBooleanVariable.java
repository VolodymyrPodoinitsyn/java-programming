package day13_conditional_statments;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        if (isHungry == true) {
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code Java");
        }else {
            System.out.println("I am not hungry, lets keep coding Java");
        }
        
        double price = 230.44;
        boolean isAffordable = price <= 200;
        System.out.println("isAffordable = " + isAffordable);

        if (isAffordable) {
            System.out.println("I can afford it, lets buy!");
        }else {
            System.out.println("Too expensive, lets keep coding Java");
        }

        boolean isRemoteJob = true;

        if (!isRemoteJob) {
            System.out.println("Sorry I am not interested");
        }else {
            System.out.println("Sure, I am interested , what is the interview process?");
        }

        
    }
}
