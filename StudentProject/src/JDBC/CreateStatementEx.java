package JDBC;
import java.sql.*;


public class CreateStatementEx {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://company?autoReconnect=true&useSSL=false","root","Ammu@1704");
			
			Statement statement =con.createStatement();
			String sql="select*from user";
			
			ResultSet result=statement.executeQuery(sql);
			
			while(result.next()) {
				System.out.println("ID:"+result.getInt(1));
				
				System.out.println("City:"+result.getString(2));
				
			}
			
		}
		catch(SQLException e) {
			System.out.println(e);
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	
	}

}
