package day4.exception;
import java.util.*;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{	
		int result=0;
		Scanner sc=new Scanner(System.in);
		try
		{
		    System.out.println("Enter 2 numbers");
		    int a=sc.nextInt();
		    int b=sc.nextInt();
			result=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not enter zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers");
		}
		catch(Exception e)  //write at the end of all catch blocks
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("Result = "+result);
			System.out.println("Exit Statement");
		}
	}

}
