package day8.multithreading;

class Apple extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
	}
}

class Ball extends Thread
{
	public void run()
	{
		for(int i=10;i<=15;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
	}
}
public class NameDemo 
{
	public static void main(String[] args)
	{
		System.out.println("Name of main method : "+Thread.currentThread().getName());
	    Apple t1=new Apple();
	    Ball t2=new Ball();
//	    t1.start();
//	    t2.start();
	    
	    t1.setName("Apple : ");
	    t2.setName("Ball : ");
	    
	    t1.setPriority(3);
	    t2.setPriority(9);
	    
	    t1.start();
	    t2.start();
	}

}
