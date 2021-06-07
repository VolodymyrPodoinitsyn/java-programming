package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 6, 0));
        System.out.println(nums);
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer eachNum : nums) {
            //1`
            if (Collections.frequency(nums,eachNum) == 1) {
                System.out.print(eachNum + " ");
                uniqueList.add(eachNum);
            }
        }
        System.out.println("\nuniqueList = " + uniqueList);
    }

}
