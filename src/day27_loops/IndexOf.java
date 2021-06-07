package day27_loops;

public class IndexOf {

    public static void main(String[] args) {

        String word = "github";
        char letter = 't';
        int index = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                index = i;
                System.out.println(letter + " is found at index " + index);
                break; // exit for loop

            }
        }
        if (index == -1) {
            System.out.println(letter + " is not present");


        }

        String str = "Hello World";
        str.trim();
        int  z = str.indexOf(" ");
        System.out.println(z);

        String s1 = "wooden spoon";
        String s2 = s1.substring(s1.indexOf("s"));
        System.out.println(s2);

    }

}
