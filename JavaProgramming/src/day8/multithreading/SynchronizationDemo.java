package day8.multithreading;

class WaterBottle
{
	//Synchronized method
	synchronized void drink(int time) // locking the method by one thread at a time
	{
		for(int i=0;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	//synchronized block
//	void drink(int time) // locking the method by one thread at a time
//	{
//		synchronized (this)
//		{
//		for(int i=0;i<=time;i++)
//		{
//			System.out.println(Thread.currentThread().getName()+" "+i);
//		}
//		}
//	}
}

class DrinkWater extends Thread
{
	WaterBottle w=new WaterBottle();
	public void run()
	{	
		w.drink(5);
	}
}

public class SynchronizationDemo 
{
	public static void main(String[] args) 
	{
		DrinkWater d=new DrinkWater(); //d is shared by sachin and rahul
		Thread sachin=new Thread(d);
		Thread rahul=new Thread(d);
		
		sachin.setName("Sachin ");
		rahul.setName("Rahul ");
		sachin.start();
		rahul.start();
	}

}
