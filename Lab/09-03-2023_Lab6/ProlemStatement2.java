/*
Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.

1.    Adds the string ”- This is a sample program” to existing string and display it.

2.    Inserts the string “Object” into the existing string at 21st position and display it.

3.    Reverses the entire string and displays it.

4.    Replaces the word “Buffer” with “Builder” and display it. 
*/

package Lab6;// defines a package 

public class ProlemStatement2 {//class with main ()

	private static StringBuffer sb= new StringBuffer("This is StringBuffer");//Declares and defines a static an instances variable of type StringBuffer 
	
	public static void main(String[] args) {//main()

		// calling addString(StringBuffer sb, String s) with arguments sb as StringBuffer and s as String 
		addString(sb, "- This is a sample program");//prints a modified StringBuffer with new String added to it
		
		// calling insertAt(StringBuffer sb,String s,int position) with arguments sb as StringBuffer and s "Object" as String and 21 as integer 
		insertAt(sb, "Object", 21);//prints a modified StringBuffer with "Object" as String inserted at position 21
		
		// calling reverseStringBuffer(StringBuffer sb) with arguments sb as StringBuffer
		reverseStringBuffer(sb);//prints a reversed StringBuffer
		
		// calling replaceString(StringBuffer sb, String oldString, String newString)  with arguments sb as StringBuffer and "Buffer" & "Builder" as Strings
		replaceString(sb, "Buffer", "Builder");//prints a modified StringBuffer with "Buffer" replaced by "Builder"
	}
	
	private static void addString(StringBuffer sb, String s)//defines a parameterized static method with a StringBuffer and a String as parameters to be added at the end
	{
		System.out.println(sb.append(s));//prints a StringBuffer with appended string s to StringBuffer sb
	}
	private static void insertAt(StringBuffer sb,String s,int position)//defines a parameterized static method with a StringBuffer, a String and integer as parameters
	{
		System.out.println(sb.insert(position-1, s));//prints a StringBuffer with a String inserted at specific position
	}
	private static void reverseStringBuffer(StringBuffer sb)//defines a parameterized static method with a StringBuffer as parameter to return reversed StringBuffer
	{
		System.out.println(sb.reverse());//prints a reversed StringBuffer
	}
	private static void replaceString(StringBuffer sb, String oldString, String newString)//defines a parameterized static method with a StringBuffer and 2 strings as parameters to be replaced one by another
	{
		System.out.println(sb.reverse().toString().replaceAll(oldString, newString));//prints a String with replaced one String by another String after reversing the original StringBuffer
	}
	

}
