package day18_conditions_practice_strings_intro;

public class CarLeasingTest {

    public static void main(String[] args) {

        String make = "Marcedes";
        String model = "E";
        double lesePrice = 0.0;

//        if (make.equals("Mercedes") && model.equals("E")) {
//            lesePrice = 500.0;
//        } else if (make.equals("Mercedes") && model.equals("A")) {
//            lesePrice = 400.0;
//        }
//        System.out.println("model = " + model);
//        System.out.println("make = " + make);
//        System.out.println("lesePrice = " + lesePrice);

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                lesePrice = 500.0;
            } else if (model.equals("A")) {
                lesePrice = 400.0;
            }
        } else {
            System.out.println("Invalid make");
            return;
        }
        System.out.println("model = " + model);
        System.out.println("make = " + make);
        System.out.println("lesePrice = " + lesePrice);



    }

}
