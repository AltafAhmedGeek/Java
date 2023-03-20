import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// creating object of Scanner class
		
		System.out.println("Enter First String: ");
		
		String a = sc.next();// taking first input
		
		System.out.println("Enter Second String: ");
		
		String b = sc.next();// taking second input

		// printing sum of length of both strings
		System.out.println("Sum of Length of " + a + " and " + b + " : " + (a.length() + b.length()));

		// checking which comes first in dictionary
		if (a.compareTo(b) < 0)

		{
			System.out.println("Yes " + a + " comes before " + b);

		} else {
			System.out.println("NO " + a + " doest not comes before " + b);
		}

		// printing both string in single line with first letter upperCased
		System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase()
				+ b.substring(1));

	}

}
