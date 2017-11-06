package org.avco.vo;

import org.avco.encapsulation.Test;
import org.avco.inheritace.Vehicle;

//Car is a subclass of Vehicle
public class Car extends Vehicle {

	int noOfSeats;
	
	public Car(int noOfWheels,int noOfSeats){
		super(noOfWheels);
		this.noOfSeats = noOfSeats;
		this.noOfWheels = noOfWheels;
	}
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	protected void move(){
		System.out.println("Car is moving");
		Test.printf();
	}
	
	public void move(int i){
		System.out.println("Car is moving");
		Test.printf();
	}
}
