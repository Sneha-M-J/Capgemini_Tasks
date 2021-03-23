package day4;

@FunctionalInterface
interface Test1
{
	void display();
}

class MyDemo
{
	void method1()
	{
		System.out.println("This is method1");
	}
}

class MyDemo23
{
	static void method2()
	{
		System.out.println("This is method2 static");
	}
}

public class MethodReferenceDemo 
{
	public static void main(String[] args) 
	{
		Test1 t=()->System.out.println("hello");
		
		MyDemo d=new MyDemo();
		Test1 t2=d::method1;  //through method reference to non static
		
		Test1 t3=MyDemo23::method2;
		
		t.display(); //hello
		t2.display();  
		t3.display();
		
	}

}
