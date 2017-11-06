package org.avco.exceptions;

public class ApplicationException extends Exception {

	// ERROR CODE : MESSAGE
	//001 : INVALID USER NAME.
	
	private String errorCode;
	
	public ApplicationException(String errorCode, String errorMessage){
		super(errorMessage);
		this.errorCode = errorCode;
	}
	
	public String getMessage(){
		return this.errorCode + ":" + super.getMessage();
	}
}
