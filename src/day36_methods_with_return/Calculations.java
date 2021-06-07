package day36_methods_with_return;

public class Calculations {

    public static void main(String[] args) {

        System.out.println("2.0 + 3.0 = " + Calculator.add(2.0, 3.0));
        System.out.println("100 - 40 = " + Calculator.minus(100, 40));
        System.out.println("55 / 4 = " + Calculator.divide(55, 4));

        double d1 = 200;
        double d2 = 100;
        double res = Calculator.minus(d1, d2);
        System.out.println("result = " + res);

    }

}
