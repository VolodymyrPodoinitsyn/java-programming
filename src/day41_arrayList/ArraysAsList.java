package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);

        System.out.println("nums = " + nums);
        
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));

        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.contains("monster") || drink.contains("red bull") || drink.contains("mdew")) {
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if (drink.contains("coke") || drink.contains("pepsi") || drink.contains("celsius")) {
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if (drink.contains("coffee") || drink.contains("tea") || drink.contains("kambucha")) {
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);
            }
        }


        for(String drink : drinksWithCaffeine) {
            switch(drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink));
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("--------------");
            System.out.println("each = " + each);
            System.out.println("--------------");
        });







    }

}
