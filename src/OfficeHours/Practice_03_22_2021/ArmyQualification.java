package OfficeHours.Practice_03_22_2021;

public class ArmyQualification {

    public static void main(String[] args) {

        /*
            [Qualification For Army]
            Given information: Citizenship(String), resident(boolean), and has high school
            - The person must be a Citizen of USA or a resident
            -> If not print: You must be a U.S. citizen or a resident
            - The ir age must be between 18 and 35
            -> if not print: Your age must be between 18 and 35 years old
            - They must have a high school diploma
            -> If not print: You must have a high school diploma
            > If all the criteria is met print: You are qualified for the US Army
         */
        String citizenship = "USa";
        boolean resident = true;
        int age = 25;
        boolean hasDiploma = true;

        if (citizenship.equalsIgnoreCase("USA") || resident) {

            if (age >= 18 && age <= 35) {

                if (hasDiploma) {
                    System.out.println("You are qualified for the US Army");
                } else {
                    System.out.println("You must have a high school diploma");
                }

            } else {
                System.out.println("Your age must be between 18 and 35 years old");
            }

        } else {
            System.out.println("You must be a US citizen or a resident");
        }

    }

}
