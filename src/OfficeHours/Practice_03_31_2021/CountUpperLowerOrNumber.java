package OfficeHours.Practice_03_31_2021;

public class CountUpperLowerOrNumber {

    public static void main(String[] args) {

        /*
        Count upper, lowe, and numbers
   Given a String, find and print how many uppercase letter, lowercase letter, and number arw in the String
   EX:
   Input: 2juMp41EEkd4s4
   Output:
   3 uppercase latter
   6 lowercase latter
   5 numbers
         */

        String str = "2juMp41EEkd4s4";
        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);

            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCase++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCase++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                number++;
            }

        }
        System.out.println(upperCase + " - uppercase letter");
        System.out.println(lowerCase + " - lowercase letter");
        System.out.println(number + " - numbers");


    }

}
