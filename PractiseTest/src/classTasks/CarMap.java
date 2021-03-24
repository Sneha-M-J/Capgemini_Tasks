package classTasks;

/*
Create a class called Car with the following data members:
id->int, company->String, color->String. Make these members private and use a public constructor to initialize the values.
Create a hashmap to store keys of type car and values of double to hold the price of the car.
1) Access the key value pairs using,
i) keySet()
ii) values()
iii) entrySet()
2) Print details of the car which is black colored.
3) Update the price of Renault Duster by 10% of its actual price.
 */

import java.util.*;
class Car
{
	private int id;
	private String company;
	private String color;
	public Car(int id, String company, String color) {
		super();
		this.id = id;
		this.company = company;
		this.color = color;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", color=" + color + "]";
	}
}
public class CarMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Car, Double> map = new HashMap<>();
		map.put(new Car(1, "Mercedes Benz", "Black"), 6278000.00);
		map.put(new Car(2, "Audi", "Red"), 3500000.00);
		map.put(new Car(3, "Renault Duster", "Orange"), 849000.00);
		System.out.println(map);
		System.out.println("=========================To access keys using keySet()==================================");
		for(Car key : map.keySet())
		{
			System.out.println(key);
		}
		System.out.println("=========================To get values using values()==================================");
		for(Double value : map.values())
		{
			System.out.println(value);
		}
		System.out.println("=========================Using entrySet()==================================");
		for(Map.Entry<Car, Double> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("To print details of the car which is black colored");
		for(Car key : map.keySet())
		{
			if(key.getColor().equalsIgnoreCase("black"))
			{
				System.out.println("Car name = "+key.getCompany()+" and car color = "+key.getColor());
			}
		}
		for(Map.Entry<Car, Double> entry : map.entrySet())
		{
			if(entry.getKey().getCompany().equalsIgnoreCase("Renault Duster"))
			{
				entry.setValue(entry.getValue() * 1.1);
				System.out.println("New price of renault duster = "+entry.getValue());
			}
		}
	}

}