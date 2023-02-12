
public class MultipleInheritance { // class with main()

	public static void main(String[] args) {
		dog tommy= new dog(); // creating object of class dog
//		calling methods of both interface 
		tommy.swim();
		tommy.walk();

	}

}
//creating 2 interfaces with different methods declaration
interface water{
	void swim();
}
interface land{
	void walk();
}
class dog implements water,land{ // implementing both interfaces in class dog
//	overriding both functions of both interfaces
	public void swim() {
		System.out.println("I can swim");
	}
	public void walk() {
		System.out.println("i can walk");
	}
}
