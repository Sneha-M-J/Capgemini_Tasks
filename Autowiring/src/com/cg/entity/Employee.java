package com.cg.entity;

public class Employee 
{
	String name;
	Address addr;  //reference name (it should be same as bean/object name in .xml file)
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	public void display()
	{
		System.out.println("Name : "+name);
		addr.myaddressMethod();
	}

}
