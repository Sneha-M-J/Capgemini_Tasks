package lab5.com.cg.eis.exception;

/*
class EmployeeException extends RuntimeException
{
	public EmployeeException(String msg)
	{
		super(msg);
	}
}

class EmployeeSal
{
	public void validateSalary(int sal)
	{
		if(sal<3000)
		{
			throw new EmployeeException("Salary is below 3000");
		}
		else
		{
			System.out.println("Salary is above 3000");
		}
	}
}

public class Exercise3
{
	public static void main(String[] args) 
	{
		EmployeeSal es=new EmployeeSal();
		es.validateSalary(2000);
	}
}
*/

class EmployeeException extends Exception
{
	public EmployeeException(String msg)
	{
		super(msg);
	}
}

class EmployeeSal
{
	public void validateSalary(int sal) throws EmployeeException
	{
		if(sal<3000)
		{
			throw new EmployeeException("Salary is below 3000");
		}
		else
		{
			System.out.println("Salary is above 3000");
		}
	}
}

public class Exercise3
{
	public static void main(String[] args) throws EmployeeException
	{
		EmployeeSal es=new EmployeeSal();
		try
		{
			es.validateSalary(2000);
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}
}