class Idproof{  //class1
	int inum;
	String city;
	String state;
	int pincode;
	String dob;
	
		Idproof(int inum, String city, String state, int pincode, String dob){
			this.inum = inum;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.dob = dob;
		}
}
class Student { //class2
	
	int id;
	String name;
	String emailid;
	long contact;
	Idproof idp; //has a relationship , gave an reference of Idproof class
	
	
	Student(int id, String name, String emailid, long contact, Idproof idp){
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.contact =contact;
		this.idp = idp;
		
	}
	
	public void show(){
		System.out.println(id +" "+name+" "+emailid+" "+contact);
		System.out.println(idp.inum+" "+idp.city+" "+idp.state+" "+idp.pincode+" "+idp.dob);
	}
}

class HasARelationship{ //main class 
	public static void main(String args[]){		
		Idproof i = new Idproof(101,"mumbai","mh",12345,"12-01-2000");
		Idproof i1 = new Idproof(1022,"hyd","tel",33345,"02-10-2001");
		Idproof i2 = new Idproof(10332,"ncr","delhi",22345,"05-05-2001");
		
	Student s = new Student(1,"ram","ram@gmail.com",98745435,i);
	Student s1 = new Student(2,"sam","sam@gmail.com",876544,i1);
	Student s2 = new Student(3,"john","jhn@gmail.com",7632141,i2);
	
	s.show();
	s1.show();
	s2.show();
}
}