package day12_conditionals_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSped = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSped > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);

        currentSped +=20;
        isSpeeding = currentSped > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can i afford? - " +(accountBalance >= itemPrice));
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can i afford? - " +canAfford);

        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);



    }
}
