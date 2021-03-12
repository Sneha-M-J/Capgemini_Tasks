package day7.collections;

import java.util.ArrayList;
import java.util.Scanner;

//accept 10 integers and store only even integers in the arraylist
//and display the same
public class UserDefinedTask2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> o1=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 integers");
		for(int i=0;i<10;i++)
		{
			int num=sc.nextInt();
			if(num%2==0)
			{
				o1.add(num);
			}
		}
		System.out.println(o1);
		//can also use iterator
	}

}
