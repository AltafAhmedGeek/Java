
public class MethodOverriding {// class main()

	public static void main(String[] args) {
		// creating object of both classes
		Dog d= new Dog();
		puppy p= new puppy();
//		calling method with same name in both calsses
		d.bark();
		p.bark();

	}

}


class Dog{ //crating class dog with bark()
	public void bark()
	{
		System.out.println("bhow bhow....");
	}
}
class puppy{//crating class puppy with bark()
	public void bark() {
		System.out.println("woff woff....");
	}
}