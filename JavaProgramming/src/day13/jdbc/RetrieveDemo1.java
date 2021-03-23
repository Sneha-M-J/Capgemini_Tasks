package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDemo1
{
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
			//1. Statement example
//			Statement stmt=oracleconn.createStatement();
//			ResultSet rs=stmt.executeQuery("select * from employee where id=1");
//			
			//2.PreparedStatement Example
			PreparedStatement ps=oracleconn.prepareStatement("select * from employee where id='?");
			ps.setInt(1, 2);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			}
			
		}
		catch(Exception e)
		{
			
		}
	}

}
