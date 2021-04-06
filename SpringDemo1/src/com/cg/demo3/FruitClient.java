package com.cg.demo3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class FruitClient 
{
	public static void main(String[] args) 
	{
		//2approaches of IOC are :
		//1.using IOC-Application Context
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextDemo3.xml");
	    Fruit fr=(Fruit)context.getBean("f");
	    fr.display();
	    
	    //2.using IOC-Bean Factory
	    Resource resource=new ClassPathResource("applicationContextDemo3.xml");
	    BeanFactory context2=new XmlBeanFactory(resource);
	    Fruit fr2=(Fruit)context2.getBean("f");
	    fr2.display();
	}

}
