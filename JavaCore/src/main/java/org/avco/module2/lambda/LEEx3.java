package org.avco.module2.lambda;

public class LEEx3 {

	public static void main(String[] args) {

		Car car = (wheels) -> "Car with "+wheels+" is moving";
		System.out.println(car.move(4));
		
	}

}
