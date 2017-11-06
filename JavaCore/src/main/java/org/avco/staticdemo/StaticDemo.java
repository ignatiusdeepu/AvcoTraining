package org.avco.staticdemo;

public class StaticDemo {
	
	static String str = null;
	static{
		str = new String("Avco");
	}

	public static int i;
	
	public StaticDemo(){
		i++;
	}
	
	public static void printToConsole(){
		System.out.println(str);
		System.out.println(" NO of instances :"+i);
	}
	
}
