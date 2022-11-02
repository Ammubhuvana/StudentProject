package JDBC;
//import packages

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class DBConnectivity {
	//writing create query in string
	private static final String CREATE_TABLE="create table user("+"user_id int not null,"+"First_name varchar(20),"+"Last_name varchar(20),"
			+"Mobile_no bigint,"+"city varchar(30),"+"primary key(user_id))";
		
	public static void main(String[] args)throws ClassNotFoundException  {
	// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false";//writing url from mysql
		String username="root";//username of sql
		String passwd="Ammu@1704";//keyword of username
		Connection connect=null;//declaration connection
		PreparedStatement statement=null;//creating prepared statement
		Class.forName("com.mysql.cj.jdbc.Driver");//regarding driver class
		try//acting as shield program 
		{
			connect=DriverManager.getConnection(url,username,passwd);//establishing connectivity to java database server
			statement=connect.prepareStatement(CREATE_TABLE);//interprets sql query
			statement.executeUpdate();
			System.out.println("Table created");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(statement!=null) {
					statement.close();
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
          
	}

}
