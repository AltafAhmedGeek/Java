class Owner{
	final int area=1000;
	String DOP="07-06-2001";
	String name="Altaf";
	boolean NOC=true;
	public void renew(){
		String color="blue";
		int ceilingHeight=8;
		String flat="2bhk";
		System.out.println(color +" "+flat+" "+ceilingHeight);
	}
}
//single level inheritance from owner -> NewOwner
class NewOwner extends Owner{
	String DOR="12-02-2092";
	double flateprice=2.4;
	String name="Jeevan";
	public void display(){
		
		System.out.println(area+"sq.foot" +", old owner name: "+super.name+", new owner name: "+name);
		
	}
	
	public void renew(){
		String color="red";
		int ceilingHeight=10;
		String flat="3bhk";
		System.out.println(color +" "+flat+" "+ceilingHeight);
		System.out.println("old values: ");
		super.renew();
	}
	
	
	
}
//multi level inheritance from owner -> NewOwner -> NewOwnerChild
class NewOwnerChild extends NewOwner{
	String DOR="12-12-2102";
	double flateprice=4.5;
	String name="raj";
	public void display(){
		
		System.out.println(area+"sq.foot" +", old owner name: "+super.name+", new owner name: "+name);
	}
	public void renew(){
		String color="pink";
		int ceilingHeight=12;
		String flat="5bhk";
		System.out.println(color +" "+flat+" "+ceilingHeight);
		System.out.println("old values: ");
		super.renew();
	}
}
//hirarchical level inheritance from NewOwner -> NewOwnerChild  and newOwnerChild2

class newOwnerChild2 extends NewOwner{
	public void superDisplay() {
		
		super.display();
	}
}

public class InheritanceExamples {

	public static void main(String[] args) {
		
		NewOwnerChild obj= new NewOwnerChild();
		obj.display();
		obj.renew();
		System.out.println(obj.NOC);
		
		newOwnerChild2 obj1=new newOwnerChild2();
		obj1.superDisplay();
		

	}

}
