package org.avco.collections;

import org.avco.constructor.Vehicle;

public class Car extends Vehicle {

	private int noOfLegs;
	
	public Car(int i,String str,int noOfLegs){
		super(i,str);
		this.noOfLegs = noOfLegs;
		this.i = i;
		//this.j = 10;
	}
}
