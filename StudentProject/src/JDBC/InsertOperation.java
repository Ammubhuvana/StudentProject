package JDBC;
import java.sql.*;
import java.util.Scanner;

public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter USER ID:");
			String userid=sc.nextLine();
			System.out.println("Enter FIRST NAME:");
			String firstname=sc.nextLine();
			System.out.println("Enter LAST NAME:");
			String lastname=sc.nextLine();
			System.out.println("Enter MOBILE_NO:");
			String mobileno=sc.nextLine();
			System.out.println("Enter CITY:");
			String city=sc.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","Ammu@1704");
			PreparedStatement pst=connect.prepareStatement("insert into user(USER_ID,FIRST NAME,LAST NAME,MOBILE_NO,CITY)values(?,?,?,?,?)");
			
			

			pst.setString(1,userid);
			pst.setString(2,firstname);
			pst.setString(3,lastname);
			pst.setString(4,mobileno);
			pst.setString(5,city);
			int i=pst.executeUpdate();
		
			if(i!=0) {
				System.out.println("added");
				
			}
			else {
				System.out.println("failed");
			}
		}
			catch(Exception e) {
			System.out.println(e);
		}

	}

}
