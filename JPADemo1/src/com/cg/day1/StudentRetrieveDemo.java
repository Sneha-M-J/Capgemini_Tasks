package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRetrieveDemo
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		//find searches the student class for id 1
		//find takes 2 parameters(class_name, primaryKey Column value)
		Student stu=em.find(Student.class,1);   //display values of student with id 1
		//Student stu=em.find(Student.class,10);   //displays "no value found"
		
		if(stu!=null)  //if id found
		{
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			System.out.println(stu.getDept());
		}
		else  //if id not found
		{
			System.out.println("No value found");
		}
		
		em.getTransaction().commit();
	}

}
