package org.avco.inheritace;


public class Vehicle {

	protected int noOfWheels;
	//Connection connection;
	
	public Vehicle(int noOfWheels){
		this.noOfWheels = noOfWheels;
	}
	
	public Vehicle(){
	}
	
	public void move(int i){
		System.out.println("Vehicle is moving");
	}
	
}
