
public class TypeCasting {

	public static void main(String[] args) {
		//widening
		 int myInt = 9;
		    double myDouble = myInt; 
		    System.out.println("WIDENING"); 
		    System.out.println(myInt);     
		    System.out.println(myDouble);  
		    
		    //narrowing
		     myDouble = 9.78d;
		     myInt = (int) myDouble; 
		     System.out.println("NARROWING"); 
		    System.out.println(myDouble);   
		    System.out.println(myInt);      

	}

}
