package Lab1;
import java.util.Scanner;

public class Exercise4 
{
	void prime(int n)
	{
		int count=0;
		for(int j=1;j<=n;j++)
		{
			if(n%j==0)
				count++;
		}
		if(count==2)
			System.out.print(n+" ");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Exercise4 ex=new Exercise4();
		for(int i=1;i<=num;i++)
		{
			ex.prime(i);
		}
		sc.close();
	}
}
