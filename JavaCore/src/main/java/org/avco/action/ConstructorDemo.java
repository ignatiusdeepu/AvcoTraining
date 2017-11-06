package org.avco.action;

import org.avco.action.DemoAction;
import org.avco.vo.Employee;


public class ConstructorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAction demoAction = new DemoAction();
		demoAction.print("Test");
		System.out.println(demoAction.i);
		//Create the instance or object of the class Employee.
		Employee employee = new Employee("Avco","Consulting");
		System.out.println(employee.firstName);
		System.out.println(employee.lastName);
		System.out.println(" no.of instances of Employee class :: " + Employee.count);
		
		Employee e2 = new Employee("Test2","Test2");
		System.out.println(e2.firstName);
		System.out.println(e2.lastName);
		
		System.out.println(" no.of instances of Employee class :: " + Employee.count);
		Employee.printName(employee.firstName, employee.lastName);
		Employee.printName(e2.firstName, e2.lastName);
		
		
	}

}
