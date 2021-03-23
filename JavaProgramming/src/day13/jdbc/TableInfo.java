package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TableInfo
{
	public static void main(String[] args) 
	{
		try 
		{
			//step-1
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			System.out.println("driver class loaded");
			
			//step-2
			Connection oracleconn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "demo", "sneha");
			System.out.println("connected");
			
			//step-3
			Statement stmt=oracleconn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from register");
			ResultSetMetaData rsm=rs.getMetaData();
			System.out.println(rsm.getColumnCount());
			System.out.println(rsm.getColumnName(1));
			System.out.println(rsm.getColumnName(2));
			System.out.println(rsm.getColumnName(3));
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Class not found");
		}
	}

}
