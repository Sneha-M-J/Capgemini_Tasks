package day2;

/*
// 1. Default constructor
class Employee
{
	int id;
	String name;
	
	void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}

public class DefaultCons 
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.display();
	}
}

//Output
//Id : 0
//Name : null
*/





/*
// 2. Constructor
class Employee
{
	int id;
	String name;
	
	Employee()
	{
		System.out.println("This is constructor");
	}
	
	void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}

public class DefaultCons 
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.display();
	}
}

//Output
//Id : 0
//Name : null
*/





/*
// 3. Constructor
class Employee
{
	int id;
	String name;
	
	void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}

public class DefaultCons 
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.id=100;
		e1.name="Sachin";
		e1.display();
	}
}

//Output
//Id : 100
//Name : Sachin
*/





/*
// 4. Parameterized Constructor
class Student
{
	int id;
	String name;
	Student()
	{
		System.out.println("Default");
	}
	Student(int a, String b)
	{
		System.out.println("Id : "+a);
		System.out.println("Name : "+b);
	}
}

public class DefaultCons 
{
	public static void main(String args[])
	{
		Student s1=new Student(200,"Srujan");
	}
}

//Output
//Id : 200
//Name : Srujan
*/





// 5. Parameterized constructor
class Student
{
	int id;
	String name;
	Student()
	{
		System.out.println("Default");
	}
	Student(int a, String b)
	{
		System.out.println("Id : "+a);
		System.out.println("Name : "+b);
	}
}

public class DefaultCons 
{
	public static void main(String args[])
	{
		Student s1=new Student(200,"Srujan");
	}
}
