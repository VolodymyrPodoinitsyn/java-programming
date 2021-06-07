package day37_methods_overloading;

public class VarArgs {

    public static void main(String[] args) {

        addNumbers(10,5);
        addNumbers(10,12,13,14,15,16,17,18,19,20);



    }

    public static void addNumbers(int... nums) {

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }

}
