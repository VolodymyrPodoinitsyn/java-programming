package day28_loops;

import java.util.*;

public class RandomPassword {

    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for (int i = 0; i <= 8; i++) {
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
            password += source.charAt(index);
            //System.out.println(random.nextInt(source.length()));
        }

        System.out.println("\nYour password = " + password);


    }

}
