/*
  
 Develop a simple java application to calculate the tax for a particular employee based on his salary.

 

Develop  a  class  named  “TaxCalculator“ with a method named calculateTax with the following method parameters,

 

Variable Name

Data Type

empName:String

isIndian:boolean

empSal:double

 

This method should return a double taxAmount.

 

The business logic for calculating the tax  is as follows, this has to be implemented inside the method,

 

If the employee is not a Indian

   The calculator should throw a CountryNotValidException

 

If the employee name is null or empty

   The calculator should throw a EmployeeNameInvalidException

 

If  empSal is greater than one lakh and isIndian true

taxAmount =empSal *8/100

Otherwise  If  empSal  is between 50K and 1lakh and isIndian true

taxAmount =empSal *6/100

Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true

taxAmount =empSal *5/100

Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true

 taxAmount =empSal *4/100

Otherwise

   The calculator should throw a TaxNotEligibleException.

 

Develop a main class CalculatorSimulator  , implement the following logic in main method

 

1.     Execute the calculateTax Method and print the tax amount as “Tax amount is “<Tax Amount>

2.     In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate exception print the stack trace and display the following messages,

a.     Country not valid:  “The employee should be an Indian citizen for calculating tax”

b.    Employee name not valid:  “The employee name cannot be empty”

c.     Not eligible for Tax calculation:  “The employee does not need to pay tax”

 

The following test cases to be executed, change the data in main method and run it and verify the output messages

 

Test Cases

Employee Name

Employee Salary

Is Indian

Message Expected

Test Case 1

Ron

34000

False

The employee should be an Indian citizen for calculating tax.

Test Case 2

Tim

1000

True

The employee does not need to pay tax

Test Case 3

Jack

55000

True

Tax amount is 3300

Test Case 4

 

30000

True

The employee name cannot be empty

 
  
 */








package Lab7;

public class TaxCalculator {

	 double calculateTax(String empName,boolean isIndian,double empSal)
		
			 throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
			
			double taxAmount=0.0;//declares a double variable to store tax
			//checks if indian, if not then throws an exception
			if(!isIndian) {
				throw new CountryNotValidException("The emp should be an Indian..!");
			}
			
			
			//checks if name is empty, if yes then thows an exception
			if(empName==null || empName.isEmpty())
			{
				throw new EmployeeNameInvalidException("Employee name is empty");
			}
			
			//calculates tax based on salary range, if salary is out of defined range then throws an exception 
			if(empSal>100000 && isIndian)
			{
				taxAmount =empSal *8/100;
			}
			else if(empSal>=50000 && empSal<=100000 && isIndian)
			{
				taxAmount =empSal *6/100;
			}
			else if(empSal>=30000 && empSal<=50000 && isIndian)
			{
				taxAmount =empSal *5/100;
			}
			else if(empSal>=10000 && empSal<=30000 && isIndian)
			{
				taxAmount =empSal *4/100;
			}
			else {
				throw new TaxNotEligibleException("No need to pay Tax");
			}
				
				
		
		return taxAmount;//returns the eligible tax
	}
	

}
