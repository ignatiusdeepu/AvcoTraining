package org.avco.module2.enums;

public enum LevelTwo {

	HIGH (3,"H"), MEDIUM (2,"M"), LOW (1,"L");
	
	private final int levelCode;
	private String code;
	
	private LevelTwo(int levelCode,String code){
		this.levelCode = levelCode;
		this.code = code;
	}
	
	public int getLevelCode(){
		return this.levelCode;
	}
	
	public String getCode(){
		return this.code;
	}
}
