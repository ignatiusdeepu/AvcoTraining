package org.avco.constructor;

//import com.bottomline.webseries.core.utilities.validation.ValidatorFactory;



public class ConstructorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//obj is reference of User

		Vehicle obj = null;
		
		obj = new Car(1,"abc",3);
		System.out.println(obj.i);
	}

}
