package Lab1;

import java.util.Scanner;

class Power
{
	boolean checkNumber(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(n==Math.pow(2, i))
				return true;
		}
		return false;
	}
}
public class Exercise8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Power p=new Power();
		boolean res=p.checkNumber(n);
		if(res)
			System.out.println("Power of 2");
		else
			System.out.println("Not a Power of 2");
		sc.close();
	}

}
