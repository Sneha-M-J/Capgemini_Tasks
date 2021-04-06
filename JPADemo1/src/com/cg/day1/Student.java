package com.cg.day1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity  //annotation that tells the class can persist
@Table(name="student30")  //maps to student30 table
//if not mentioned, it maps to Student table (same as class name)

@NamedQuery(name="findAll",query="select s from Student s")
//to have multiple named queries use below syntax
@NamedQueries
    (
		{
			@NamedQuery(name="findAllObject",query="select s from Student s"),
			@NamedQuery(name="findById", query="select s from Student s where s.id= :id")  //to get id in runtime use :id
		}
	)
public class Student
{
	@Id    //identifies unique values
	private int id;
	private String name;
	private String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
