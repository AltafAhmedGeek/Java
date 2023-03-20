
public class AbstractionExample { // calss with main()

	public static void main(String[] args) {
		Honda city= new Honda(); // instanciating non abstract class Honda ie. child of car class 
		
		city.honda();// calling original method of class Honda
		city.drive();// calling overrided mehod of class car
		city.stop(); // calling normal method of classs car from class Honda

	}

}

abstract class car{ // creaating abstract class car
	public abstract void drive(); // declaring abstract dirve() without body
	public void stop() { // creating stop()
		System.out.println("car stopped");
	}
}
class Honda extends car{ // crating child class Honda from car
	public void drive(){ //overriding drive() of class car
		System.out.println("car Started");
	}
	public void honda() { // creating honda() of class honda
		System.out.println("This is honda");
	}
}