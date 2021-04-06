package com.example2.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example2.service.MyService;

public class DAOClient 
{
	//Question (Solve using Layered Architecture)
	//dao layer : 
	//create a daoInterface and declare a method connect(). 
	//create 2 classes JDBCClass and JPAClass which will implement daoInterface and override connect().
	
	//service layer : 
	//create a ServiceInterafce consisting of an abstract method viewWhichWay(). 
	//create MyService class (Base class) which implements ServiceInterafce and overrides viewWhichWay() (calls connect())
	
	//client layer :
	//create a DAOClient class which calls the methods
	
	//create a applicationContext.xml file 
	
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextExample2.xml");
		MyService ms=(MyService) context.getBean("ser");
		ms.viewWhichWay();
	}

}
