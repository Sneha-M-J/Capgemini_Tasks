package day13.jdbc;

public class ConnectionToOracle 
{
	public static void main(String args[]) 
	{
		//checks if class is present or not during compile time
		//Employee e=new Employee();
		
		//checks if class is present or not during runtime
		try 
		{
			Class.forName("day13.jdbc.Employee");   //give complete proper path
			Class.forName("Employee");          //gives error
			System.out.println("class found");
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Class not found");
		}
	}
}
