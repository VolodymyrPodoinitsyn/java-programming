package day19_class_vs_object_strings;

public class StringStartsEndsWith {

    public static void main(String[] args) {

        String word = "Selenium";
        System.out.println(word.startsWith("S"));
        System.out.println(word.startsWith("Selenium"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.endsWith("um"));
        System.out.println(word.endsWith("S"));

        String firstName = "Fr. Nadir";

        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married women");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single women");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("I dont know wats going on");
        }

        String url = "https://www.google.com";

        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }




    }

}
