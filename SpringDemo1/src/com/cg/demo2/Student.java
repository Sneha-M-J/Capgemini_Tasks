package com.cg.demo2;

public class Student 
{
	int id;
	String name;
	
	//parameterised constructor for constructor injection
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void displayDetails()
	{
		System.out.println("id "+ id);
		System.out.println("name "+ name);
	}

}
