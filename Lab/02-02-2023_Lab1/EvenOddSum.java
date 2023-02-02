//Write a program to print even, odd, sum of natural number using for loop from 1-200


public class EvenOddSum {
	public void evenNums()
	{
		for(int i=1;i<=200;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			
			
		}
		System.out.println("");
	}
	public void oddNums()
	{
		for(int i=1;i<=200;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			
			
		}
		System.out.println("");
	}
	public void sumNums()
	{
		int sum=0;
		for(int i=1;i<=200;i++)
		{
			
				sum=sum+i;
			
			
			
		}
		System.out.print(sum);
	}
	
	

	public static void main(String[] args) {
		
		EvenOddSum obj= new EvenOddSum();
		System.out.println("Even Numbers from 1 to 200 :");
		obj.evenNums();
		System.out.println("Odd Numbers from 1 to 200 :");
		obj.oddNums();
		System.out.println("Sum of Numbers from 1 to 200 :");
		obj.sumNums();


	}

}
