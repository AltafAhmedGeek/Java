package collection_framework;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // create a new Stack
        Stack<Integer> stack = new Stack<Integer>();
        
        // push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        // print the stack
        System.out.println("Stack: " + stack);
        
        // get the top element of the stack
        int top = stack.peek();
        System.out.println("Top element: " + top);
        
        // remove the top element of the stack
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        
        // print the stack again
        System.out.println("Stack after popping: " + stack);
        
        // search for an element in the stack
        int index = stack.search(20);
        System.out.println("Index of 20 in stack: " + index);
        
        // check if the stack is empty
        boolean empty = stack.empty();
        System.out.println("Is stack empty? " + empty);
        
//--------------------------------methods same as stack----------------------------------
		

		// retrieve element at specific element
		System.out.println("element at index 2: "+stack.get(2));


		
		// remove element from specific index
		stack.remove(1);
		System.out.println("after removing element at index 1: "+stack);


		// size of stack
		System.out.println("size of stack : "+stack.size());


		// checking if stack contains a specific element
		System.out.println("does stack contains 12? : "+stack.contains(12));


		// getting index of specific element
		System.out.println("element ar index 10: "+stack.indexOf(10));


		// iterating using for loop
		System.out.print("traversing through a stack: ");
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}

		System.out.println();


		// deleting all elements
		stack.clear();
		System.out.println("after clear(): "+stack);


		// checking if stack is empty
		System.out.println("is stack empty ? : "+stack.isEmpty());
    }
}
