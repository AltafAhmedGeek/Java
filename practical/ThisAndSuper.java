
public class ThisAndSuper {

	public static void main(String[] args) {
	
		animal a= new animal(4);// creating object "a" of class animal with single int parameter
		System.out.println(a.legs);//printing number of legs
		
		fish f= new fish(2);// creating object "f" of class fish with single int parameter
		System.out.println(f.fins); //printing number of fins

		catFish c= new catFish(6);// creating object "f" of class fish with single int parameter
		System.out.println(c.fins); //printing number of fins

	}

}

//this keyword not necessary for different name of local and instance variable
class animal {
	int legs;// instance variable
	animal(int x){// local variable x
		// local variable
		this.legs=x; // no need of this keyword || no effect of this keyword if written
	}
}
class fish{
	int fins;// instance variable
	fish(int fins){// local variable fins
		
		this.fins=fins;//have to use this keyword because local and instance variable have same name
	}
}

class catFish extends fish{
	int fins;// instance variable
	catFish(int fins)//local variable fins
	{
		super(fins);// have to use super(local variable) to resolve error because the compiler coudn't find the default constructor of parent class  because we have override it as parameterized constructor
		this.fins=fins;//have to use this keyword because local and instance variable have same name
	}
}