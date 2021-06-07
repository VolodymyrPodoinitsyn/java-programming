package day27_loops;

public class ReadStringPortion {

    public static void main(String[] args) {

        String list = "cat,car,black cat,red car,java,selenium";

        for (int i = 0; i < list.length() - 2; i++) {
            System.out.println(list.substring(i, i + 3));
            if (list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals("car"))
            {
                System.out.println(list.substring(i, i + 3) + " - cat or car found");
            }
        }

//        int i = 0;
//        System.out.println(list.substring(i, i + 3));
//        i++;
//        System.out.println(list.substring(i, i + 3));
//        i++;
//        System.out.println(list.substring((i, i + 3));
//        i++;
//        System.out.println(list.substring((i, i + 3);
//        i++;
//        System.out.println(list.substring((i, i + 3);



    }

}
