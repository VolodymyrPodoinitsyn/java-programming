package day23_string_manipulation_while_loop;

public class SMSMessage {

    public static void main(String[] args) {

        String message = "Sender: [Vlad] From Number<(630) 290 7489> Message:{Hello, lets code some java}";
        String sender = message.substring(message.indexOf("[") + 1, message.indexOf("]") );
        String phoneNumber = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        String text = message.substring(message.indexOf("{") + 1, message.indexOf("}"));

        System.out.println("Sender: " + sender + " From number " + phoneNumber + " Message: " + text);

    }

}
