
public class EnumConstructorsAndFunctions {// class with main()

	public static void main(String[] args) {
//		calling getDirection() to print all corresponding direcctions
		System.out.println(Directions.right.getDirection());
		System.out.println(Directions.left.getDirection());
		System.out.println(Directions.up.getDirection());
		System.out.println(Directions.down.getDirection());
	}

}

enum Directions { // new enum Directions with 4 elements
	
	up("north"), down("south"), left("west"), right("east");//directions constructors passed with corresponding parameters

	String dir;//local variable

	Directions(String dir) {//parameterized constructor taking String parameter
		this.dir = dir;
	}

	public String getDirection() {//() to return corresponding direction
		return dir;
	}
}