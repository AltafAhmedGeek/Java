
public class StringMethods {//declares a class with main()

	public static void main(String[] args) {//declares main()
		String a="Anudip Foundation";// declares a String Literal
		System.out.println(a.toLowerCase());//returns lowerCased String
		System.out.println(a.toUpperCase());//returns capitalized String
		System.out.println(a.startsWith("s"));//returns a boolean if matches parameter with starting of string
		System.out.println(a.endsWith("ion"));//returns a boolean if matches parameter with ending of string
		System.out.println(a.charAt(3));//returns the character at index 3
		System.out.println(a.length());//returns the length of string
		System.out.println(a.replace('A','K'));//replaces the ('original Char', 'new Char')
		System.out.println(a.replace("Anu", "Bhanu"));//replaces the ("original String", "new String")
		
		
	
		int num=55;// declares an in variable with 55
		String s=String.valueOf(num);// declares a String Variable with a string Value of num i.e. 55
		System.out.println(s+10);//prints a value of s concatenated with 10 i.e.5510
		
		
	}

}
