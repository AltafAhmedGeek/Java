import java.util.Scanner; // importing scanner class for input

public class PrimeEvenFactorial { // creating a class containing main()
	
	public void isPrime(int number) {// creating a isPrime() to check number is prime or not
		int factors=0; // initializing factors variable that will store factors of an input number
		for(int i=1;i<=number;i++) // looping from 1 to the input number
		{
			
			if(number%i==0)// checking for factors
			{
			factors++;	// incrementing factors if condition is satisfied
			}
		}
		if(factors==2) // checking if number of factors==2 
		{
			System.out.println(number+ " Is A Prime Number");
		}
		else {// checking in case number of factors != 2
			System.out.println(number +" Is Not A Prime Number");
		}
		
		
	}
	public void isEvenOdd(int number) { // creating isEvenOdd() to check if the input number is even or odd ?
		
		
			if(number%2==0) // checking for even
			{
				System.out.println(number+ " Is An Even Number");
			}
			else { // checking for odd 
				System.out.println(number+ " Is An Odd Number");

			}		
	}
	public void factorialOf(int number){ // creating factorialof() to print factorial of input number
		int factorial =1;
		for(int i=1; i<=number; i++)
		{
			factorial*=i;
		}
		System.out.println("Factorial of "+ number+ " : "+ factorial);
		
	}
	public static void main(String[] args) {
		//input
		Scanner sc= new Scanner(System.in);// creating scanner object "sc"
		System.out.println("Enter a Number: "); //printing input prompt
		int number= sc.nextInt(); // taking input from terminal
		
		//checking prime
		PrimeEvenFactorial obj=new PrimeEvenFactorial(); // creating PrimeEvenFactorial class object "obj"
		obj.isPrime(number); // calling isPrime() with "number" as parameter
		
		//checking even or odd
		 obj.isEvenOdd(number);// calling isEvenOdd() with "number" as parameter
		
		//printing factorial of "number"
		obj.factorialOf(number);// calling factorialOf() with "number" as parameter

	}

}
