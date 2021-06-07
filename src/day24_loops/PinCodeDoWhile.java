package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;
//        int a =0;
        do {
            System.out.println("Enter Pin Code");
            pinCode = scan.nextInt();
//            a++;
//            if (a > 2) {
//                System.out.println("Incorect Pin Code ");
//                Thread.sleep(10000);
//            }
        } while (pinCode != secretPinCode);
        System.out.println("Welcome to your account");
    }

}
