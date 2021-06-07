package day25_loops;

import java.util.*;

public class StartEnd {

    public static void main(String[] args) {
        System.out.println("Enter start and and");
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        for (int i = start; i <= end; i ++) {
            System.out.print(i);
        }
        if (start > end) {
            System.out.println("reverse numbering is not supported");
        }


    }

}
