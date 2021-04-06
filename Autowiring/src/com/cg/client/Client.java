package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.entity.Employee;

public class Client
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e=(Employee) context.getBean("emp");
		e.display();
	}

}
