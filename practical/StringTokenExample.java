//The java.util.StringTokenizer class allows you to break a String into tokens. It is simple way to break a String. It is a legacy class of Java.


import java.util.StringTokenizer;//imports class StringTokenizer

public class StringTokenExample {//class with main()

	public static void main(String[] args) {
		StringTokenizer s1= new StringTokenizer("this is string");
		while (s1.hasMoreTokens()) {
			System.out.println(s1.nextToken());
			
		}
		
		StringTokenizer s2= new StringTokenizer("this,is,string",",");
		while (s2.hasMoreTokens()) {
			System.out.println(s2.nextToken());
			
		}
		StringTokenizer s3= new StringTokenizer("this.is.string",".",true);
		while (s3.hasMoreTokens()) {
			System.out.println(s3.nextToken());
			
		}
		StringTokenizer s4= new StringTokenizer("this.is.string",".",false);
		while (s4.hasMoreElements()) {
			System.out.println(s4.nextToken());
			
		}
	}

}
