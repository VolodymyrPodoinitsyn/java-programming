package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {

    public static void main(String[] args) {

        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("BMW");
        myCars.add("Tesla");
        myCars.add("Moskvitch");
        myCars.add(0, "Jeep");
        myCars.add(1, "Lada");
        myCars.add(2, "Yugo");

        System.out.println(myCars);

        String allCarsIn1St = myCars.toString();
        System.out.println("allCarsIn1St = " + allCarsIn1St);

        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars.toString());

        myCars.set(4, "Honda");
        System.out.println("after set = " + myCars.toString());

        System.out.println("index of Ford = " + myCars.indexOf("Ford"));
        int moskvichIndex = myCars.indexOf("Moskvitch");
        System.out.println("moskvichIndex = " + moskvichIndex);

        myCars.set(moskvichIndex, "Jiguli");
        System.out.println(myCars);

        myCars.set(myCars.indexOf("Ford"), "WV");

        if (myCars.contains("Lada")) {
            myCars.set(myCars.indexOf("Lada"), "Bugatti");

        } else {
            System.out.println("Lada is not founded");
        }

        System.out.println("After set Bugatti = " + myCars.toString());

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")) {
                myCars.set(i,"Prius");
            } else if (myCars.get(i).equals("Bugatti")) {
                myCars.set(i,"Lexus");
            } else if (myCars.get(i).equals("Yugo")) {
                myCars.set(i,"Audi");
            }
        }

        System.out.println("After set = " + myCars.toString());





    }

}
