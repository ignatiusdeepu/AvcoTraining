package org.avco.vo;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// allocates memory space for all the instance variables and assigns them to test1
		Test test1 = new Test();
		Test test2 = new Test();
		test1.setI(10);
		test1.setJ(20);
		test1.setStr(" This is test1");
		test1.setCount(1);
		System.out.println(test1.getCount());
		System.out.println(test2.getCount());
		
		// allocates memory space for all the instance variables and assigns them to test1
		
		
		test2.setI(100);
		test2.setJ(200);
		test2.setStr(" This is test2");
		test2.setCount(2);
		
		System.out.println(test1.getCount());
		System.out.println(test2.getCount());
		
		test1.print();
		test2.print();
		
		
	}

}
