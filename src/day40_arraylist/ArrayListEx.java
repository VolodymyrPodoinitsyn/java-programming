package day40_arraylist;

import java.util.*;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);

        System.out.println("size = " + nums.size());

        System.out.println("indes 0 = " + nums.get(0));
        System.out.println("indes 1 = " + nums.get(1));
        System.out.println("indes 2 = " + nums.get(2));

        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);




    }

}
