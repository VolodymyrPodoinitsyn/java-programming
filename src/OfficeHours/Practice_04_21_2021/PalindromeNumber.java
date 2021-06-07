package OfficeHours.Practice_04_21_2021;

public class PalindromeNumber {

    public static void main(String[] args) {

//        System.out.println(112 % 1);
//        System.out.println(112 % 10);
//        System.out.println(112 % 100);

        System.out.println(isPalindrome(12321));

    }

    public static boolean isPalindrome(int number) {

        int revers = 0;
        int temp = number;

        while (temp != 0) {

            int lastDigit = temp % 10;
            revers = (revers * 10) + lastDigit;
            temp /= 10;
            System.out.println(revers);

//            System.out.println("last digit - " + number % 10);
//            number /= 10;
//            System.out.println("number after / 10: " + number);
//            System.out.println();

        }

        return revers == number;
    }

}
