package day8.multithreading;

//Has inbuilt run() and start()
class A extends Thread  //A is thread Type
{
	public void run()
	{
		System.out.println("This is my task using Thread class");
	}
}

//has only inbuilt run() and not start()
class B implements Runnable  //B is Runnable type
{
	public void run()
	{
		System.out.println("This is my task using Runnable Interface");
	}
}
public class CreateDemo1 
{
	public static void main(String[] args) 
	{
		//Extending thread class - can directly call start()
		A obj1=new A();
		obj1.start();
		
		//Implementing Runnable Interface - Create a thread object and then call start()
		B obj2=new B();
		Thread t1=new Thread(obj2);
		t1.start();
	}

}
