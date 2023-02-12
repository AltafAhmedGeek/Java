class Car{
	
	String Name = "Maruti";
	String lunchDate ="06-01-2004";
	String color ="blue";
	int CarWeight = 250;
	int EnginePower = 2500;
	int CarPrice = 150000;
	public void display() {
		
		System.out.println(Name + " " +color + " " + CarWeight); 
	}
  
  
}  
class MarutiSwift extends Car{
	String Name = "Maruti Swift";
	String lunchDate ="01-01-2008";
	String color ="white";
	int CarWeight = 240;
	int EnginePower = 4000;
	int CarPrice = 200000;
	
	
	public void Display(){
		System.out.println("Car Name is : "+super.Name);
		System.out.println("Car Color is : "+color);
		System.out.println("Car Weight is : "+CarWeight);
		System.out.println("Car Price is : "+CarPrice);
		System.out.println("Car EnginePower is : "+EnginePower);
 
}  
}
class MarutiAlto extends Car{
	String Name = "Maruti Alto";
	String lunchDate ="01-12-2010";
	String color ="Red";
	int CarWeight = 300;
	int EnginePower = 5000;
	int CarPrice = 500000;
	
}
class HierarchicalExample {
	public static void main(String args[]){  
		MarutiAlto ma= new MarutiAlto();
		ma.display();
		System.out.println(ma.color);
		MarutiSwift ms= new MarutiSwift();
		ms.Display();
		ms.display();
		
	}
}  