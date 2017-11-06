package org.avco.abstraction;

public class UserAddress extends User {

	
	public UserAddress(){
		super();
	}
	
	public  String printAddress(){
		System.out.println("Printing address");
		return "Printing address";
	}
}
