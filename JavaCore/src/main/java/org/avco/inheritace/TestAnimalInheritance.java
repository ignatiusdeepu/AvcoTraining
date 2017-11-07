package org.avco.inheritace;

public class TestAnimalInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//obj is reference of class Animal
		Animal obj = null;
		
		// Create an instance of Cat and invoke the sound method of Cat.
		Cat cat = new Cat();
		cat.setNoOfLegs(4);
		cat.sound();
		cat.print();
		//parent class holding the instance of the child class.
		/*obj = new Cat();
		obj.sound();
		//animal.print();
		
		obj = new Dog();
		obj.sound();
		*/
		/*Cat cat1 =null;
		cat1 = new Animal();*/
		
		//Super class reference can hold an instance of a subclass
		Animal obj2 = new Cat();
		//Whenever a super class reference holds an instance of subcalss, then only the methods that are defined in the super class can be used.
		obj2.setNoOfLegs(4);
		System.out.println(obj2.getNoOfLegs());
		obj2.sound();
		
		
	}

}
