package day36_methods_with_return;

public class CreditScore {

    public static void main(String[] args) {

        checkEligible(750);
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);

    }

    public static void checkEligible(int creditScore) {

        if (creditScore >= 700) {
            System.out.println("You are eligible for leasing car");
        } else {
            System.out.println("You are not eligible for leasing car");
        }
    }

    public static int getCreditScore() {
        return 800;
    }
}
