package OfficeHours.Practice_03_29_2021_Important;

public class Sandwich {

    public static void main(String[] args) {

        /*
        A sandwich is two pieces of bread with something in between. print the string that is
        between the first and last appearance of "bread" in the given string, or return string
        "nothing" if there are noy two pieces of bread

        input: breadjambread
        output: jam

        input: xxbreadapple
        output: nothing
         */

        String str = "breadjambread";
        boolean isValid = false;
        String result = "";

        if (str.contains("bread")) {

            int firstBread = str.indexOf("bread");

            if (str.substring(firstBread + 5).contains("bread")) { // if second have another bread

                int secondBread = str.lastIndexOf("bread");
                result = str.substring(firstBread + 5, secondBread);
                isValid = true;

            }
        }

        if (!isValid || result.isEmpty()) {
            System.out.println("nothing");
        } else {
            System.out.println(result);
        }



    }

}
