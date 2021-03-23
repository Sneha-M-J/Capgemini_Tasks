package day8.multithreading;

class Engagement extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
	}
}

class Marriage extends Thread
{
	public void run()
	{
		for(int i=10;i<=15;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
	}
}

class Family extends Thread
{
	public void  run()
	{
		for(int i=20;i<=25;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
	}
}

public class JoinDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Engagement en=new Engagement();
		Marriage m=new Marriage();
		Family f=new Family();
		
		en.setName("Engage");
		m.setName("Marry");
		f.setName("Family");
		
		en.start();
		en.join(); //engagement executes first completely
		
		//later marriage and family will execute parallely		
		m.start();
		f.start();
	}

}
