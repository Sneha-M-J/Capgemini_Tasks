package com.cg.entity;

public class WithOutSpring
{
	public static void main(String[] args) 
	{
		//Without Spring we should create object, setters and getters
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("sneha");
		System.out.println(e1.getId());
		System.out.println(e1.getName());

	}

}
