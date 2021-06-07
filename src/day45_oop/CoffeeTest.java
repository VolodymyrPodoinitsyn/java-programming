package day45_oop;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());
    }

}
