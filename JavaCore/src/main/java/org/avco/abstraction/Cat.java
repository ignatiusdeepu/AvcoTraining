package org.avco.abstraction;

public class Cat extends Animal {

	public Cat(){
		super();
		System.out.println(" Cat Constructor.");
	}
	
	@Override
	public void sound() {
		System.out.println(" Cat sound ");

	}

	@Override
	public void sound1() {
		System.out.println(" Cat sound ");
	}
}
