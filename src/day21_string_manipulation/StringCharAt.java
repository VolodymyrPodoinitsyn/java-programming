package day21_string_manipulation;

public class StringCharAt {

    public static void main(String[] args) {

        String word = "java";

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        for (int i = 0; i < word.length(); i++ ) {
            System.out.println(word.charAt(i));
        }

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        char first = company.charAt(0);
        System.out.println(first);
        char second = company.charAt(1);
        System.out.println(second);
        char third = company.charAt(2);
        System.out.println(third);
        char fourth = company.charAt(3);
        System.out.println(fourth);
        char fifth = company.charAt(4);
        System.out.println(fifth);
        char sixth = company.charAt(5);
        System.out.println(sixth);
        char seven = company.charAt(6);
        System.out.println(seven);
        char eight = company.charAt(7);
        System.out.println(eight);

        System.out.println(first+ " * " + second + " * " + third + " * " + fourth + " * " + fifth + " * " + sixth
                           + " * " + seven + " * " + eight);
        
        String withSpaces = first+ " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth
                + " " + seven + " " + eight;

        System.out.println("withSpaces = " + withSpaces);

        String word1 = "mom";
        char first1 = word1.charAt(0);
        char last = word1.charAt(2);
        if (first1 == last) {
            System.out.println("first and last letters math");
        } else {
            System.out.println("first and last letters mismatch");
        }

        String anotherWord = "aziza";
        char firstLatter = anotherWord.charAt(0);
        char lastLatter = anotherWord.charAt(anotherWord.length() - 1);
        System.out.println(firstLatter);
        System.out.println(lastLatter);

        if (firstLatter == lastLatter) {
            System.out.println(anotherWord + "- first and last match");
        } else {
            System.out.println(anotherWord + "- first and last mismatch");
        }





    }

}
