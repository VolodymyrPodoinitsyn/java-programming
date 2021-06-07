package day24_loops;

import java.util.*;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();
        //System.out.println(randomNum.nextInt(101));
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;

        do {
            System.out.println("Guess the secret number");
            //System.out.println("Enter number");
            guessingNumber = scan.nextInt(); // randomNum.nextInt(101);60
            if (guessingNumber > secretNumber) {
                System.out.println("Wrong, your number is too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, your number is too small");
            }
        } while (secretNumber != guessingNumber);

        System.out.println("Congratulations, you won! secret number: " + secretNumber);


    }

}
