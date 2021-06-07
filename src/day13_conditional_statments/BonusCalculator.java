package day13_conditional_statments;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus;
        double salesAmount = 2000.55;

        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50.0;
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100.0;
        }
        System.out.println("Your bonus for salesAmount is - $" + bonus);
    }
}
