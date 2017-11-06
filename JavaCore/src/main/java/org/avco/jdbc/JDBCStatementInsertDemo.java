package org.avco.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatementInsertDemo {
	

	
	//ORACLE
		//private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		//MYSql
		private static String url = "jdbc:mysql://localhost:3306/avcoconsulting";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String ssn="2322";
		//1. Load the driver.
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			
			//2. Obtain the connection.
			connection=DriverManager.getConnection(url,"root","");
			
			StringBuffer sb = new StringBuffer("INSERT INTO EMPLOYEE(ID,FIRST_NAME,LAST_NAME,ssn)");
			sb.append(" VALUES (").append("3,").append("'Tim',").append("'Cook',").append("'09223798'").append(")");
			
			
			//3. Create a statement.
			statement = connection.createStatement();

			//4. execute the statement.
			int i = statement.executeUpdate(sb.toString());
			//5.Iterate thru the resultset.
				System.out.println(" No of records inserted "+i);
			//6. finally close the resources.
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				try {
					/*if(resultSet!=null){
						resultSet.close();
					}*/
					if(statement!=null){
						statement.close();
					}
					if(connection!=null){
						connection.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}



}
