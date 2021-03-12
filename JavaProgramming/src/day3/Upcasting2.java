package day3;

class Account
{
	void minBal()
	{
		System.out.println("Not defined");
	}
}
class Savings extends Account
{
	void minBal()
	{
		System.out.println("25000");
	}
}
class Current extends Account
{
	void minBal()
	{
		System.out.println("10000");
	}
}
public class Upcasting2 
{
	public static void main(String[] args) 
	{
		Account s=new Savings();
		s.minBal();
		Account c=new Current();
		c.minBal();
	}

}
