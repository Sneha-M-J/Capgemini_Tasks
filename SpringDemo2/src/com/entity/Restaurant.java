package com.entity;

public class Restaurant 
{
	//Question :
	//create 2 interfaces- HotDrink and SoftDrink with one abstract method drink()
    //create 2 classes tea and coffee which implements HotDrink interface and overrides drink()
	//create 2 classes pepsi and sprite which implements SoftDrink interface and overrides drink()
	//create a Restaurant class (Base class) as below
	//have an applicationContext.xml file to set values respectively
	//create a clientDemo class to display the result(call displayRestaurantDetails())
	
	HotDrink hotDrink;
	SoftDrink softDrink;
	String restaurantName;
	
	public void setHotDrink(HotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	public void setSoftDrink(SoftDrink softDrink) {
		this.softDrink = softDrink;
	}
	
	void displayRestaurantDetails()
	{
		System.out.println("Restaurant name : "+restaurantName);
		hotDrink.drink();
		softDrink.drink();
	}
}
