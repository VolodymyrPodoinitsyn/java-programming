package day39_wrapper_classes;

public class WrapperClassMethods {

    public static void main(String[] args) {

        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println(Integer.reverse(123));
        System.out.println("Min Int: " + Integer.MIN_VALUE);
        System.out.println("Max Int: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4, 23.9));
        System.out.println("Min Double: " + Double.MIN_VALUE);
        System.out.println("Max Double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1));
        System.out.println(Double.compare(5, 5));
        System.out.println(Double.compare(5, 45));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isAlphabetic('5'));
        System.out.println(Character.isLetter('r'));

        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("It is uppercase");
        }

        String word = "Java iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }

        }


    }

}
