package day3;

class Bank2
{
	void rateofInterest()
	{
		System.out.println("1%");
	}
	static void display()
	{
		System.out.println("Parent class");
	}
}

class SbiBank extends Bank2
{
	void rateofInterest()
	{
		System.out.println("5%");
	}
	static void display()
	{
		System.out.println("Sbi class");
	}
}

class Kotak extends Bank2
{
	void rateofInterest()
	{
		System.out.println("6%");
	}
}

public class OverRiding1 
{
	public static void main(String[] args) 
	{
		Bank2 obj=new SbiBank();
		obj.rateofInterest();  //called from child class
		obj.display();   //called from parent class
		//static keyword does'nt allow to override 
	}

}
