package day3;

//final class Parent2     //cannot be extended
class Parent2
{
	void breakfast()
	{
		System.out.println("Idly");
	}
	void lunch()
	{
		System.out.println("South Indian Meals");
	}
}

class Child2 extends Parent2
{
	void breakfast()
	{
		super.breakfast(); //calls parent class method
		System.out.println("Masala Dosa");
	}
}


public class overRiding 
{
	public static void main(String[] args) 
	{
		Child2 ch=new Child2();
		ch.breakfast();  //child method is called
		ch.lunch();
	}

}
