package PracticeTest1;

class Fruit 
{
	String name;
	String taste;
	public void eat()
	{
		System.out.println("Name : "+name);
		System.out.println("Taste : "+taste);
	}
}

class Apple extends Fruit
{
	@Override
	public void eat()
	{
		super.name="Apple";
		super.taste="Good taste";
		System.out.println("Name : "+super.name);
		System.out.println("Taste : "+super.taste);
	}
}

class Orange extends Fruit
{
	@Override
	public void eat() 
	{
		super.name="Orange";
		super.taste="Sour";
		System.out.println("Name : "+super.name);
		System.out.println("Taste : "+super.taste);
	}	
}

public class First 
{
	public static void main(String[] args) 
	{
		Apple a=new Apple();
		a.eat();
		Orange o=new Orange();
		o.eat();
	}
}
