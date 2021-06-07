package day19_class_vs_object_strings;


public class StringCaseConversion {

    public static void main(String[] args) {

        String word = "CyberTek";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());

        word.toLowerCase();
        System.out.println("word = " + word);

        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLCase);
        // change word to all lowercase letters
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        
        // change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);



    }

}
