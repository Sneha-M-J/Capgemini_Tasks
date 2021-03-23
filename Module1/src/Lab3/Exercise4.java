package Lab3;

import java.util.Scanner;

public class Exercise4 
{
	public int modifyNumber(int num1)
	{
		String str=Integer.toString(num1);
		StringBuffer sb=new StringBuffer("");
		int n=str.length();
		for(int i=0;i<n-1;i++)
		{
			char ch1=str.charAt(i);
			int x=(int)ch1;
			char ch2=str.charAt(i+1);
			int y=(int)ch2;
			int diff=Math.abs(x-y);
			sb.append(diff);		
		}
		sb.append(str.charAt(n-1));
		String s=sb.toString();
        int num2=Integer.parseInt(s);
		return num2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		Exercise4 ex=new Exercise4();
		int res=ex.modifyNumber(num);
		System.out.println(res);
	}
}
