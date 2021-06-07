package day20_string_manipulation;

public class StringIsEmpty {

    public static void main(String[] args) {

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);
        System.out.println(jobTitle.equals(""));

        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend ");
        } else {
            System.out.println("JobTitle looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("JobTitle is empty");
        } else {
            System.out.println("JobTitle is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if ("".equals(jobTitle)) {
            System.out.println("Jos title is empty");
        } else {
            System.out.println("Job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        // if veggie is not empty, print we have carrot
        if (!veggie.isEmpty()) {
            System.out.println("We have " + veggie);
        }

        String word2;
        //System.out.println(word2.isEmpty()); ERROR. Not initialized


    }

}
