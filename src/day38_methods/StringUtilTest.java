package day38_methods;

public class StringUtilTest {

    public static void main(String[] args) {

        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("civic = " + StringUtils.isPalindrome("civic"));
        System.out.println("kayak = " + StringUtils.isPalindrome("Kayak"));
        
        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("revWord = " + revWord);

    }

}
