package com.cg.entity;

public class Employee {

	int id;
	String name;
	Address ad;
	
	
	
	
	
	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public Employee()
	{
		
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		ad.myaddressMethod();
	}
	
	
}
