package Lab3;// defining package

public class LibraryInterfaceDemo {//crating class with main()

	public static void main(String[] args) {
		
		KidUsers k1= new KidUsers();//Instantiating object of  KidUsers
		AdultUser a1= new AdultUser();//Instantiating object of  AdultUser
		
//		calling both methods with object of KidsUsers class
		k1.registerAccount();
		k1.requestBook();
		
//		calling both methods with object of AdultUser class

		a1.registerAccount();
		a1.requestBook();

	}

}
