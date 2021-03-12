package day3;

class Person
{
	int id;
	String name;
	int age;
	void view()
	{
		System.out.println("This is Parent view"); 
	}
}

class Cricketer extends Person
{
	String role;
	void display()
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("role "+role);
	}
}

/*
//Multilevel
class Student extends Person
{
	String dept;
}
class Manager extends Person
{
	int mId;
}
*/

public class InheritanceDemo 
{
	public static void main(String[] args) 
	{
		Cricketer c=new Cricketer();
		c.id=1;
		c.name="abc";
		c.age=46;
		c.role="batsman";
		c.view();
		c.display();
	}
}
