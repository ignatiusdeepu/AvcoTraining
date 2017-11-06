package org.avco.generics;

public class DrawGenericMulti<T,X> {

	private T shape1;
	private X shape2;
	
	public DrawGenericMulti(T shape1,X shape2){
		this.shape1 = shape1;
		this.shape2 = shape2;
	}

	public T getShape1() {
		return shape1;
	}

	public void setShape1(T shape1) {
		this.shape1 = shape1;
	}

	public X getShape2() {
		return shape2;
	}

	public void setShape2(X shape2) {
		this.shape2 = shape2;
	}
	
	
	
}
