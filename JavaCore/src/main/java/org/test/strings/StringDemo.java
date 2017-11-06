package org.test.strings;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String str ="abc"; // an internal memory pool --1000
		String str1 = new String("abc"); // heap -- 2000
		String str2 = "abc";//address -- 1000
		String str3 = new String("abc");// heap -- 3000

		if(str==str2){
			System.out.println("str==str2");
		}else{
			System.out.println("str!=str2");
		}
		if(str==str1){
			System.out.println("str==str1");
		}else{
			System.out.println("str!=str1");
		}
		if(str.equals(str1) ){
			System.out.println("str.equals(str1) ");
		}else{
			System.out.println("!str.equals(str1) ");
		}
		if(str1 == str3 ){
			System.out.println("str1 == str3 ");
		}else{
			System.out.println("!str1 == str3  ");
		}
	}

}
