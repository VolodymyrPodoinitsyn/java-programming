package day24_loops;

public class WhileLoopRevers {

    public static void main(String[] args) {

        int count = 5;
        while (count >= 0) {
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Finished the count");


        int unreadSMS = 10;
        System.out.println("I have total - " + unreadSMS + " \uD83D\uDC8C unread sms");
        while (unreadSMS > 0) {
            System.out.println("Reading SMS: " + unreadSMS);
            --unreadSMS;
        }
        System.out.println("No more unread SMS messages ");

    }

}
