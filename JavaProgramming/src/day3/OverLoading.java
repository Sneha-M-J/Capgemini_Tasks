package day3;

class Shopping
{
	void search(int modelNumber)
	{
		System.out.println("Your Searching with modelNumber "+modelNumber);		
	}
	void search(String brandName)
	{
		System.out.println("Your Searching with BrandName "+brandName);	
	}
	void search(int modelNumber,String brandName)
	{
		System.out.println("Your Searching with modelNumber "+modelNumber);	
		System.out.println("Your Searching with BrandName "+brandName);	
	}
	void search(String brandName,int modelNumber)
	{
		System.out.println("Your Searching with BrandName "+brandName);	
		System.out.println("Your Searching with modelNumber "+modelNumber);	
	}
	
}
public class OverLoading 
{
	public static void main(String args[])
	{
	    Shopping shop=new Shopping();
     	shop.search(2020);
    	//shop.search("Samsung");
     	//shop.search(2021,"Panasonic");
     	//shop.search(2011,"Realme");
	}
}
