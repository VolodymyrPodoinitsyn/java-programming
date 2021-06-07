package day42_arraylist;

import java.util.*;

public class MethodsWithList {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html");
        words.add("selenium"); words.add("a");
        words.add("input"); words.add("title");

        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python"));

        List<Integer> nums = Arrays.asList(23, 11, 44, 55, 88, 66);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);
        



    }

    public static void printStrList(List<String> stringList) {

        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static int sumIntegerList(List<Integer> integerList) {

        int sum = 0;
        for (int each : integerList) {
            sum += each;
        }
        return sum;

    }


}



