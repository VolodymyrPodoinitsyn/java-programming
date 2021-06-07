package OfficeHours.Practice_03_30_2021;

public class PrefixAgain {

    public static void main(String[] args) {

        /*
        Given a String str and a number n check if the prefix (made of up of the first n characters)
    appears in the remaining part of the String. Print true or false.

    Assume that the String is not empty snd that n is in the range from 1 to str.length()

    Example:

    input: abXYabc
    input: 1

    output: true
         */

        String str = "abXYabc";  // abXYabc
        int n = 1;       // 1    --> a   bXYabc

        String prefix = str.substring(0, n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(prefix));

    }

}
