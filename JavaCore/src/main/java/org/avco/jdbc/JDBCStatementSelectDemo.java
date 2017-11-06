package org.avco.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatementSelectDemo {
	
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
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		//1. Load the driver.
		try {
			
			Class.forName("com.mysql.jdbc.Driver");  
			
			//2. Obtain the connection.
			connection=DriverManager.getConnection(url,"root","");
			//3. Create a statement.
			preparedStatement = connection.prepareStatement("select * from employee where ssn=? ");
			preparedStatement.setString(1, "123456789");
			//4. execute the statement.
			resultSet = preparedStatement.executeQuery();
			//5.Iterate thru the resultset.
			while(resultSet.next()){
				System.out.println(resultSet.getString("FIRST_NAME"));
			}
			//6. finally close the resources.
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				try {
					if(resultSet!=null){
						resultSet.close();
					}
					if(preparedStatement!=null){
						preparedStatement.close();
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
