package day4;

interface  Bank
{
	void rateOfInterest();
	//same as abstract void rateOfInterest();
	int workingDays=27;
}

interface Loan
{
	abstract void creditLimit();
}

class SBI implements Bank,Loan  //Multiple inheritance can be achieved
{
	public void rateOfInterest()
	{
		System.out.println("4% of interest");
		System.out.println("Bank working day : "+workingDays);
	}
	public void creditLimit()
	{
		System.out.println("upto 1 cr for current account");
		System.out.println("upto 30 lc for savings account");
	}
}

public class InterfaceDemo1 
{
	public static void main(String[] args)
	{
		Bank b=new SBI();  //cannot access creditLimit()
		b.rateOfInterest();
		
		SBI s=new SBI();
		s.creditLimit();
		s.rateOfInterest();
	}
}
