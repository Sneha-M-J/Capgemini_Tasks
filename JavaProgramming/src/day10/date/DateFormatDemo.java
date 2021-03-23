package day10.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatDemo 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("yyyy MM dd");
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("yyyy MM dd, E W M");
        
		DateTimeFormatter f1=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter f2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter f3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter f4=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		LocalDate today =LocalDate.now();
		System.out.println("date= "+today);
		
		//date can be formatted using DateTimeFormatter which will return a string
		String date1=today.format(dtf1);
		System.out.println("After format "+date1);
	
		String date2=today.format(dtf2);
		System.out.println("After format "+date2);
	
		String date3=today.format(dtf3);
		System.out.println("After format "+date3);
	
		String date4=today.format(dtf4);
		System.out.println("After format "+date4);
	
		String date5=today.format(f1);
		System.out.println("format full : "+date5);
	
		String date6=today.format(f2);
		System.out.println("format long : "+date6);
		
		String date7=today.format(f3);
		System.out.println("format medium : "+date7);
	
		String date8=today.format(f4);
		System.out.println("format short : "+date8);
	
	
		

	}

}
