package com.cg.demo3;

import java.util.List;

public class Fruit
{
	List fruitNames;

	public void setFruitNames(List fruitNames) {
		this.fruitNames = fruitNames;
	}
	
	void display()
	{
		System.out.println("fruit names : "+fruitNames);
	}
}
