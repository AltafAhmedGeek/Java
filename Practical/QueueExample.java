package collection_framework;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		
//		creating queue with LinkedList
		Queue<String> queue= new LinkedList<>();
		
//		inserts and return true if  element added successfully
		System.out.println("Element added? : "+queue.offer("altaf"));
		System.out.println("Element added? : "+queue.offer("ahmed"));
		System.out.println("Element added? : "+queue.offer("apple"));
		System.out.println("current queue: "+queue);
		
//		remove front element and return true if removed successfully
		System.out.println("removed element : "+queue.poll());
		System.out.println("current queue: "+queue);

//		retrieve front element without removing it
		System.out.println("front element : "+queue.peek());
		
		
//--------------------------------methods same as queue----------------------------------
		
				// remove element from front 
				queue.remove();
				System.out.println("after removing element from front: "+queue);


				// size of queue
				System.out.println("size of queue : "+queue.size());


				// checking if queue contains a specific element
				System.out.println("does queue contains 'apple'? : "+queue.contains("apple"));

				// deleting all elements
				queue.clear();
				System.out.println("after clear(): "+queue);


				// checking if queue is empty
				System.out.println("is queue empty ? : "+queue.isEmpty());

				
//--------------some line breaks-----------------------------------
				System.out.println();
				System.out.println();
				System.out.println();
			
				
				
				
//				creating queue with ArrayDeque
				Queue<String> queue1= new ArrayDeque<>();
				
//				inserts and return true if  element added successfully
				System.out.println("Element added? : "+queue1.offer("altaf"));
				System.out.println("Element added? : "+queue1.offer("ahmed"));
				System.out.println("Element added? : "+queue1.offer("apple"));
				System.out.println("current queue1: "+queue1);
				
//				remove front element and return true if removed successfully
				System.out.println("removed element : "+queue1.poll());
				System.out.println("current queue1: "+queue1);

//				retrieve front element without removing it
				System.out.println("front element : "+queue1.peek());
				
				
//--------------------------------methods same as queue1----------------------------------
				
						// remove element from front 
						queue1.remove();
						System.out.println("after removing element from front: "+queue1);


						// size of queue1
						System.out.println("size of queue1 : "+queue1.size());


						// checking if queue1 contains a specific element
						System.out.println("does queue1 contains 'apple'? : "+queue1.contains("apple"));

						// deleting all elements
						queue1.clear();
						System.out.println("after clear(): "+queue1);


						// checking if queue1 is empty
						System.out.println("is queue1 empty ? : "+queue1.isEmpty());

	}

}
