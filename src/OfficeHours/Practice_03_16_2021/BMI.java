package OfficeHours.Practice_03_16_2021;
/*
BMI: Program will ask user to enter their (kilograms) and their height (meters). Calculate the
-> BMI formula: BMI = mass / height * 2
-> Values:
Less than 18.5 - Underweight
From 18.5 to 25 - Normal weight
Fro 25 to 30 - Overweight
More than or equal to 30 - Obese
 */
public class BMI {

    public static void main(String[] args) {

        double mass = 62.4;
        double height = 1.65;
        double BMI = mass / (height * height);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("Normal weight");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        int num = -5;
        System.out.println(num++ + ",");
        System.out.println(num = 0);
        System.out.println("," + --num);

        short s = 13 - 9 / 3 *10;
        s += - 10;
        System.out.println(s);

        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9 - 10 + 1);
        System.out.println(two);

        int a = 10;
        a = --a + a++ + a-- + a++;
        System.out.println(a);
        int x = 0;
        x -= 50;
        System.out.println(x);
        boolean b = 119 % 5 == 0;
        System.out.println(b);






    }

}
