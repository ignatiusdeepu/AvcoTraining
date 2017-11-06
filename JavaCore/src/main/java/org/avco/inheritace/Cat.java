package org.avco.inheritace;

public class Cat extends Animal{

	public void sound(){
		System.out.println(" Cat sound");
		super.sound();
		System.out.println("alskdj");
	}
	
	public void print(){
		System.out.println(getNoOfLegs());
	}
}
