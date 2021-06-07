package day19_class_vs_object_strings;

public class StringComparison {

    public static void main(String[] args) {

        String city = "Seattle";

        if (city.equals("Seattle")) {
            System.out.println("My city is " + city);
        }
        if (city.equalsIgnoreCase("SEATTle")) {
            System.out.println("city = " + city);
        }
        
    }

}
