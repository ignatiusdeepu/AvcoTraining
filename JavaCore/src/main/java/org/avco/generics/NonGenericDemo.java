package org.avco.generics;

public class NonGenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Draw draw = new Draw(triangle);
		Circle circle = (Circle)draw.getShape();
		circle.draw();
	}

}
