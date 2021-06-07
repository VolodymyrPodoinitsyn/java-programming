package day09_scanner_practice;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed limit: ");
        int speedLimit = scan.nextInt();
        System.out.println("Enter current speed: ");
        int currentSpeed = scan.nextInt();
        int mphOverTheSpeedLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + mphOverTheSpeedLimit + " mph over the limit. Slow down!");
    }
}
