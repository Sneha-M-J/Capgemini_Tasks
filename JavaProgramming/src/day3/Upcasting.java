package day3;

class Bank
{
	void rateOfInterest()
	{
		System.out.println("Not yet assigned");
	}
}
class Sbi extends Bank
{
	void rateOfInterest()
	{
		System.out.println("Sbi 4%");
	}
	void offer()
	{
		System.out.println("Sbi Offer");
	}
}
class Axis extends Bank
{
	void rateOfInterest()
	{
		System.out.println("Axis 6%");
	}
}


public class Upcasting 
{
	public static void main(String[] args) 
	{
		Bank s=new Sbi(); //upcasting
		//parent reference variable, child object 
		s.rateOfInterest();
		//s.offer();   
		//gives error because offer is not defined in parent class and we have given parent reference variable
		
		Sbi sb=new Sbi();
		sb.rateOfInterest();
		sb.offer();
		
		Bank a=new Axis(); //upcasting
		a.rateOfInterest();
	}

}
