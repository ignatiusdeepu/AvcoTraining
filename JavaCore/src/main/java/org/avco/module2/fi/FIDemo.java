package org.avco.module2.fi;

public class FIDemo {

	public static void main(String[] args) {
		StringProcessor processor = (str) -> str.length();
		int length = processor.getStringLength("Hello");
		System.out.println(length);
	}

}
