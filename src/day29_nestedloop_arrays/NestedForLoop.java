package day29_nestedloop_arrays;

public class NestedForLoop {

    public static void main(String[] args) {

//        for (int min = 1; min <= 5; min++) {
//            System.out.println("\nmin = " + min);
//            for (int sec = 1; sec <= 60; sec++) {
//                System.out.print(sec + " ");
//            }
//        }

        for (int minutes = 0; minutes <= 4; minutes++) {
            for (int seconds = 0; seconds <= 59; seconds++) {
                System.out.println(minutes + ":" + seconds);
            }
        }
        
    }
    
}
