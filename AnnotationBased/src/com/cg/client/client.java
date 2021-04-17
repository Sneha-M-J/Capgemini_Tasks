package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.service.ServiceImpl;

public class client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	    context.scan("com.cg");
	    context.refresh();
	    
	   ServiceImpl ser=(ServiceImpl) context.getBean("serviceImpl");
	   ser.mydisplay();
	
	}

}
