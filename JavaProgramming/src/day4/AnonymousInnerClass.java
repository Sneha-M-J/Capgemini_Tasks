package day4;

class Bank2
{
	void rateOfInterest()
	{
		System.out.println("5%");
	}
}

public class AnonymousInnerClass 
{
	public static void main(String[] args) 
	{
		Bank2 sbi=new Bank2()
		{
			void rateOfInterest()
			{
				System.out.println("7%");
			}
		};
		sbi.rateOfInterest();
	}

}
