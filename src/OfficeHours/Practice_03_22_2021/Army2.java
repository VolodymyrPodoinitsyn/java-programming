package OfficeHours.Practice_03_22_2021;

public class Army2 {

    public static void main(String[] args) {
//      Scanner scan
        String citizenship = "USa"; // next()
        boolean resident = true; // nextBoolean()

        if (citizenship.equalsIgnoreCase("USA") || resident) {
            int age = 25; // nextInt()
            if (age >= 18 && age <= 35) {
                boolean hasDiploma = true; // nextBoolean()
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
