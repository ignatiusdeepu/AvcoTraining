package org.avco.vo;

public class Test {

	//instance variables.
	//All instance variables will be initialized to their respective default values.
	private int i;
	private int j;
	private String str;
	private static int count;
	
	//1. All the instance variable which are non-static member will occupy the heap memory space. Each instance will
	//have its own copy of the instance variable.
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Test.count = count;
	}

	public void print(){
		int i;//local variable
		//System.out.println(i);
		System.out.println(this.i);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
