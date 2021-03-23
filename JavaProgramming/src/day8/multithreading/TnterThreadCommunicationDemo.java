package day8.multithreading;

class Account
{
	int balance=5000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Withdraw Started");
		if(balance<amount)
		{
			System.out.println("There is no sufficient fund");
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance-=amount;
		System.out.println("Withdraw completed");
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Deposit Started");
		balance+=amount;
		notify();
		System.out.println("Deposit completed");
	}
}

public class TnterThreadCommunicationDemo 
{
	public static void main(String[] args)
	{
		Account acc=new Account();
		Thread w=new Thread()
		{
			public void run()
			{
				acc.withdraw(7000);
			}
		};
		w.setName("Withdraw");
		w.start();
		
		Thread d=new Thread()
		{
			public void run()
			{
				acc.deposit(10000);
			}
		};
		d.setName("Deposit");
		d.start();
	}

}
