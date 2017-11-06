package org.avco.module2.enums;

public enum LevelTwo {

	HIGH (3),
	MEDIUM (2),
	LOW (1);
	
	private final int levelCode;
	
	private LevelTwo(int levelCode){
		this.levelCode = levelCode;
	}
	
	public int getLevelCode(){
		return this.levelCode;
	}
}
