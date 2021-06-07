package day22_string_manipulation;

public class IndexOfExample {

    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOf = technologies.indexOf("jav");
        System.out.println("java is st index " + indexOf);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + indexOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOsSql = technologies.indexOf("sql");
        System.out.println("sql is at index " + indexOsSql);

        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > 1) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

    }

}
