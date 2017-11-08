package org.avco.exceptionhandling;

public class ApplicationException extends Exception {

	private String errorCode;
	
	public ApplicationException(String msg,String errorCode){
		super(msg);
		this.errorCode = errorCode;
	}
	
	@Override
	public String getMessage(){//100:Invalid File
		return this.errorCode+":"+super.getMessage();
	}
}
