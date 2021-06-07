package OfficeHours.Practice_03_15_2021;

public class GradeRetake {

    public static void main(String[] args) {

        int baseGrade = 90;
        int numberOfAttempts = 3;
        int retakePenalty = 0;

        if (numberOfAttempts == 1) {
            retakePenalty =(int)(baseGrade * 0.10);
        } else if (numberOfAttempts == 2) {
            retakePenalty =(int)(baseGrade * 0.20);
        } else if (numberOfAttempts == 3) {
            retakePenalty =(int)(baseGrade * 0.35);
        } else {
            System.out.println("Invalid attempt number");
        }
        System.out.println("Grade after retake attempt " + numberOfAttempts + " was: "
                          + (baseGrade - retakePenalty) + "%");
    }
}
