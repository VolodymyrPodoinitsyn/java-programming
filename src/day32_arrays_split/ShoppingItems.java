package day32_arrays_split;

public class ShoppingItems {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("----- FIND THE INDEX OF 'Gloves' in items array-----");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index - " + i);
                //System.out.println(i + " - " + items[i]);
                break;
            }
        }

        System.out.println("-----Set boolean to true if first 'iPad' is found-----");
        boolean iPadExist = false;

        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPadExist = true;
                break;
            }

        }

        System.out.println("iPadExist = " + iPadExist);

        if (iPadExist) {
            System.out.println("We bought the Ipad");
        } else {
            System.out.println("We forgot the iPad");
        }

        System.out.println("-----Print a report of each shopping item-----");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - \t$" + prices[i] + " - \tID #" + itemIDs[i]);
        }

        System.out.println("------Look for 'Jacket' in items and print all details-----");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + " $" + prices[i] + " ID#" + itemIDs[i]);
                break;
            }


        }

    }

}
