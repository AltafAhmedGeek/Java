import java.util.Scanner;
public class loopsInJava {
	public static void foorloop(int num)
	
	{
		for(int i=1;i<=num;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void whileloop(int num)
	{
		int i=1;
		while(i<=num)
		{
			System.out.print(i+" ");
			i++;
		}
	}
	public static void dowhileloop(int num)
	{
		int i=1;
		
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=num);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		loopsInJava.foorloop(num);
		System.out.println();
		loopsInJava.whileloop(num);
		System.out.println();
		loopsInJava.dowhileloop(num);
	}
}
