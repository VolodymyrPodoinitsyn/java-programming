package OfficeHours.Practice_03_29_2021_Important;
/*
   [Move first word]
   Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex;
   input: Java is a fun language
   output: is a fun language Java
   Hint: Use indexOf and substring

 */
public class MoveFirstWord {

    public static void main(String[] args) {

        String str = "  Java is a fun language";
        str = str.trim();
        int space = str.indexOf(" ");
        String firstWord = str.substring(0, space);
        System.out.println(firstWord);
        System.out.println(str.substring(space + 1) + " " + firstWord);



    }

}
