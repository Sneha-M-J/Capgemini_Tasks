package Lab1;
import java.util.*;

class Traffic
{
	void select(int choice)
	{
		switch(choice)
		{
			case 1: System.out.println("Stop");
			        break;
			case 2: System.out.println("Ready");
	                break;
			case 3: System.out.println("Go");
	        		break;
	        default:System.out.println("Enter proper choice");
		}
	}
}

public class Exercise2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Red \t2.Yellow \t3.Green");
		int choice=sc.nextInt();
		Traffic t1=new Traffic();
		t1.select(choice);
		sc.close();
	}
}
