package day8.multithreading;

public class AnonymousClassDemo 
{
	public static void main(String[] args) 
	{
		Thread Sneha=new Thread()
		{
			public void run()
			{
				for(int i=11;i<=20;i++)
				{
					if(i==13)
					{
						try
						{
							sleep(5000);  //sleeps for 5 sec
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
					System.out.println("Sneha "+i);
				}
			}
		};
		
		Runnable rohit=new Runnable()
		{
			public void run()
			{
				for(int i=21;i<=30;i++)
				{
					System.out.println("Rohit "+i);
				}
			}
		};
		
		Sneha.start();
		Thread rohitThread=new Thread(rohit);
		rohitThread.start();
	}

}
