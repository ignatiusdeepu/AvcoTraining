package org.avco.inheritance;

public class InheritanceDemo {

	
	public static void main(String a[]){
		Vehicle obj = null;//reference of parent class Vehicle.
		obj = new Car(false);// parent class reference holds the instance of a subclass.
		//Car car = new Car(true);
		/*System.out.println(obj.isManual);
		System.out.println(car.isManual);*/
		System.out.println(obj.noOfWheels);
		obj.move();
		//Whenever a parent class reference holds an instance of a subclass,
		//then, only visible members of parent class can accessed, none
		//of the members specific to subclass can be accessed using the parent class reference.
		
	}
}
