package day6.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	String name;
	//static String name;  //static means variable will not be serialized
	transient int age;
	
	public Employee(int id, String name,int age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age=age;
	}
	
}
public class SerilizationDemo 
{
	public static void main(String[] args) throws IOException 
	{
		Employee emp=new Employee(1,"Sneha",25);
		FileOutputStream fis=new FileOutputStream("four.txt");
		ObjectOutputStream ois=new ObjectOutputStream(fis);
		ois.writeObject(emp);
		ois.flush();
		ois.close();
		System.out.println("Serilization completed.. ");
	}
}
