package org.avco.exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandlingDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// 
		
		File file = new File("");
		String str = "";
		/*if(str.equals("")){
			System.out.println("equal");
		}*/
		/*boolean isFileCreated = false;
		
		try {
			if(str.equals("")){
				System.out.println("equal");
			}
			file.createNewFile();
			System.out.println("File created1.");
			System.out.println("File created2.");
			System.out.println("File created3.");
			System.out.println("File created4.");
			System.out.println("File created5.");
			isFileCreated = true;
		}catch (IOException e) {
			System.out.println(" An Exception occured in class ExceptionHandlingDemo method main reason is : " + e.getMessage());
			isFileCreated = false;
			file = new File("c:\\avco123.txt");
		}catch(Exception e){
			System.out.println(e.getMessage());
			isFileCreated = true;
		}finally{
			System.out.println(" File Creation successful. ");
			System.out.println("File created3.");
			System.out.println("File created4.");
			System.out.println("File created5.");
		}*/
		try{
			validateAge(12);
		}catch(Exception  e){
			System.out.println(e.getMessage());
		}
		System.out.println(" Completed file");
	}

	
	public static boolean validateAge(int age) throws Exception{
		if(age <20){
			throw  new ApplicationException("002", "Invalid Age");
		}
		
		return true;
		/*
		String userName = "test1";
		String password = "test";
		try{
		if("test".equals(userName) && "test".equals(password)){
			System.out.println(" Hello World!!");
		}else{
			throw new ApplicationException("001", "Invalid User");
		}
		}catch(ApplicationException e){
			System.out.println(e.getMessage());
		}*/
	}
}
