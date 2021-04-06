package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.AppConfig;
import com.cg.entity.Employee;

public class AppClient {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp =(Employee)context.getBean("e");
		System.out.println(emp.getId() +" "+ emp.getName());
		
		System.out.println("==========");
		
		Employee emp1 =(Employee)context.getBean("e1");
		emp1.setId(2);
		emp1.setName("kumar");
		System.out.println(emp1.getId() +" "+ emp1.getName());
		
		System.out.println("=============");
		
		Employee emp2 = (Employee)context.getBean("e2");
		emp2.display();
		
	}

}
