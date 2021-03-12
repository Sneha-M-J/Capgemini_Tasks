package day3;

class Parent1
{
	int id;
	Parent1()
	{
		System.out.println("This is parent constructor");
	}
	Parent1(int id)
	{
		System.out.println("id "+id);
	}
}
class Child1 extends Parent1
{
	Child1()
	{
		super(10);
		System.out.println("This is child constructor");
	}
}
public class SuperConstructor {

	public static void main(String[] args) 
	{
		Child1 ch=new Child1();
	}

}
