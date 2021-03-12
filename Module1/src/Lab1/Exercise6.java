package Lab1;

import java.util.Scanner;

class DifferenceN
{
	int calculateDifference(int n)
	{
		int sum1=0,sum2=0,sum3=0;
		int diff=0;
		for(int i=1;i<=n;i++)
		{
			sum1+=(i*i);
			sum2+=i;
			sum3=sum2*sum2;
			diff=sum1-sum3;
		}
		return diff;
	}
}
public class Exercise6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		DifferenceN obj=new DifferenceN();
		int res=obj.calculateDifference(n);
		System.out.println("Difference = "+res);
		sc.close();
	}
}
