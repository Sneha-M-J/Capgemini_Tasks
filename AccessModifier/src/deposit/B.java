package deposit;

public class B 
{
	public static void main(String args[])
	{
		A obj=new A();
		//System.out.println(obj.a);  private member cannot be accessed
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
