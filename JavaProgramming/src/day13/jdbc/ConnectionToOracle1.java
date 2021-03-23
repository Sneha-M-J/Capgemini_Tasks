package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionToOracle1 {

	public static void main(String[] args) 
	{
		try 
		{
			//step-1
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			System.out.println("class found");
			
			//step-2
			Connection oracleconn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "demo", "sneha");
			System.out.println("connected");
			
			//step-3
			Statement stmt=oracleconn.createStatement();
			stmt.execute("insert into employee values(2,'sachin','developer',48000.02)");
			System.out.println("inserted");		
			
		}
		//catch(ClassNotFoundException | SQLException e)
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Class not found");
		}
	}

}
