package org.avco.generics;

public class GenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DrawGeneric<Circle> drawGeneric = new DrawGeneric<Circle>(new Circle());
		drawGeneric.getShape().draw();
		
		DrawGeneric<Triangle> traingle = new DrawGeneric<Triangle>(new Triangle());
		traingle.getShape().draw();
		
		DrawGeneric<String> drwStr = new DrawGeneric<String>("hello");
		System.out.println(drwStr.getShape().toString());
	}

}
