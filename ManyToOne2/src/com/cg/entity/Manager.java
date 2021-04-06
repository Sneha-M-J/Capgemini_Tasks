package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager73")
public class Manager
{
	@Id
	private int manId;
	private String name;
	private String dept;
	public int getManId() {
		return manId;
	}
	public void setManId(int manId) {
		this.manId = manId;
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
	
	
	
}
