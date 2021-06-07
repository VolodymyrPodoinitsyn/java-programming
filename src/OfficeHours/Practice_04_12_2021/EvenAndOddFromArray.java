package OfficeHours.Practice_04_12_2021;

import java.util.*;


public class EvenAndOddFromArray {

    public static void main(String[] args) {

        /*
        Write a program that can count the even and odd number from an array of integers
     Use for eah to make it easier

     Ex:
     Input: [4, 1, 3, 12, 5]
     output:
     Evan: 2
     Odd: 3
         */

        int[] nums = {4, 1, 3, 12, 5};
//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many numbers do you have");
//        int[] nums = new int[scan.nextInt()];
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println("Enter number " + (i + 1));
//            nums[i] = scan.nextInt();
//        }

        int even = 0;
        int odd = 0;

        for (int eachNum : nums) {

            if (eachNum % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

        System.out.println("=========================================");

        int[] evenNumbers = new int[even];
        int[] oddNumbers = new int[odd];

        for (int i = 0, e = 0, o = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                evenNumbers[e++] = nums[i];

            } else {
                oddNumbers[o++] = nums[i];

            }

        }
        System.out.println("Even Array: " + Arrays.toString(evenNumbers));
        System.out.println("Odd Array: " + Arrays.toString(oddNumbers));



    }

}
