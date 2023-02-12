
public class MethodOveroading {//class with main()

	public void add(int a,int b)// add () with 2 int
	{
		System.out.println(a+b);
	}
	public void add(int a,int b, int c)// add() 3 int
	{
		System.out.println(a+b+c);
	}public void add(float a,float b) // add 2 float
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		MethodOveroading obj= new  MethodOveroading();// creating object obj of class MethodOveroading
//		calling all methods
		obj.add(1, 3);
		obj.add(1.2f, 2.3f);
		obj.add(1, 2, 2);
	}

}
