package day10.date;

import java.time.LocalDate;

public class DateCalculation 
{
	public static void main(String[] args) 
	{
		LocalDate today=LocalDate.now();
		System.out.println("Today is : "+today);
		System.out.println();
		
		System.out.println("=====Plus=====");
		System.out.println("Tomorrow is : "+today.plusDays(1));
		System.out.println("Day after tomorrow is : "+today.plusDays(2));
		System.out.println("Next Week is : "+today.plusWeeks(1));
		System.out.println("Next Year is : "+today.plusYears(1));
		System.out.println();
		
		System.out.println("=====Minus=====");
		System.out.println("Yesterday is : "+today.minusDays(1));
		System.out.println("Day before yesterday is : "+today.minusDays(2));
		System.out.println("Previous Week is : "+today.minusWeeks(1));
		System.out.println("Previous Year is : "+today.minusYears(1));		
		
	}

}
