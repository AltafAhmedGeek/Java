//Write a program to design an Calculator using switch case



import java.util.Scanner;

public class SwitchCal {
	public void calc(float firstNum, float secondNum, int choice)
	{
		float result;
		switch(choice)
		{
		case 1:
			result=firstNum+secondNum;
			System.out.println(result);
			break;
		case 2:
			result=firstNum-secondNum;
			System.out.println(result);
			break;
		case 3:
			result=firstNum*secondNum;
			System.out.println(result);
			break;
		case 4:
			result=firstNum/secondNum;
			System.out.println(result);
			break;
		}
	}
	public void choices() 
	{
		System.out.println("1. Adiition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
	}

	public static void main(String[] args) {
		SwitchCal obj = new SwitchCal();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		obj.choices();
		int choice= sc.nextInt();
		
		if(choice<5)
		{
			System.out.println("Enter first Number:");
			float firstNum=sc.nextFloat();
			System.out.println("Enter Second Number:");
			float SecondNum=sc.nextFloat();
			obj.calc(firstNum, SecondNum, choice);
		}
		else {
			System.out.println("Invalid Input, Try again..........");
		}
		

	}

}
