package OfficeHours.Practice_03_02_2021;

public class PersonInfo {
    public static void main(String[] args) {
        //Variable
        String name, fullBirthDay, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumbers;
        int numberOfSeasons, year;
        double birthDay;
        // Assigment of data

        name = "Volodymyr";
        age = 38;
        gender = 'M';
        student = true;
        numberOfSiblings = 5;
        favoriteNumbers = 3L;
        numberOfSeasons = 4;
        birthDay = 3.2;
        year = 2021;
        fullBirthDay = "" + birthDay + "." + year;
        favoriteQuote = "Have a good mindset";

        System.out.println(fullBirthDay);

    }
}
