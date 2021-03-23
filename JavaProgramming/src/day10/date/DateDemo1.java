package day10.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("today date is : "+LocalDate.now());
		System.out.println("joining date is : "+LocalDate.of(2019,4,7));
		System.out.println("date with time is : "+LocalDateTime.now());
		System.out.println("date with time is : "+LocalDateTime.of(2019,5,6,6,45));
		
		LocalDate today=LocalDate.now();
		System.out.println("Today date is : "+today);
		System.out.println("day of month : "+today.getDayOfMonth());
		System.out.println("day of Year : "+today.getDayOfYear());
		System.out.println("day of Week : "+today.getDayOfWeek());
		System.out.println("Month Value : "+today.getMonthValue());
		System.out.println("Month : "+today.getMonth());
		
	
	
	}

}
