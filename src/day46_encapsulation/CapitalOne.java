package day46_encapsulation;

public class CapitalOne {

    public static void main(String[] args) {

        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(315102);
        acc.setBalance(250.50);
        acc.setAccountHolder("Volodymyr Pupkin");
        acc.setType("360 Checking");
        System.out.println(acc);
    }

}
