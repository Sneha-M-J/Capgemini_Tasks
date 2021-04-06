package com.example2.dao;

public class JPAClass implements daoInterface {

	@Override
	public void connect()
	{
		System.out.println("I am connecting through JPA");
	}

}
