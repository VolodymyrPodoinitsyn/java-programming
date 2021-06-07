package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
       String city = "LA";

       if (city.equals("LA") || city.equals("SF")) {
           System.out.println("Willing to relocate to " + city);
       }else {
           System.out.println("not considering - " + city);
       }

       String teacher = "Saim";
       if (teacher.equals("Saim") || teacher.equals("Murodil")) {
           System.out.println("It is a java class with " + teacher);
       }else {
           System.out.println("Soft skill class with " + teacher);
       }

       if (teacher.equals("Saim") || teacher.equals("Murodil")) {
           System.out.println("It is a java class");
       }else if (teacher.equals("Nadir")) {
           System.out.println("Soft skill class with " + teacher);
       } else {
           System.out.println("Some class with " +teacher);
       }

       String company = "Google";
       double salary = 85_000.0;
       if (company.equals("Google") || salary >= 100_000.0) {
           System.out.println("Accepting ofer from " + company);
       }else {
           System.out.println("Rejecting offer from " + company);
       }


    }
}
