package org.avco.action;

public class DemoAction {

	public int i =10;
	
	public DemoAction(){
		System.out.println("DemoAction constructor");
		print("test");
	}
	
	public void print(String str){
		System.out.println(str);
		System.out.println(i);
	}
}

