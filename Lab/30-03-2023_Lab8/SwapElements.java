package Lab8;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        // create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // add some fruit names to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");

        // print the original list
        System.out.println("Original ArrayList: " + fruits);

        // swap the 2nd and 3rd elements in the list
        Collections.swap(fruits, 1, 2);

        // print the updated list
        System.out.println("Updated ArrayList: " + fruits);
    }
}

