package day36_methods_with_return;

import java.util.*;

public class Info {

    public static void main(String[] args) {

        fullName();
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(getAge());
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

    }

    public static String fullName() {
        System.out.println("inside fullName method");
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        int getAge = 35;
        return 35;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
