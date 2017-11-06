package org.avco.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUpdateDemo {


	
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
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		//1. Load the driver.
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
		
			Class.forName("com.mysql.jdbc.Driver");  
			
			//2. Obtain the connection.
			connection=DriverManager.getConnection(url,"root","");
			//3. Create a statement.
			statement = connection.prepareStatement("DELETE from EMPLOYEE where ID=?");
			statement.setInt(1, 4);
			//4. execute the statement.
			int i = statement.executeUpdate();
			//6. finally close the resources.
			System.out.println(" No of rows deleted : "+i);
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
