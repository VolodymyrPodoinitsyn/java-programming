package day36_methods_with_return;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(add(3.0, 2.0));
        System.out.println(minus(3.0, 2.0));
        System.out.println(multiply(3.0, 2.0));
        System.out.println(divide(6.0, 2.0));



    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

}
