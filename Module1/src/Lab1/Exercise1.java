package Lab1;
import java.util.*;

class Cubes
{
	int rem=0, sum=0;
	void sumDigits(int n)
	{
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);			
		}
		System.out.println("Sum of cubes of digits : "+sum);
	}
}

public class Exercise1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		Cubes c=new Cubes();
		c.sumDigits(n);
		sc.close();
	}
}
