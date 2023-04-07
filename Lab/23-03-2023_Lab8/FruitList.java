package Lab8;

import java.util.*;

public class FruitList {
    public static void main(String[] args) {
        // create an ArrayList of fruits
        ArrayList<String> fruits = new ArrayList<>();

        // add some fruit names to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");

        // traverse the list using a for loop
        System.out.println("Traversing the list using a for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // traverse the list using a for-each loop
        System.out.println("Traversing the list using a for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // traverse the list using an iterator
        System.out.println("Traversing the list using an iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
