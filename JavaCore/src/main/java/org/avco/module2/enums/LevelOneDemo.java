package org.avco.module2.enums;

public class LevelOneDemo {

	public static void main(String[] args) {
		LevelOne levelOne = LevelOne.HIGH;
		System.out.println(levelOne);
		
		String str = new String("");
		
		switch(levelOne){
			case  LOW : System.out.println(levelOne);
			case  MEDIUM : System.out.println(levelOne);
			case  HIGH : System.out.println(levelOne);
		}
		
		for(LevelOne l1 :LevelOne.values()){
			System.out.println(l1);
		}
	}

}
