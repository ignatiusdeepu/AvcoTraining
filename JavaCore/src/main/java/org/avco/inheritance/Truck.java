package org.avco.inheritance;

public class Truck extends Vehicle {

	
	public Truck(boolean isManual){
		super();
		//this.isManual = isManual;
	}
	
	@Override
	protected void move(){
		System.out.println(" Truck moving..");
		super.move();
	}
	
}
