package day4;

interface Vehicle
{
	abstract int wheels();
}

class Car implements Vehicle
{
    public int wheels()
    {
    	return 4;
    }
}

class Bus implements Vehicle
{
	public int wheels()
    {
    	return 6;
    }
}

class Bike implements Vehicle
{
	public int wheels()
    {
    	return 2;
    }
}

public class InterfaceDemo2 
{
	public static void main(String[] args) 
	{
		Car c=new Car();
		System.out.println(c.wheels());
		Bus b=new Bus();
		System.out.println(b.wheels());
		Bike bi=new Bike();
		System.out.println(bi.wheels());
	}

}
