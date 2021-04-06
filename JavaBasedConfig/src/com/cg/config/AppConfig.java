package com.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.entity.Address;
import com.cg.entity.Employee;

/*
 * It is similar to writing xml file
 */


@Configuration
public class AppConfig {
	
	@Bean(name = "e")
	public Employee getEmployee()
	{
		return new Employee(1, "ravi");
	}
	
	@Bean(name="e1")
	public Employee getEmployee1()
	{
		return new Employee();
	}

	@Bean(name="a")
	public Address getAddress()
	{
		return new Address();
	}
	
	@Bean(name="e2")
	public Employee getEmployee2()
	{
		Employee e = new Employee();
		e.setAd(getAddress());
		return e;
	}
}
