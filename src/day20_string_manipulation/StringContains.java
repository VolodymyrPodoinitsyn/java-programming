package day20_string_manipulation;

public class StringContains {

    public static void main(String[] args) {

        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("j"));
        System.out.println(company.contains("One"));

        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        // check if " | " is in etsyTitle
        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName  = "Ahmed";
        // check if firstName contains "a" and "e" at same time.
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println(" both a && e are present");
        } else {
            System.out.println("a || e not present");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i present");
        } else {
            System.out.println("not a or i is not present");
        }

        String email = "poDoinitsynvladimir@gmailcom";
        // check if email contains "@" end ends with".com"

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }

        if (email.toLowerCase().contains("d")) {
            System.out.println("d is present");
        } else {
            System.out.println("d is not present");
        }



    }

}
