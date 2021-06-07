package day43_list_castom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {

    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size()" + getDays().size());
        System.out.println("getDays().get(0)" + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);

        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames.removeIf = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);
        System.out.println("nums = " + nums);

    }

    public static List<String> getDays() {
        List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
        //or
        // List<String> days = new ArrayList<>()
        //days.add("Monday"); days.add("Tuesday").....
        return days;
    }

    public static List<Integer> getRandomList(int size) {

        Random random = new Random();//new random object 
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
//            int n = random.nextInt(101);
//            if (!nums.contains(n)) {
//                nums.add(n);
//            }

            nums.add(random.nextInt(101));// generate random number and add to list with 0-100 limit
        }
        return nums;
    }

}
