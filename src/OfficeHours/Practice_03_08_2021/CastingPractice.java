package OfficeHours.Practice_03_08_2021;

public class CastingPractice {

    public static void main(String[] args) {

        // byte-> short-> int-> long-> float-> double

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (int)d;
        System.out.println(i); // 5
        System.out.println((double) i);

        float f = 3.0F;
        float f2 = (float)3.54; // float = (float)double

        float f3 = 5; // float = int -> 5.0
        float f4 = 5.5F; // float = double

        long l = 22313; // long = int
        long l2 = 21223545658L;

        double million = 1_000_000;
        System.out.println(million);



    }

}
