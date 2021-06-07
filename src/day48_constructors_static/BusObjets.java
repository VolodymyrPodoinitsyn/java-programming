package day48_constructors_static;

import java.sql.Driver;

public class BuObjets {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        bus.engine = new Engine(10);

        System.out.println(bus.toString());
    }

}
