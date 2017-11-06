package org.avco.inheritance;

public class Car extends Vehicle {

	public boolean isManual;
	
	public Car(boolean isManual){
		super();
		this.isManual = isManual;
	}
	
	@Override
	protected void move(){
		System.out.println(" Car moving..");
		super.move();
	}
}
