package com.cg.demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientDemo2
{
	public static void main(String[] args) 
	{
		Resource resource=new ClassPathResource("applicationContextDemo2.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		//eg of setter injection
		Car car=(Car) factory.getBean("c");
		car.display();
		
		//eg of constructor injection
		Student stu=(Student) factory.getBean("s");
		stu.displayDetails();
	}

}
