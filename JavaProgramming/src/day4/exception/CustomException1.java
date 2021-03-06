package day4.exception;

/*
//Unchecked Exception
class LateException extends RuntimeException
{
	public LateException(String msg)
	{
		super(msg); //pass message to runtime exception
	}
}
class Employee
{
	public void login(int time)
	{
		if(time<=9)
		{
			System.out.println("You are present");
		}
		else
		{
			throw new LateException("you are absent");
		}
	}
}

public class CustomException1 
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.login(10);
	}

}
*/



//CheckedException -> extends only Exception and throws is used 
//with login() and main() 
class LateException extends Exception
{
	public LateException(String msg)
	{
		super(msg); //pass message to runtime exception
	}
}
class Employee
{
	public void login(int time) throws LateException
	{
		if(time<=9)
		{
			System.out.println("You are present");
		}
		else
		{
			throw new LateException("you are absent");
		}
	}
}

public class CustomException1 
{
	public static void main(String[] args) throws LateException
	{
		Employee emp=new Employee();
		try
		{
		emp.login(10);
		}
		catch(LateException e)
		{
			System.out.println(e);
		}
	}

}
