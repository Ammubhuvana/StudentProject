package JDBC;
import java.sql.*;

public class CallableStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false","root","Ammu@1704");
			Statement s=con.createStatement();
			CallableStatement cs=con.prepareCall("{call get_user()}"); 
		
			cs.execute();
			ResultSet result=cs.executeQuery();
			while(result.next()) {
				System.out.println("user_id: "+result.getString(1)+ " First_name:" +result.getString(2));
				
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
