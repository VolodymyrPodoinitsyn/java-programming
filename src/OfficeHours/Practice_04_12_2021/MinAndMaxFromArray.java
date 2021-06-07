package OfficeHours.Practice_04_12_2021;

public class MinAndMaxFromArray {

    public static void main(String[] args) {

        int[] arr = {40, -1, 5, 3, 10, 4, 30};
        int min = arr[0];
        int max = arr[0];

        for(int each : arr) {

            if(each < min) {
                min = each;
            }

            if (each > max) {
                max = each;
            }
        }
        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);


//        System.out.println("-----------FOR LOOP----------");
//
//        int[] arr = {40, -1, 5, 3, 10, 4, 30};
//        int min = arr[0];
//        int max = arr[0];
//
//        for(int i = 0; i < arr.length; i++) {
//
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("MIN : " + min);
//        System.out.println("MAX : " + max);
    }

}