package org.avco.arrays;

import org.avco.constructor.User;

public class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = new int[3];
		/*for(int k = 0; k<4;k++){
			i[k]=k;
		}*/
		
		User[] users = new User[3];
		
		for(int k = 0; k<4;k++){
			users[k] = new User();
			users[k].setLastName("test");
		}
	}

}
