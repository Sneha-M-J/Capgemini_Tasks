package PracticeTest1;

class EmpException extends RuntimeException
{
	public EmpException(String msg)
	{
		super(msg);
	}
}

class Employee
{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void validation()
	{
		if(firstName==null && lastName==null)
		{
			throw new NullPointerException("Entry Missing");
		}
		else if((firstName.length()<3)||(lastName.length()<3))
		{
			throw new EmpException("Name should be minimum 3 characters");
		}
		else
		{
			System.out.println("Name is valid");
		}
	}
	
}

public class Third 
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee("sneha","MJgth");
		emp.validation();
	}

}
