package day10.date;

import java.time.LocalDate;

public class DateCondition
{
	public static void main(String[] args) 
	{
		LocalDate today=LocalDate.now();
		LocalDate bookingDate=LocalDate.of(2021, 3,20);
		boolean t=bookingDate.isAfter(today);
		if(t)
			System.out.println("Correct booking date");
		else
			System.out.println("Incorrect booking date");
	}

}
