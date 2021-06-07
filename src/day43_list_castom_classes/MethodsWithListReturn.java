package day43_list_castom_classes;

import java.util.*;


public class MethodsWithListReturn {

    public static void main(String[] args) {
        //1 nanosecond = 1000_000_000 of seconds
        long start = System.nanoTime();
        System.out.println(System.nanoTime());
        List<Integer> mlnNums = getIntegerList();
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));

        long st = System.nanoTime();
        int[] arr = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en - st) / 1000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time seconds = " + seconds);

    }
    /**
     * getIntegerList
     * No params
     * return List<Integer>
     *    Loop from 0 - 1000_000
     *    and add to arraylist then return it
     */

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 1000_000; i++) {
            nums.add(i);

        }
        return nums;
    }
    /**
     * getIntegerArray
     * No params
     * return int[]
     *    Loop from 0 - 1000_000
     *    and add to int[] then return it
     */


    public static int[] getIntegerArray() {
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        //loop and assign numbers
        for(int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;
        }
        return nums; //return
    }



}
