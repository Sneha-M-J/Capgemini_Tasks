package lab9;

import java.util.Scanner;

@FunctionalInterface
interface Power
{
	abstract double pow(double x,double y);
}

public class Exercise1
{
	public static void main(String[] args)
	{
		Power p=(x,y)->
		{
			double z=Math.pow(x, y);
			return z;
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a and b");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println(p.pow(a, b));
	}

}
