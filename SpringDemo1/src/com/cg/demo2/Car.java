package com.cg.demo2;

public class Car 
{
	Engine engine;  //only reference is declared, but object is not created
	int manufactureYear;
	
	//setters for setter injection
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}


	void display()
	{
		engine.engineType();
		System.out.println("manufacture year : "+manufactureYear);
		
	}
	
}
