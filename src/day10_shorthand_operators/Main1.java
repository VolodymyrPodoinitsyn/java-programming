package day10_shorthand_operators;

public class Main1 {
    public static void main(String[] args) {
//        long a = 30L;
//        long b = (chort)a;
//        System.out.println(b);

        float a = 100.987_6543f;
        short b =(byte)a;
        byte c = (byte) b;
        System.out.println(c);
//        long a = 3_000L;
//        double b = (float) a;
        System.out.println("5 + 2 = " + (3 + 4));
    }
}
