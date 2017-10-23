package org.avco.module2.lambda;

public class NLEEx1 {

	public static void main(String[] args) {
		int width = 10;
		Drawable d = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Drawing" +width);
				
			}
		};
		d.draw();
	}

}
