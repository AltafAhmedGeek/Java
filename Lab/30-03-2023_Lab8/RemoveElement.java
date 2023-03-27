package Lab8;

import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        // create an ArrayList of numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // add some numbers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // print the original list
        System.out.println("Original ArrayList: " + numbers);

        // remove the 4th element from the list
        numbers.remove(3);

        // print the updated list
        System.out.println("Updated ArrayList: " + numbers);
    }
}
