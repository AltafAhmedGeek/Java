
public class Operation {

	public  int sum(int a,int b)
	{
		return a+b;
	}
	public int greaterBeetweenThree(int a,int b, int c) {
		if(a>b && a>c)
		{
			return a;
		}
		if(b>a && b>c)
		{
			return b;
		}
		else {
			return c;
		}
		
	}
	public int smallerBeetweenThree(int a,int b, int c) {
		if(a<b && a<c)
		{
			return a;
		}
		if(b<a && b<c)
		{
			return b;
		}
		else {
			return c;
		}
		
	}
	public  String reverseString(String str)
	{
		char ch;
		String newStr = "";
		 for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        newStr=ch+newStr;
	      }
	      return newStr;
	}
	public  int[] table(int num)
	{
		int result[]= new int[10];
		for (int i = 0; i <10; i++) {
			result[i]= num*(i+1);
		}
		return result;
	}
	

}

