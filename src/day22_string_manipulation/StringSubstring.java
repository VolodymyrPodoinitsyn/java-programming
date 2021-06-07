package day22_string_manipulation;

public class StringSubstring {

    public static void main(String[] args) {

        String word = "java is fun";
        /**
         *  1) word.substring(startIndex, endIndex)
         *  index is not included
         */
        System.out.println(word.substring(0,4));
        System.out.println(word.substring(0,7));
        System.out.println(word.substring(5,7));
        System.out.println(word.substring(8,11));

        /**
         * 2) substring (startIndex) - it will read from start until end
         */

        System.out.println(word.substring(8));
        System.out.println(word.substring(5));

    }

}
