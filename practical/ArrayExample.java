
public class ArrayExample {

	public static void main(String[] args) {
		
		int myArray[]= new int[4];// declaring and instantiating  an array
		
		for (int i = 0; i < myArray.length; i++) {//iterating through the array elements
			
			myArray[i]=i;//giving value to each element of array
		}
		  
		//iterating throughout the array to print it using formal for loop
		
		for (int i = 0; i < myArray.length; i++) {//iterating through the array elements
			
			System.out.println(myArray[i]);//printing all array elements
		}
		
		 
		showArray(myArray);// calling a static function to print array elements

	}
	public static void showArray(int arr[])// creating a static parameterized method 
	{
		for (int a: arr)//iterating throughout the array using advanced for loop
		{
			System.out.println(a);// printing elements of array
		}
	}

}
