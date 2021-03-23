package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ParameterizedQuery {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id : ");
			int id=sc.nextInt();
			//similarly take user input for all data
			//step-1
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			System.out.println("class found");
			
			//step-2
			Connection oracleconn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "demo", "sneha");
			System.out.println("connected");
			
			//step-3
			PreparedStatement ps=oracleconn.prepareStatement("insert into employee values(?,?,?,?)");
		    ps.setInt(1, id);
		    ps.setString(2, "kumar");
		    ps.setString(3, "manager");
		    ps.setDouble(4,34000.10);
		    
		    ps.execute();
			System.out.println("Inserted");
			
			
		}
		//catch(ClassNotFoundException | SQLException e)
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Class not found");
		}
	}

}
