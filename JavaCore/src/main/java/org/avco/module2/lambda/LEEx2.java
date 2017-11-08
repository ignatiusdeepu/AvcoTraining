package org.avco.module2.lambda;

public class LEEx2 {

	public static void main(String[] args) {
		int width = 10;
		Drawable d = () -> System.out.println("Drawing" +width);
		d.draw();
	}
}
