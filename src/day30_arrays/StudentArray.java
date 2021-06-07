package day30_arrays;

public class StudentArray {

    public static void main(String[] args) {

        //String[] student = {"id", "firstName", "lastName", "batchNum", "phoneNum" };

        String[]student1 = new String[5];
        student1[0] = "AD123";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        String[] student2 = {"2555", "Vlad", "Podoinitsyn", "B22", "630-290-7489"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 phone num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("Pass: data array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("Pass: data array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }

        System.out.println(student1[1].toUpperCase() +" " + student1[2].toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));

    }

}
