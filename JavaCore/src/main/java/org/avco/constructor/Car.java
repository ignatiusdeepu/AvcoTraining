package org.avco.constructor;

public class Car extends Vehicle {

	public int k;
	
	public Car(int i, String str,int k){
		super(i,str);
		System.out.println(" Car 3 arg constructor....");
		this.k = k;
	}
}
