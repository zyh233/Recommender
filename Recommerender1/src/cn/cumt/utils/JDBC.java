package cn.cumt.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
	public static Statement statement;
	static{
		String url="jdbc:mysql://localhost/project";
		String user="root";
		Connection connection = null;
		String password="987654abc";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			try{
			  connection=DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {				
				e.printStackTrace();
			}
			
			try {
				 statement=connection.createStatement();
			} catch (SQLException e) {				
				e.printStackTrace();
			}												
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
}
