package org.avco.staticdemo;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String string = new String(" AVCO ");
		String str = "Test";
		System.out.println(str);
		str+= "123";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();
		sb.append("Test");
		sb.append("123");
		sb.append("456");
		
		if("str1".equals("str1")){
			System.out.println("equal");
		}
		
		sb = null;*/
		StaticDemo demo = new StaticDemo();
		StaticDemo.printToConsole();
		System.out.println(StaticDemo.i);
		demo = new StaticDemo();
		demo = new StaticDemo();
		demo = new StaticDemo();
		demo = new StaticDemo();
		StaticDemo.printToConsole();
	}

}
