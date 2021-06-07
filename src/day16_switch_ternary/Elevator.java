package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 6;
        if (floorNumber == 1) {
            System.out.println("Floor " + floorNumber + " selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floorNumber == 2) {
            System.out.println("Floor " + floorNumber + " selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNumber == 3) {
            System.out.println("Floor " + floorNumber + " selected. Companies: Lyft, BofA, Stake House");
        }else {
            System.out.println("Invalit floor - "+ floorNumber);
        }

        System.out.println("==========SWITCH STATEMENT VERSION==========");

        floorNumber = 1;

        switch(floorNumber) {
            case 1:
                System.out.println("Floor " + floorNumber + " selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor " + floorNumber + " selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor " + floorNumber + " selected. Companies: Lyft, BofA, Stake House");
                break;
            default:
                System.out.println("Invalit floor - "+ floorNumber);
        }
    }
}
