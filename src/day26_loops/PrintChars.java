package day26_loops;

public class PrintChars {

    public static void main(String[] args) {

        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
        System.out.println("");
        System.out.println(word.length());

    }

}
