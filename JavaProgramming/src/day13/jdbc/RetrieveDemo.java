package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDemo 
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
			Statement stmt=oracleconn.createStatement();
			ResultSet rs=stmt.executeQuery("select *from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			
			
			
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
