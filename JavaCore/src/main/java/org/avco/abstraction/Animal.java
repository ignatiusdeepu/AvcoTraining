package org.avco.abstraction;

public abstract class Animal{

	public Animal(){
		System.out.println(" Abstract class Animal constructor.");
	}
	
	int noOfLegs;
	
	public abstract void sound();
	
	public abstract void sound1();

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
}
