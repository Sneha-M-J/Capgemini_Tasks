package deposit;

public class A 
{
	private int a=1;
	int b=2;     //default variable
	protected int c=3;
	public int d=4;
	
	public static void main(String args[])
	{
		A obj=new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
	//all variables can be accessed
}
