package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentDeleteDemo 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		//to delete the values of student with id 3
		Student stu=em.find(Student.class,3);   
		if(stu!=null)  //if id found
		{
			System.out.println("Before delete");
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			System.out.println(stu.getDept());
			em.remove(stu);    //delete student with id 3
		}
		else   //if id not found
		{
			System.out.println("No value found");
		}
		
		em.getTransaction().commit();
	}

}
