package collection_framework;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {

		// Q1. WAP to create a new ArrayList, create an object and add elements to it
		ArrayList<String> names = new ArrayList<>();
		names.add("altaf");
		names.add("raj");
		names.add("jeevan");
		System.out.println("Q1. " + names);

		// 2. Write a Java program to iterate through all elements in a array list
		Iterator<String> it = names.iterator();
		System.out.print("Q2. ");
		while (it.hasNext()) {
			String element = it.next();
			System.out.print(element + " ");
		}

		// 3. WAP to insert an element into the array list at the first position.
		names.add(0, "karan");
		System.out.println("\nQ3. " + names);

		// 4. WAP to retrieve an index of specific element from a given array list.
		System.out.println("Q4. " + names.indexOf("jeevan"));

		// 5. Write a Java program to remove the third element from a array list.
		names.remove(2);
		System.out.println("Q5. " + names);

		// 6. Write a Java program to search an element in a array list.
		Scanner sc = new Scanner(System.in);
		System.out.print("Q6. Enter Any name to search: ");
		String search = sc.next();
		if (names.contains(search)) {
			System.out.println("\t~" + search + " Name Found In ArrayList At Index " + names.indexOf(search));
		} else {
			System.out.println("\t ~Sorry...! the Name " + search + "  Not Found In this ArrayList");
		}
		
		// 7.Write a Java program to copy one array list into another.
        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(names);
        System.out.println("Q7." + names2);
        
     // 8. Write a Java program to compare two array lists.
        if (names.equals(names2)) {
            System.out.println("Q8. Two ArrayLists Are Equal");
        } else {
            System.out.println("Q8. Two ArrayLists Are Not Equal");
        }
	}

}
