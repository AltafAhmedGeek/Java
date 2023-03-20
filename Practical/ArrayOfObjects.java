
public class ArrayOfObjects {

	public static void display(int y[])
	{
		System.out.println(y[0]);
		y[0] = 200;//changes the value of array element
	}
	public static void main(String args[])
	{
//		array pass by reference
		int x[] = { 20, 30, 40 };
		System.out.println(x[0]);
		display(x);//changes the value of element of actual array
		System.out.println(x[0]);
		
//		array of object
		Object[] elements = new Object[4];//declaring array of type Object 
		elements[0] = "elephant";
		elements[1] = 60;
		elements[2] = new StringBuilder("xyz");
		elements[3] = 3.4;
		for (Object e : elements) {
		System.out.println(e);
		}
	}

}

//The limitations of arrays - 
//* Programmers must know the number of array elements beforehand. 
//* An array has a fixed size and the size cannot be modified after creation. 
//* Array elements are stored in consecutive memory locations. It makes insertion and deletion challenging. 
//* Memory allocation is difficult as allocating more or less memory space leads to issues.
