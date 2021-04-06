package com.cg.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class clientDemo1 
{
	public static void main(String[] args) 
	{
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee emp=(Employee)factory.getBean("e1");
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		
	}

}
