package OfficeHours.Practice_03_16_2021;
import java.util.Scanner;
public class BakingContest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge = " + judge++ + " score");
        int scoreOne = scan.nextInt();
        System.out.println("Enter judge = " + judge++ + " score");
        int scoreTwo = scan.nextInt();
        System.out.println("Enter judge = " + judge++ + " score");
        int scoreThree = scan.nextInt();
        System.out.println("Enter other person 1s score");
        int otherPerson1 = scan.nextInt();
        System.out.println("Enter other person 2s score");
        int otherPerson2 = scan.nextInt();

        int ourAverageScore = (scoreOne + scoreTwo + scoreThree) / 3;

        if (ourAverageScore > otherPerson1 && ourAverageScore > otherPerson2) {
            System.out.println("First place");
        } else if ((ourAverageScore > otherPerson1 && ourAverageScore < otherPerson2)|| (ourAverageScore < otherPerson1 && ourAverageScore > otherPerson2)) {
            System.out.println("Second place");
        } else {
            System.out.println("Third place");
        }





    }
    
}
