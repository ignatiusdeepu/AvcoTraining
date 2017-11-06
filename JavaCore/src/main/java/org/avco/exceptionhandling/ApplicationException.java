package org.avco.exceptionhandling;

public class ApplicationException extends Exception {

	private String errorCode;
	
	public ApplicationException(String message,String errorCode){
		super(message);
		this.errorCode = errorCode;
	}
	
	@Override
	public String getMessage(){//100:Invalid File
		return this.errorCode+":"+super.getMessage();
	}
}
