package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        // != -> is not equal comparison operator
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;

        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        }else {
            System.out.println("Can sit normal seat. age = " +age);
        }

        String env = "QA";
        if (!env.equals("QA")) {

        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abs321")) {
            System.out.println("Incorrect Password");
        }
        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect Password");
        }

        if (inputPassword.equals("abc123")) {
            
        }
    }
}
