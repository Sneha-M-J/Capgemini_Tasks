package withdraw;

import deposit.A;
public class D extends A
{
	public static void main(String args[])
	{
		D obj=new D();
		//System.out.println(obj.a);
		//System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		//cannot access private and default members
	}
}
