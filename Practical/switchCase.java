import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 int rank=sc.nextInt();  
		    
		    switch(rank){  
		    //Case statements  
		    case 1: System.out.println("First position");  
		    break;  
		    case 2: System.out.println("Second position");  
		    break;  
		    case 3: System.out.println("Third position");  
		    break;  
		    //Default case statement  
		    default:System.out.println("Not first second or third");  
		    }  


	}

}
