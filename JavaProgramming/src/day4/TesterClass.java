package day4;

class SavingsAccount
{
	private int balance;
	private int interest;
	
	public SavingsAccount(int balance, int interest)
	{
		super();
		this.balance = balance;
		this.interest = interest;
	}
	public void withdraw(int amount)
	{
		balance-=amount;
	}
	public void deposit(int amount)
	{
		balance+=amount;
	}
	public int interestCalc()
	{
		balance+=balance*interest/100;
		return balance;
	}
}

public class TesterClass 
{
	public static void main(String[] args) 
	{
		SavingsAccount save=new SavingsAccount(1000,10);
		System.out.println(save.interestCalc());
		save.deposit(3000);
		System.out.println(save.interestCalc());
		save.withdraw(1000);
		System.out.println(save.interestCalc());
	}

}
