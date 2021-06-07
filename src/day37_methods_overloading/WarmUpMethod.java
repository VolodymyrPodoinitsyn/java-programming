package day37_methods_overloading;

public class WarmUpMethod {

    public static void main(String[] args) {

        loginVoid("cybertekStudent", "abc123");// positive test
        loginVoid("cybertek", "answer");// negative test
        System.out.println(login("cybertekStudent", "abc123"));



    }

    public static void loginVoid(String userNaim, String password) {

        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userNaim.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Login successful, welcome CybertekStudent!");
        } else {
            System.out.println("Incorrect userName or password");
        }

    }

    public static boolean login(String userNaim, String password){

        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userNaim.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            return true;
        } else {
            return false;
        }
    }

}
