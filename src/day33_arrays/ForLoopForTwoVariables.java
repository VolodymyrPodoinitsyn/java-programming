package day33_arrays;

public class ForLoopForTwoVariables {

    public static void main(String[] args) {

        for (int i =1, j =1; i <=4; i++,j++) {
            System.out.println("i = " + i + ", J = " + j);
        }
        System.out.println("===============");

        for (int i = 1, j = 5; j >=0; i++, j--) {
            System.out.println("i = " + i + ", J = " + j);
        }

        for (int i =1, j =1, a = 1; i <=4; i++, j++, a++) {
            System.out.println("i = " + i + ", j = " + j + ", a = " + a);
        }



    }

}
