/*
 Write a program which creates a String “Welcome to Java World” and performs the following

·         Returns the character at 5th position and display it.

·         Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.

·         Concatenates “- Let us learn” to the above string and display it.

·         Returns the position of the first occurrence of character ‘a’ and display it.

·         Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.

·         Returns string between 4th position and 10th position and display it.

·         Returns the lower case of the string and display it.
 */

package Lab6;//defines a package

public class ProblemStatement1 {//class with main()
	
	private static String str = "Welcome to Java World";//defines and declares a private static string variable

	public static void main(String[] args) {
		
		// calling returnCharacterAt(String str, int position) with arguments str as string and integer 5 as position
		returnCharacterAt(str, 5);// returns 'o' as a character at position 5(i.e index 4)
		
		//calling compareLexilogically(String a, String b) with parameter str as string and "Welcome" string for comparison
		compareLexilogically(str, "Welcome");//returns the position of str compared to "Welcome" 
		
		//calling contactString(String a, String b) with parameter str as string and "- Let us learn" string for concatenation
		contactString(str, "- Let us learn");//returns a concatenated string
		
		//calling replaceChar(String str, char oldChar, char newChar) with parameter str as string, 'a' as old character to be replaced with 'e' as new character 
		replaceChar(str, 'a', 'e');// returns a string with replaced character 'a' by 'e'
		
		//calling stringBetween(String str, int firstPosition, int secondPosition) with parameters str as string, firstPosition and secondPosition as integers 
		stringBetween(str, 4, 10);//returns a substring from positon 4 to 10 (ie. from index 3 to 9 )
		
		//calling returnLowerCase(String a)with parameter str as string 
		returnLowerCase(str);//returns a string in lower case

	}

	private static void returnCharacterAt(String str, int position) {//defines a parameterized static method with a string and integer parameters to return character at specific position
		System.out.println("Character at position " + position + " is " + str.charAt(position - 1));//prints character at passed position
	}

	private static void compareLexilogically(String a, String b) {//defines a parameterized static method with 2 string parameters to be compared
		// checking which comes first in dictionary
		if (a.compareTo(b) < 0)

		{
			System.out.println(a + " comes before " + b);

		} else if (a.compareTo(b) > 0) {
			System.out.println(a + " comes after " + b);
		} else {
			System.out.println(a + " is same as " + b);
		}
	}

	private static void contactString(String a, String b) {//defines a parameterized static method with 2 string parameters to be concatenated
		System.out.println(a + b);//prints the concatenated string
	}

	private static void replaceChar(String str, char oldChar, char newChar) {//defines a parameterized static method with a string and 2 char parameters to replace first by second
		System.out.println("String after replacing " + oldChar + " with " + newChar + " : " + str.replace(oldChar, newChar));//prints new string with replaced character
	}

	private static void stringBetween(String str, int firstPosition, int secondPosition) {//defines a parameterized static method with a string and integer parameters
		System.out.println("String Beetween postion " + firstPosition + " and position " + secondPosition + " is : "+ str.substring(firstPosition - 1, secondPosition));//prints string between passed positions
	}

	private static void returnLowerCase(String a) {//defines a parameterized static method with a string  parameter
		System.out.println("Given String  in Lower Case : " + a.toLowerCase());//returns a lower cased string
	}

}
