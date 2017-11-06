package org.avco.constructor;

//import com.bottomline.webseries.core.utilities.validation.ValidatorFactory;



public class ConstructorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		DemoAction demoAction = new DemoAction();
		demoAction.print("Test");
		System.out.println(demoAction.i);
		//Create the instance or object of the class Employee.
		Employee employee = new Employee("Avco","Consulting");
		System.out.println(employee.firstName);
		System.out.println(employee.lastName);*/
		
		//Vehicle vehicle = new Vehicle(1,"ajsh");
		Vehicle vehicle = new Vehicle();
		vehicle.i =10;
		vehicle.str ="";
		//vehicle.j =10;
		//ValidatorFactory factory = new ValidatorFactory();
		Car c1 = new Car(100,"abc",200);
		System.out.println(" Value of I :"+c1.i);
		System.out.println(" Value of j :"+c1.j);
		System.out.println(" Value of Str :"+c1.str);
		System.out.println(" Value of k :"+c1.k);
	}

}
