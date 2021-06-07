package day31_arrays;

public class CharArray {

    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};

        for (char chars : letters) {
            System.out.print(chars + ", ");
        }

        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

        String fruitStr = "";
        for (String items : fruits) {
            System.out.print(items + "-");
            fruitStr += items + "-";
        }
        System.out.println("\nfruitStr = " + fruitStr);

        String[] languages = {"java", "python", "c++", "ruby", "javascript"};

        System.out.println(String.join("|", languages));
        System.out.println(String.join("##", languages));
        String joinLanguages = String.join(" <> ", languages);
        System.out.println("joinLanguages = " + joinLanguages);



    }

}
