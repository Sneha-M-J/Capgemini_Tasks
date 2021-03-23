package day4;

@FunctionalInterface
interface Demo
{
	void add(int a, int b);
}

@FunctionalInterface
interface Demo2 extends Demo
{
	void add(int a, int b);
//	void sub(int a,int b); //not a functional Interface because 2 abstract methods add and sub is contained
}

interface Demo3 
{
	int sub(int a,int b);
}

interface Demo4
{
	String large(int a,int b);
}

public class FunctionalInterfaceDemo2 
{
	public static void main(String[] args) 
	{
		Demo d=(a,b)->System.out.println("Addition : "+(a+b));
		d.add(12,4);
		
		Demo3 d3=(a,b)->a-b;
		System.out.println("Result of sub is : "+ d3.sub(4,2));
	
	    Demo4 d4=(a,b)->
	    {
	    	if(a>b)
	    		return "a is greater";
	    	else
	    		return "b is greater";
	    };
	    System.out.println(d4.large(10,20));
	}

}
