package Lab5;//defined a package

import java.util.Scanner;//imports Scanner Class

public class ScannerLaptopDemo {/// class with main()

	public static void add(int num1, int num2)// defines a parameterized static method with 2 integer parameters
	{

		System.out.println("Addition : " + (num1 + num2));// prints Addition of numbers passed as parameters
	}

	public static void sub(int num1, int num2)// defines a parameterized static method with 2 integer parameters
	{

		System.out.println("The result is " + (num1 - num2));// prints Subtraction of numbers passed as parameters

	}

	public static void mul(int num1, int num2)// defines a parameterized static method with 2 integer parameters
	{

		System.out.println("The result is " + (num1 * num2));// prints multiplication of numbers passed as parameters
	}

	public static void evenOdd(int num)// defines a parameterized static method with 1 integer parameters
	{

		if (num % 2 == 0)// checks if number is even
		{
			System.out.println("The result is EVEN");// prints the even number message
		} else {
			System.out.println("The result is ODD");// prints the even number message
		}
	}

	public static void main(String[] args) {// main()
		int option ;// declares an integer variable option
		int num1;// declares an integer variable num1
		int num2;// declares an integer variable num1
		Scanner sc = new Scanner(System.in);// instantiates Scanner class
		do// loops until the option=5
		{
//			prints all options
			System.out.println("Select an Option (1-5) :");
			System.out.println();
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Check Even or Odd");
			System.out.println("5.Exit");
			option = sc.nextInt();// takes an integer input into option variable

			switch (option) {// defines a switch case block with option as a key
			case 1:
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();// takes input for num1
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();// takes input for num2
				add(num1, num2);// calls add() with num1 and num2 as parameters
				break;// terminates the switch case checks
			case 2:
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();// takes input for num1
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();// takes input for num2
				sub(num1, num2);// calls sub() with num1 and num2 as parameters
				break;// terminates the switch case checks
			case 3:
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();// takes input for num1
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();// takes input for num2
				mul(num1, num2);// calls mul() with num1 and num2 as parameters
				break;// terminates the switch case checks
			case 4:
				System.out.println("Enter  number: ");
				num1 = sc.nextInt();// takes input in num1
				evenOdd(num1);// calls evenOdd() with num1 as parameter
				break;// terminates the switch case checks
			case 5:
				System.out.println("Exiting.............");// exiting message
				break;// terminates the switch case checks
			default:
				System.out.println("Invalid input try again......");// invalid message
				System.out.println();// line break
				break;// terminates the switch case checks
			}
		}while (option != 5);
		sc.close();// terminates the sc object of Scanner Class
	}

}
