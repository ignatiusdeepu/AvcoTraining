package org.avco.inheritace;

public class Animal {

	private int noOfLegs;

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	public void sound(){
		System.out.println("Animal sound");
	}
	
}
