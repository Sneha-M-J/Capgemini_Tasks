package Lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise9
{
	public void duration(LocalDate d1)
	{
		LocalDate d2=LocalDate.now();
		//d2 is current date
		System.out.println("Difference is : ");
		Period diff=Period.between(d1, d2);
		System.out.printf("%d years, %d months and %d days", diff.getYears(),diff.getMonths(),diff.getDays());
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int y=sc.nextInt();
		System.out.println("Enter month: ");
		int m=sc.nextInt();
		System.out.println("Enter days: ");
		int d=sc.nextInt();
		LocalDate d1=LocalDate.of(y, m, d);
		Exercise9 ex=new Exercise9();
		ex.duration(d1);
	}

}
