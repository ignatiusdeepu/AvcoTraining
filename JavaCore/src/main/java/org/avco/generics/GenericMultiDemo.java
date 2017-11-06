package org.avco.generics;

public class GenericMultiDemo {

	public static void main(String a[]){
		DrawGenericMulti<Circle, Square> drawGenericMulti = new DrawGenericMulti<Circle, Square>(new Circle(), new Square());
		drawGenericMulti.getShape1().draw();
		drawGenericMulti.getShape2().draw();
	}
}
