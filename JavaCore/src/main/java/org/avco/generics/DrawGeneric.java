package org.avco.generics;

public class DrawGeneric<T> {
	
	private T shape;
	
	public DrawGeneric(T shape){
		this.shape = shape;
	}
	
	public T getShape() {
		return shape;
	}

	public void setShape(T shape) {
		this.shape = shape;
	}

}
