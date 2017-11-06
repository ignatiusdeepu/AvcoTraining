package org.avco.vo;

public class Employee {

	/* instance variables , these variable occpy memory space in JVM i.e, the HEAP memory*/
	public String firstName;//10001, 100010
	public String lastName;//10005, 100015
	public static int count =0; 

	public Employee(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		++count;
	}
	
	public static void printName(String firsName,String lastName){
		System.out.println(firsName+lastName);
	}
	
	public void printName(){
		System.out.println(firstName+lastName);
	}
}
