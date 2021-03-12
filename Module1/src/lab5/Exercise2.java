package lab5;

/*
//Unchecked exception
class NameException extends RuntimeException
{
	public NameException(String msg)
	{
		super(msg);
	}
}
class Name
{
	public void validateName(String fname,String lname)
	{
		if(fname==null && lname==null)
		{
			throw new NameException("Firstname and LastName cannot be blank");
		}
		else
		{
			System.out.println("Full name is validated");
		}
	}
}

public class Exercise2 
{
	public static void main(String[] args)
	{
		Name na=new Name();
		na.validateName("Sneha",null);
		
		Name n=new Name();
		n.validateName(null,null);
	}
}
*/


//checked Exception
class NameException extends Exception
{
	public NameException(String msg)
	{
		super(msg);
	}
}

class Name
{
	public void validateName(String fname, String lname) throws NameException
	{
		if(fname==null && lname==null)
		{
			throw new NameException("Firstname and LastName cannot be blank");
		}
		else
		{
			System.out.println("Full name is validated");
		}
	}
}
	
public class Exercise2 
{
	public static void main(String[] args) throws NameException
	{
		Name n=new Name();
		try
		{
			n.validateName(null, null);
		}
		catch(NameException e)
		{
			System.out.println(e);
		}
	}
}
		