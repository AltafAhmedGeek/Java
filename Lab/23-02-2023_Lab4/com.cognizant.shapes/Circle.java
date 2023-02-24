/*Problem Statement 1:  Declaring and using constructors

Create a class Circle.java in a package “com.cognizant.shapes” , add a float instance variable radius and add a default constructor (Constructor 1) for the class. This constructor should initialize the radius to a default value 1.5f.

The above constructor should be invoked from a main method from another class, Shape.java (in different package com.cognizant. geometry).

 

Problem Statement 2: Overloading constructors and using “this” keyword.

In the Circle.java class created above add an instance float variable pi and create two overloaded constructors.

Constructor 2- with a float argument name radius. The constructor should initialize the class variable radius  with the method argument radius.

NOTE:   The instance variable and the method argument should be named same as “radius”.

Constructor 3- with two float arguments radius and pi. Default the class pi value to 3.5 and set the instance variable with the radius method argument.

The constructor “constructor 2” should be invoked from a main method from class, Area.java (in a package com.cognizant.shapes).

Problem Statement 3: Constructor Chaining

In Circle.java, invoke the Constructor 3 created in the previous step from Constructor 2.

Problem Statement 4:  Applying access specifiers to constructors/variables

 a.    (Other classes must not be able to call this constructor). Also restrict the access to the variable radius to class level

b.    Provide package level access to Constructor 2 (Classes in other package must not be able to access this constructor). Also provide package level access to the variable pi.

 

Problem Statement 5: Create two methods and calculate area and circumference of a Circle

 

In the Circle.java class, create two methods as listed below

a.    Method 1 - calculateCircleArea should accept the float radius as parameter and calculate the area (pi*r*r). It should return the result value to the main method where it should be printed in the console.

b.    Method 2 – calculateCircumference should accept float radius as parameter and calculate the circumference (2 * pi * r). It should return the result value to the main method where it should be printed in the console.

 

Call these two methods from the main method in Circle.java by passing appropriate parameters.*/





package com.cognizant.shapes;// declares a package com.cognizant.shapes for this class

public class Circle {// defines a class containing main()

	private float radius;// declare and defines a private instance variable radius of type float
	float pi;// declare and defines an instance variable pi of type float

	private Circle()// defines a private default Constructor
	{
		radius = 1.5f;// sets the value of private instance variable radius = 1.5
	}

	Circle(float radius)// defines a parameterized Constructor with one parameter radius
	{
//		 this.radius=radius;//sets the value of radius to the value passed as parameter
//		 pi=3.5f;//sets the value of pi to 3.5
		this(radius, 3.5f);// short hand to set the value of radius to passed value and pi to 3.5

	}

	private Circle(float radius, float pi)// defines a private parameterized Constructor with 2 float parameters radius
											// and pi
	{
		this.pi = pi;// sets the value of instance variable pi to passed value
		this.radius = radius;// sets the value of private instance variable radius to passed value
	}

	float calculateCircleArea(float radius)// defines a method calculateCircleArea with a float parameter radius to
											// calculate the area of a circle
	{
		return pi * radius * radius;// returns the area of circle
	}

	float calculateCircumference(float pi)// defines a method calculateCircumference with a float parameter pi to
											// calculate the circumference of a circle
	{
		return 2 * pi * radius;// returns the circumference of a circle
	}

	public static void main(String[] args) {// defines the main()
		// create an instance of class Circle using parameterized constructor with
		// radius
		Circle c = new Circle(5);// sets the value of radius to 5

		System.out.println("Area of Circle : " + c.calculateCircleArea(5));// prints the value of Area of Circle
		System.out.println("Circumference of Circle : " + c.calculateCircumference(3.14f));// prints the value of
																							// Circumference of Circle
	}
}
