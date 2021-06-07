package day22_string_manipulation;

public class ReversingCharAt {

    public static void main(String[] args) {

        String word = "Anna";
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);

        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

        String reversed = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome word ");
        } else {
            System.out.println("Not palindrome word");
        }



    }


}
