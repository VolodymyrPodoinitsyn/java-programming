package day25_loops;

public class PrintEvenOrOddNumbers {

    public static void main(String[] args) {

        System.out.println("Even numbers 0-100: ");

        for (int i = 1; i <=100; i++) {
            if (i % 2 ==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("Odd numbers 0-100: ");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 !=0) {
                System.out.print(i + " ");
            }
        }

    }

}
