package Lab3;//defining package

public class KidUsers implements LibraryUser {//creating class KidUsers which implements an interface LibraryUser

	//	defining instance variables
	int age=11;
	String bookType="Kids";
	
	//defining the abstract methods 
	
	@Override
	public void registerAccount() {
		
		if(age<=12)//checking if age is less than equal to 12
		{
			System.out.println("You have successfully registered under a Kids Account");//printing success message on true condition
		}
		else if (age>12){//checking if age is greater than equal to 12
			System.out.println("Sorry, Age must be less than 12 to register as a kid");//printing failure message on condition age greater than 12
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType=="Kids")//checking if bookType is Kids
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");//printing success message on true condition
		}
		else //while bookType is not Kids
		{
			System.out.println("Oops, you are allowed to take only kids books");//printing failure message on false condition 
		}
	}

}
