package org.avco.constructor;


public class User {

	private String firstName ;
	private String lastName;
	private String ssn;

	public User(){
		
	}

	public User(String firstName,String lastName,String ssn){
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return this.firstName;
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

	public void setSsn(String ssn) {
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
