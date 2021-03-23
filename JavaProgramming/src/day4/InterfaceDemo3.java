package day4;

interface Vehicle1
{
	int speedLimit=10;
	void wheel();  //abstract method
}

interface Engine1 extends Vehicle1
{
	int speedLimit=30;
	void engine();   //abstract method
}

class TestDrive
{
	void drive()
	{
		System.out.println("you can test drive");
	}
}


class Car1 extends TestDrive implements Engine1
{
	public void wheel()
	{
		System.out.println("4 wheels");
		//if multiple interfaces have same variable name, and if a class implements these multiple interfaces , then 
		//there is a ambiguity problem and compiler will not know which one to refer. To overcome this Interface Reference 
		//should be used   eg: Vehicle1.speedLimit etc
		System.out.println(Vehicle1.speedLimit);
		System.out.println(Engine1.speedLimit);
	}
	public void engine()
	{
		System.out.println("petrol engine");
	}
}


public class InterfaceDemo3 
{
	public static void main(String[] args) 
	{
		Car1 c=new Car1();
		c.wheel();
		c.engine();
		c.drive();
	}
}
