package lab5;

/*
//Unchecked Exception
class AgeException extends RuntimeException
{
	public AgeException(String msg)
	{
		super(msg);
	}
}

class Person
{
	public void validateAge(int age)
	{
		if(age<15)
		{
			throw new AgeException("Age should be above 15");
		}
		else
		{
			System.out.println("Age is fine");
		}
	}
}

public class Exercise1 
{
	public static void main(String[] args) 
	{
		Person p=new Person();
		p.validateAge(10);
	}
}
*/


//checked Exception
class AgeException extends Exception
{
	public AgeException(String msg)
	{
		super(msg);
	}
}

class Person
{
	public void validateAge(int age) throws AgeException
	{
		if(age<15)
		{
			throw new AgeException("Age should be above 15");
		}
		else
		{
			System.out.println("Age is fine");
		}
	}
}

public class Exercise1 
{
	public static void main(String[] args) throws AgeException
	{
		Person p=new Person();
		try
		{
			p.validateAge(10);
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}
}