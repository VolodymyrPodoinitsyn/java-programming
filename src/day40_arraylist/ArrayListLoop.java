package day40_arraylist;

import java.util.*;

public class ArrayListLoop {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); // Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(33);
        nums.add(44);
        nums.add(55);
        nums.add(22);
        nums.add(77);
        nums.add(11);
        nums.add(88);
        nums.add(44);

        System.out.println("nums = " + nums);
        
        nums.remove(0);
        System.out.println("nums = " + nums);
        //nums.remove(88);
        nums.remove(new Integer(88));
        System.out.println("nums = " + nums);

        nums.remove(new Integer(44));
        System.out.println("nums = " + nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

        }

        for (int each : nums) {
            System.out.print(each + " ");
        }




    }

}
