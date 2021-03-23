package day14.designPattern;

class Employee
{
	private static final Employee emp=new Employee();  //only 1 object is created
	private Employee() //constructor is private so we cannot write Employee emp=new Employee() in SingletonPattern class
	{
		System.out.println("this is employee constructor");
	}
	public static Employee getEmployeeInstance()
	{
		return emp;
	}
}

public class SingletonPattern
{
	public static void main(String[] args) 
	{
		//both e1 and e2 refer to same object (they have same hashcode value)
		Employee e1=Employee.getEmployeeInstance();
		System.out.println(e1.hashCode());
		
		Employee e2=Employee.getEmployeeInstance();
		System.out.println(e2.hashCode());
		
	}

}
