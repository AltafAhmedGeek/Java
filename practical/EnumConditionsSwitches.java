
public class EnumConditionsSwitches {// class with main()
	

	
	
	public static void main(String[] args) {

		ifColors();// calling if logic ()
		switchColors();//calling switch logic ()
		
	}

	
	
	
	public static void ifColors() { // static void function using if else statements
		Colors color=Colors.yellow;// creating color object of Enum Colors
		if(color==Colors.green) {// checking if else  through color object
			System.out.println("it is green");
		}
		else if(color==Colors.red) {
			System.out.println("it is red");
		}
		else if(color==Colors.yellow) {
			System.out.println("it is yellow");
		}
	}
	
	
	public static void switchColors() {// static void functions using switch case statements
		Colors color=Colors.red;// creating color object of Enum Colors
		
		switch(color)// switching through color object
		{
		case red:
			System.out.println("it is red");
			break;
		case yellow:
			System.out.println("it is yellow");
			break;
		case green:
			System.out.println("it is green");
			break;
		}
	}
}
enum Colors{// Creatinf Colors enum with 2 elements
	red,yellow,green;
}