package OfficeHours.Practice_03_16_2021;

public class ExamplesIf {

    public static void main(String[] args) {

        int a = 10;
         // a = 9 ->8

        int b = a-- * 2 - --a % 2 + a;
        //      10  * 2 - 8 % 2 + 8;
        //       20 - 8 % 2 + 8
        //        20 - 0 + 8
        //             28
        System.out.println(b);

        if (10 % 2 == 0) {
            System.out.println("Even"); //10 % 2
        } else {
            System.out.println("Odd"); // 11 % 2
        }



    }

}
