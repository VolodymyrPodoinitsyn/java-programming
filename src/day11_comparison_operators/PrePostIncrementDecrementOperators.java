package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //POST-INCREMENT
        int num3 = 8;
        int num4 = num3;
        num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        
        int apple = 5;
        int basket = ++apple;
        System.out.println("apple = " + apple);
        System.out.println("basket = " + basket);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
