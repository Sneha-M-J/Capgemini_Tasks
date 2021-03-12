package day3;
//super keyword

class Parent
{
	int a=10;
}
class Child extends Parent
{
	int a=20;
	void add()
	{
		int res=a+a;
		int res1=a+super.a;
		int res2=super.a+super.a;
		System.out.println("Result : "+res);
		System.out.println("Result1 : "+res1);
		System.out.println("Result2 : "+res2);
		
	}
}
public class InheritanceDemo2 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.add();
	}
}
