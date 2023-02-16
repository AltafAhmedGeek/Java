package Lab3;//defining package

public class AdultUser implements LibraryUser{//creating class AdultUser which implements an interface LibraryUser

	//	defining instance variables
	int age=24;
	String bookType="kids";
	
	//defining the abstract methods 

	@Override
	public void registerAccount() {
		if(age>12)//checking if age is greater than 12
		{
			System.out.println("You have successfully registered under an Adult Account");//printing success message on true condition
		}
		else if (age<=12){//checking if age is less than equal to 12
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");//printing failure message on condition age greater than 12
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType=="Fiction")//checking if bookType is Fiction
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");//printing success message on true condition
		}
		else 
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");//printing failure message on false condition
		}
		
	}

}
