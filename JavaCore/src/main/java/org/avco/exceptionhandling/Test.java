package org.avco.exceptionhandling;

import java.io.File;
import java.io.IOException;

import org.avco.constructor.User;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			User user = new User();
			user.setLastName("fsdhga");
			validateUser(user);
			File file = new File("");
			file.createNewFile();
			System.out.println(" file is created");
			System.out.println(" file is created");
			System.out.println(" file is created");
			System.out.println(" file is created");
			System.out.println(" file is created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}/*catch(ApplicationException e){
			System.out.println();
		}*/ catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			System.out.println(" file is created");
		}
		System.out.println(" Completed try .. catch statements...");
	}

	public static boolean validateUser(User obj) throws ApplicationException{
		//try{
		System.out.println(obj.getLastName());
		User test = new User();
		obj = test;
			if(obj.getFirstName()==null){
				throw new ApplicationException("First Name is null", "100");
			}
		/*}catch(ApplicationException e){
			
		}*/
		return false;
	}
}
