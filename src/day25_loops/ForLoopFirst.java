package day25_loops;

public class ForLoopFirst {

    public static void main(String[] args) {
        /**

        for (;;) {
            System.out.println("Java is fun!");
        }
         */

        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello world " + i);

        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int stars = 1; stars <= 15;stars++) {
            System.out.print("\uD83C\uDF1F ");
        }
        System.out.println("");

        String myStars = "";
        for (int i = 1; i <= 5 ; i++) {
            myStars += "* ";
        }
        System.out.println("my stars = " + myStars.trim());

    }

}
