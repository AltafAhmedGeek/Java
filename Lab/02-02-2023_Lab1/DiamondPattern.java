
// Write a program to print an diamond star pattern using loop
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

import java.util.Scanner;
public class DiamondPattern {
	public void diamond()
	{
		Scanner sc = new Scanner(System.in);
		int i,j,k,rows;
		System.out.println("Enter the number of rows: ");
		rows=sc.nextInt();
		
		for(i=1;i<=rows;i++) 
		{
			for(j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=rows-1;i>=1;i--) 
		{
			for(j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		DiamondPattern obj= new DiamondPattern();
		obj.diamond();
	}

}
