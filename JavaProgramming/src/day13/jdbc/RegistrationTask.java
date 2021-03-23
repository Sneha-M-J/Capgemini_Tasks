package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RegistrationTask 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
//		System.out.println("press 1.login  2.register");
//		System.out.println("Enter your choice");
//		int choice=sc.nextInt();
//		
		System.out.println("Enter username");
		String uname=sc.nextLine();
		System.out.println("Enter pssword");
		String pass=sc.nextLine();
		try 
		{
			//step-1
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			System.out.println("class found");
			
			//step-2
			Connection oracleconn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "demo", "sneha");
			System.out.println("connected");
			
			//step-3
			PreparedStatement ps=oracleconn.prepareStatement("select * from register where username=? and password=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			int temp=0;
			while(rs.next()) 
			{
				temp=1;
			}
			if(temp==1)
				System.out.println("logged in");
			else 
				System.out.println("Invalid user, not yet logged in");

			
			
//			//step-3
//			
//			String uname=sc.nextLine();
//			String pass=sc.nextLine();
//			String desig=sc.nextLine();
//			
//			PreparedStatement ps=oracleconn.prepareStatement("insert into register values(?,?,?)");
//		    ps.setString(1,uname);
//		    ps.setString(2,pass);
//		    ps.setString(3,desig);    
//		    ps.execute();
//			System.out.println("Inserted");
			
			oracleconn.close();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Class not found");
		}
	}

}
