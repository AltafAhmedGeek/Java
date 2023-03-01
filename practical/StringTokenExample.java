//The java.util.StringTokenizer class allows you to break a String into tokens. It is simple way to break a String. It is a legacy class of Java.


import java.util.StringTokenizer;//imports class StringTokenizer

public class StringTokenExample {//class with main()

	public static void main(String[] args) {
		StringTokenizer s1= new StringTokenizer("this is string"," ");//Instantiating class StrinTokenizer and defining the object with a String
		while (s1.hasMoreTokens()) {// looping until s1 has tokens left after each iteration
			System.out.println(s1.nextToken());//printing each token
			
		}

	}

}
