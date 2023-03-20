
public class inc_dec {
	public void increment()
	{
		int x=10;
		
		System.out.println(x++); 
		System.out.println(x++); 
		System.out.println(++x); 
		System.out.println(x++); 
		System.out.println(x);

	}

	public void decrement() {
		int x=10;
		System.out.println(x--);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
	}
	public void arithmaticOpr() {
		int a=30,b=10;
		System.out.println((a+b));
		System.out.println((a-b));
		System.out.println((a*b));
		System.out.println((a/b));
		System.out.println((a%b));

	}
	public void comparisionOpr() {
		int a=30,b=10;
		System.out.println((a>b));
		System.out.println((a<b));
		System.out.println((a>=b));
		System.out.println((a<=b));
//		System.out.println((a==b));
		System.out.println((a!=b));
	}
	public void logicalOpr() {
		int a=30,b=10;
		System.out.println((a>b)&& (a<b));
		System.out.println((a>b)||(a<b));
		
	
	}
	public void bitwiseOpr() {
		int a=30,b=10;
		System.out.println(5 | 7);
		System.out.println(5 & 7);
		
	
	}
	public void ternaryOpr() {
//		(condition) ? if true : if false
		String result = (19< 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
	
	}
	
	public static void main(String[] args) {
		
		inc_dec obj= new inc_dec();
//		obj.increment();
//		obj.decrement();
//		obj.arithmaticOpr();
//		obj.comparisionOpr();
//		obj.logicalOpr();
//		obj.bitwiseOpr();
		obj.ternaryOpr();
		
		
		
		
	}

}

