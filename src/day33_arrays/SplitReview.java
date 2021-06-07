package day33_arrays;

import java.util.Arrays;

public class SplitReview {

    public static void main(String[] args) {
        
        String word = "java";
        String[] array = word.split("a");

        System.out.println(array.length);
        int countOfA = array.length - 1;
        if (word.endsWith("a")) {
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);
        System.out.println("==================");

        String[] arr = word.split("");
        System.out.println(Arrays.toString(arr));

        String word2 = "java1html2sql";
        String[] strArr = word2.split("\\d");
        System.out.println(Arrays.toString(strArr));

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }

}
