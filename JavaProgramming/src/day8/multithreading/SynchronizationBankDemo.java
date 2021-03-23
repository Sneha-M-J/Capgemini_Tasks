package day8.multithreading;

class Bank
{
	synchronized void doTransaction(int time) // locking the method by one thread at a time
	{
		for(int i=0;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Transaction extends Thread
{
	Bank b=new Bank();
	public void run()
	{
		b.doTransaction(4);
	}
}

public class SynchronizationBankDemo 
{
	public static void main(String[] args) 
	{
		Transaction t=new Transaction();
		Thread deposit=new Thread(t);
		Thread withdraw=new Thread(t);
		
		deposit.setName("deposit");
		withdraw.setName("Withdraw");
		
		deposit.start();
		withdraw.start();
	}

}
