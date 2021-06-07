package day46_encapsulation;

public class Dealership {

    public static void main(String[] args) {

        Car car1 = new Car();
        //ERROR below, model and year are PRIVET and cannot be accessed
//        car1.model = "Nissan Altima";
//        car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(45230);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Giulia");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);
        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getModel());

        System.out.println(alfaRomeo.toString());


    }

}
