package day3;

abstract class calculate
{
	int a=10;
	void display()
	{
		System.out.println("This is normal method");
	}
	abstract int doOperation(int a, int b);
}

class Add extends calculate
{
	int doOperation(int a, int b)
	{
		return a+b;
	}
}

class Sub extends calculate
{
	int doOperation(int a, int b)
	{
		return a-b;
	}
}
public class AbstractionDemo 
{
	public static void main(String[] args) 
	{
		calculate a=new Add();
		a.display();
		System.out.println(a.doOperation(30, 10));
		
		calculate s=new Sub();
		s.display();
		System.out.println(s.doOperation(30, 10));
	}
}
