package org.avco.module2.lambda;

public class LEEx4 {

	public static void main(String[] args) {
		Addable add1 = (x,y) -> x+y;
		System.out.println("addition of 1,2 is:"+add1.add(1, 2));
		Addable add2 = (int x,int y) ->  x+y;
		System.out.println("addition of 1,2 is:"+add2.add(1, 2));
		
	}

}
