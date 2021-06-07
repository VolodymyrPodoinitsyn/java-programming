package day35_methods_with_param;

public class MethodWithInputs {

    public static void main(String[] args) {

       displayValue(5);
       displayValue(15);
       int count = 55;
       displayValue(count);
       greetByName("Vlad");

    }

    public static void displayValue(int num) {

        System.out.println("Value is = " + num);
    }

    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", how are you today");
    }

}
