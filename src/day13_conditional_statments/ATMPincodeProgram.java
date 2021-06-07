package day13_conditional_statments;
import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** WELCOME TO TD BANK ATM *****");
        int secretPincode = 1234;//scan.nextInt();
        int inputPincode = scan.nextInt();
        if (secretPincode == inputPincode) {
            System.out.println("WELCOME TO YOUR ACCOUNT");
            System.out.println("YOU CAN WITHDRAW, CHECK BALANCE, DEPOSIT");
        }else {
            System.out.println("INCORRECT PINCODE! " + secretPincode);
            System.out.println("PLEASE TRY AGAIN");
        }
        System.out.println("***** THANK YOU FOR USING TD BANK ATM! *****");

    }
}
