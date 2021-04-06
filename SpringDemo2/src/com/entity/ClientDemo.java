package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Restaurant res=(Restaurant) context.getBean("r");
		res.displayRestaurantDetails();
	}

}
