
public class InheritanceActivity {

	public static void main(String[] args) {
		Manager m=new Manager(01,"Altaf","ghansoli",909009090,10000,10,10);
		m.calculateSalary();
		Trainee t=new Trainee(11,"saltaf","hansoli",209089090,20000,20,20);
		t.calculateSalary();
		Employee emp=new Trainee(11,"saltaf","hansoli",209089090,30000,50,50);
		emp.calculateTransportAllowance();
		m.calculateTransportAllowance();
		
	}

}
class Employee{
	long employeeId,employeePhone;
	double basicSalary,specialAllowance=250.80,Hra=1000.50;
	String employeeName,employeeAddress;
	
	Employee(long id,String name,String Address, long phone, double basic, double special, double hra) {
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=Address;
		this.employeePhone=phone;
		this.basicSalary=basic;
		this.specialAllowance=special;
		this.Hra=hra;
	}
	public void calculateSalary() {
		double salary=basicSalary+(basicSalary * specialAllowance/100)+(basicSalary*Hra/100);//10000 
		System.out.println(salary);
	}
	public void calculateTransportAllowance() {
		double transportAllowance= 10*basicSalary/100;
		System.out.println(transportAllowance);
	}
}



class Manager extends Employee{

	Manager(long id, String name, String Address, long phone, double basic, double special, double hra) {
		super(id, name, Address, phone,basic,special,hra);
		
			
			this.employeeId=id;
			this.employeeName=name;
			this.employeeAddress=Address;
			this.employeePhone=phone;
			this.basicSalary=basic;
			this.specialAllowance=special;
			this.Hra=hra;
		
	}
	public void calculateTransportAllowance() {
		double transportAllowance= 15*basicSalary/100;
		System.out.println(transportAllowance);
	}
	
	
}
class Trainee extends Employee{
	Trainee(long id,String name,String Address, long phone, double basic, double special, double hra){
		super(id, name, Address, phone,basic,special,hra);
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=Address;
		this.employeePhone=phone;
		this.basicSalary=basic;
		this.specialAllowance=special;
		this.Hra=hra;
	}
}
