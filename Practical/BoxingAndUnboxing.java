
public class BoxingAndUnboxing {

	static void box()
	{
		int a=30;
		System.out.println("Before boxing a: "+a);
		Integer A=a;
		System.out.println("After boxing A: "+A);
	}
	static void unbox()
	{
		Character C='i';
		System.out.println("Before unboxing C: "+C);
		char c=C;
		System.out.println("After unboxing c: "+c);
	}
	public static void main(String[] args) {
		System.out.println("--------Boxing--------");
		box();
		System.out.println("--------UnBoxing--------");
		unbox();		
		
	}

}
