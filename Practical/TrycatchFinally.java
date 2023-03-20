import java.util.InputMismatchException;
import java.util.Scanner;

public class TrycatchFinally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		try{
		
		int x,y,result;
		x=Integer(sc.nextInt());
		y=Integer(sc.nextInt());
		result=x/y;
		System.out.println(result);
		}catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}

	}

	private static int Integer(int nextInt) {
		
		return 0;
	}

}
