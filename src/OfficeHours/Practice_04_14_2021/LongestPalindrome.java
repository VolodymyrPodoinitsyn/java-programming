package OfficeHours.Practice_04_14_2021;

public class LongestPalindrome {

    public static void main(String[] args) {

        /*
        [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome string in your array.
        Ex:
        Input: ["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
        Output: racecar
        Input: ["abc", "dna", "kevin", "joe", "lamp"]
        Output: No palindrome
         */

        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String  longestPalindrome = "";

        for (String word : words) {
            boolean isPalindrom = true;
            for (int i = 0; i < word.length()/2; i++) {
                if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                    isPalindrom = false;
                    break;
                }
            }

            if (isPalindrom && word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
            }
        }
        System.out.println(longestPalindrome.isEmpty() ? "No palindrome" : longestPalindrome);

    }

}
