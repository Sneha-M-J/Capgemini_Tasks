package day8.multithreading;

class Megha extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Megha "+i);
		}
	}
}

class Pranav extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println("Pranav "+i);
		}
	}
}

class Sneha extends Thread
{
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			System.out.println("Sneha "+i);
		}
	}
}
public class MultitaskingDemo 
{
	public static void main(String[] args) 
	{
		Megha m=new Megha();
		Pranav p=new Pranav();
		Sneha s=new Sneha();
		System.out.println("=====Run=====");
		//run() means they execute sequentially
		m.run();
		p.run();
		s.run();
		
		System.out.println("=====Start=====");	
		//start() means threads do not wait for the other threads to complete their execution
		//order of execution cannot be predicted
		m.start();
		p.start();
		s.start();
	}

}
