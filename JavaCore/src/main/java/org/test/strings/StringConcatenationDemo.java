package org.test.strings;

public class StringConcatenationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("abc");//1000
		str+="efg";//2000
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append("efg");
		System.out.println(sb.toString());
	}

}
