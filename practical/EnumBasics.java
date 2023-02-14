

public class EnumBasics { // class with main()

	public static void main(String[] args) {
		System.out.println(IndianCars.MAHINDRA); // basic printing using enumName.elementName
		//using predefined functions
		System.out.println(IndianCars.MARUTI.equals("SUZUKI"));// will return false
		System.out.println(IndianCars.MARUTI.hashCode());// will return hashcode of element
		System.out.println(IndianCars.MARUTI.name());// will return name of element
		System.out.println(IndianCars.TATA.ordinal());// returns index of element (starts from 0 to n)
		System.out.println(IndianCars.MARUTI.toString());// converts and returns the value from type  enum element to string type to be able to store in string type variable
		
		//calling elements by enhanced for loop
		System.out.println("Calling elements by enhanced for loop:");
		for(IndianCars ic: IndianCars.values())
		{
			System.out.println(ic);
		}
	}

}
enum IndianCars{//creating an enum
	MARUTI,TATA,MAHINDRA;// declaring enum elements
}

