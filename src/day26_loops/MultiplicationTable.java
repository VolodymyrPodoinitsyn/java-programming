package day26_loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        int number = 9;
        if (number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return; // exit main method/stop the program
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
//        System.out.println(number + " x " + 1 + " = " + (2 * 1));
//        System.out.println(number + " x " + 2 + " = " + (2 * 2));
//        System.out.println(number + " x " + 3 + " = " + (2 * 3));
//        System.out.println(number + " x " + 4 + " = " + (2 * 4));
//        System.out.println(number + " x " + 5 + " = " + (2 * 5));
//        System.out.println(number + " x " + 6 + " = " + (2 * 6));

    }

}
