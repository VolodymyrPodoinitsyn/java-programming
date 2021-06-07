package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {

    public static void main(String[] args) {

        String todayClass = "java";

        if (todayClass.equals("java"))
            System.out.println("java is fun");
        else
            System.out.println("it is not java. It is " + todayClass);

    }

}
