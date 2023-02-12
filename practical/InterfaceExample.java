
public class InterfaceExample { // class with main()

	
	public static void main(String[] args) {
	AvonBike obj= new AvonBike(); // creating object "obj" of class AvonBike
	//calling all overrided methods of interface "bike"
	obj.speedUp();
	obj.slowDown();
		
	}

}

interface bike{ // creating interface "bike" with 2 methods without body
	public void speedUp();
	public void slowDown();
}

class AvonBike implements bike{ // implementing interface "bike" in class "AvonBike"
	//overriding both methods of interface "bike"
	public void speedUp(){
		System.out.println("speeding up");
	}
	public void slowDown(){
		System.out.println("sloowing down");
	}
}
