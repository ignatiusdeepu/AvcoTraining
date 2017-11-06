package org.avco.constructor;

public class Vehicle {

	public int i =0;
	public String str;
	public int j =0;
	
	public Vehicle(int i, String str){
		System.out.println(" Vehicle 2 arg constructor....");
		this.i = i;
		this.str = str;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
		System.out.println(" Vehicle default constructor....");
	}

}
