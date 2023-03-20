
public class StringExamples {

	public static void main(String[] args) {
		String a1="anudip";
		String a2="Anudip Foundation";
		String a3=new String("anudip");
		String a4="Anudip";
		String a5="anudip";
		String a6="altaf";
		String a7="kaltg";
		String a8="India";
		//equals() and equaltsIgnoreCase() 
		System.out.println(a1.equals(a2));//false because a1 and a2 are different
		System.out.println(a1.equals(a3));//true
		System.out.println(a1.equals(a4));//false because case doesn't matches
		System.out.println(a1.equalsIgnoreCase(a4));//true because it ignores the cases
		
		// == compares references not values
		System.out.println(a1==a2);//false because different strings
		System.out.println(a1==a3);//false because value is same but reference is different
		System.out.println(a1==a5);//true because both have same reference
		
		// compareTo() returns difference in the Unicode 
		System.out.println(a6.compareTo(a7));//negative
		System.out.println(a1.compareTo(a8));//positive
		System.out.println(a1.compareTo(a3));//zero
		
		// concatenation 
		System.out.println(a1+" "+a2);// will concatenate both string with blank space in between
		System.out.println(12+2+" = "+3+3.5);// will first add all values before and after =
		System.out.println(a2.concat(a7)); // will concatenate both strings
		
		//substring
		System.out.println(a1.substring(1));// will print string from index 1
		System.out.println(a1.substring(1,4));//will print string from index 1 to index 3(i.e.upto position 4)

	}

}
