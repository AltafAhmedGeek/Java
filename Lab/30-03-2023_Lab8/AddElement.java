package Lab8;

import java.util.*;

public class AddElement {
    public static void main(String[] args) {
        // create a LinkedList of numbers
        LinkedList<Integer> numbers = new LinkedList<>();

        // add some numbers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);

        // print the original list
        System.out.println("Original ArrayList: " + numbers);
        
        // add an element at the middle of the list
        int midIndex = numbers.size() / 2;
        int newElement = 3;
        numbers.add(midIndex, newElement);

        // print the updated list
        System.out.println("Updated LinkedList: " + numbers);
    }
}

