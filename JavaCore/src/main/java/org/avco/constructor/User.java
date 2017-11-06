package org.avco.constructor;


public class User {

	private String firstName;
	private String lastName;
	private String ssn;
	

	public User(){
		
	}


	public String getFirstName() {
		return firstName;
	}


	private void setFirstName(String firstName) {
		this.firstName = firstName;
		setSsn(firstName);
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.setFirstName("aksjk");
		this.lastName = lastName;
	}


	public String getSsn() {
		return ssn;
	}


	 void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	/*public User(String firstName,String lastName,String ssn){
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public User(String firstName,String ssn){
		this.firstName = firstName;
		this.ssn = ssn;
	}
	
	public User(String ssn){
		this.ssn = ssn;
	}*/
	
	
}
