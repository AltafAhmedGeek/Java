import java.util.Scanner;

public class conditionalStatement {
	public static void singleIfElse(int x) {
		
		if(x==80)
		{
			System.out.print("yes x is equal to 80");
		}
		else
		{
			System.out.print("x is not equal to 80");
		}
	}
	public static void NestedIf(int x) {
		if(x%2==0)
		{
			System.out.println("x is an even number");
			if(x==2)
			{
				System.out.println("x is equal to 2");
			}
			else {
				System.out.println("x is not equal to 2");	
			}
			
		}
		else {
			System.out.println("x is an odd number");
		}
	}
	public static void multipleIf(int age)
	{
		
		
		if(age<18)
		{
			System.out.print("not adult");
		}
		else if(age>=18 &&  age<=59)
		{
			System.out.print("adult");
		}
		else {
			System.out.print("senior citizen");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x=sc.nextInt();
		//conditionalStatement.singleIfElse(x);
		//conditionalStatement.NestedIf(x);
		conditionalStatement.multipleIf(x);
		

	}

}
