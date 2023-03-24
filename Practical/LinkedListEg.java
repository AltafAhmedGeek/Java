package collection_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
//		creating a LinkedList
		LinkedList<String> list= new LinkedList<>();
		
//		adding node at first position
		list.addFirst("sara");
		System.out.println(list);

//		add node at last position
		list.addLast("shaikh");
		System.out.println(list);

//		delete a node at first position
		list.removeFirst();
		System.out.println(list);

//		delete a node at last position
		list.removeLast();
		System.out.println(list);


//--------------------------------methods same as ArrayList----------------------------------
				// add element
				list.add("altaf");
				list.add("karan");
				list.add("ram");
				System.out.println(list);


				// add element at specific index
				list.add(2, "shivam");
				System.out.println(list);


				// retrieve element at specific element
				System.out.println(list.get(2));


				// set element of specific index
				list.set(2, "bumty");
				System.out.println(list);


				// remove element from specific index
				list.remove(1);
				System.out.println(list);


				// size of ArrayList
				System.out.println(list.size());


				// checking if ArrayList contains a specific element
				System.out.println(list.contains("altaf"));


				// getting index of specific element
				System.out.println(list.indexOf("ram"));


				// iterating using for loop
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i) + " ");
				}

				System.out.println();

				// iterating using for each
				for (String s : list) {
					System.out.print(s + " ");
				}

				System.out.println();


				// iterating using Iterator class
				Iterator<String> itr = list.iterator();
				while (itr.hasNext()) {
					System.out.print(itr.next() + " ");
				}
				System.out.println();

				// deleting all elements
				list.clear();
				System.out.println(list);


				// checking if arrayList is empty
				System.out.println(list.isEmpty());
		

	}

}
