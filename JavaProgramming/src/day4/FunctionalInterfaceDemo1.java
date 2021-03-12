package day4;

@FunctionalInterface
interface Test  //should contain only one abstract method
{
	abstract void display();
}

interface Calculate
{
	int operation(int a,int b);
}


public class FunctionalInterfaceDemo1 
{
	public static void main(String[] args) 
	{
		Test t=()->System.out.println("hello this is dispaly imp1");
		t.display();
		
		Test t2=()->
		{
			System.out.println("this is dispaly imp1");
			System.out.println("this is multi line statement");
		};
		t2.display();
		
		System.out.println("=========================");
		Calculate add=(a,b)-> a+b;
		int res=add.operation(10,20);
		System.out.println("Add : "+res);
		Calculate sub=(a,b)-> a-b;
		int res2=sub.operation(50, 10);
		System.out.println("Sub : "+res2);
		Calculate mul=(a,b)-> a*b;
		int res3=mul.operation(50, 2);
		System.out.println("Mul : "+res3);
	}

}
