package Lab1;

import java.util.Scanner;

class SumN
{
	int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if((i%3==0) || (i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}
}
public class Exercise5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		SumN obj=new SumN();
		int res=obj.calculateSum(n);
		System.out.println("Sum = "+res);
		sc.close();
	}

}
