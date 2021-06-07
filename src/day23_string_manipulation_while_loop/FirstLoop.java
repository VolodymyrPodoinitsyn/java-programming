package day23_string_manipulation_while_loop;

public class FirstLoop {

    public static void main(String[] args) {

        int i = 1;

        if (i <= 5) {
            //System.out.println(i);
        }

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <= 3){
            System.out.println("apples -> " + apples);
            apples++;

        }
        System.out.println("apples = " + apples);

        int a = 0;
        while (a <= 6) {
            a += 2;

        }
        System.out.println(a);

        int j = 7;
        for (int k = 0; k < j-1; k+=2) {
            System.out.println(k + " ");
        }

        int b = 0;
        do {
            b++;
            System.out.println(b + " ");
        } while (b <= 4);
        int z = 5;

        for (int k = 5; k > 0; k--) {
            z += k;

        }
        System.out.println(z);
    }

}
