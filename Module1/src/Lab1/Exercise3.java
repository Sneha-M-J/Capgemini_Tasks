package Lab1;
import java.util.Scanner;

class Fibonacci
{
	int nonrec(int n)
	{
		int a=1,b=1;
		int c=0;
		if(n==1)
			return a;
		else if(n==2)
			return b;
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	
	int rec(int n)
	{
		if(n<=1)
			return n;
		return rec(n-1)+rec(n-2);
	}
}

public class Exercise3 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Fibonacci f=new Fibonacci();
		System.out.println("Recursive : "+f.nonrec(n));
		System.out.println("Non Recursive : "+f.rec(n));
		sc.close();
	}
}
