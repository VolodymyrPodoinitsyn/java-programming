package day18_conditions_practice_strings_intro;

public class Authentication {

    public static void main(String[] args) {

        int expLast4SSN = 6369;
        int expPinCode = 4444;

        int last4SSN = 5555;
        int pinCode =1111;

        if (expLast4SSN == last4SSN && expPinCode == pinCode) {
            System.out.println("Authentication successful ");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
            }
            if (expPinCode != pinCode) {
                System.out.println("Pin code is incorrect");
            }
        }
    }

}
