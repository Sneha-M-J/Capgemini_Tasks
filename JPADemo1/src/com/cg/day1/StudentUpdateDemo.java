package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentUpdateDemo 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		//to update the values of student with id 1
		Student stu=em.find(Student.class,1);   
		if(stu!=null)  //if id found
		{
			System.out.println("Before update");
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			System.out.println(stu.getDept());
			stu.setName("sachin");  //updates the values and permanently changes in the database
			stu.setDept("developer");
			System.out.println("After update");
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			System.out.println(stu.getDept());
		}
		else   //if id not found
		{
			System.out.println("No value found");
		}
		
		em.getTransaction().commit();
	}

}
