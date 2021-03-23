package day10.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//period is used to find the difference between 2 dates
public class PeriodDemo
{
	public static void main(String[] args) 
	{
		LocalDate today=LocalDate.now();
		LocalDate start=LocalDate.of(2021, 3,1);
		Period p=Period.between(start, today);
		System.out.println(p.getYears()+" year "+p.getMonths()+" months "+p.getDays()+" days");
		System.out.println();
		
		//task to find no of years, months and days between ur birth date and current dates
		LocalDate today1=LocalDate.now();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Birth date");
		String birth=sc.nextLine();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate birthday=LocalDate.parse(birth);
	
		Period age=Period.between(birthday, today1);
		System.out.println(age.getYears()+" year "+age.getMonths()+" months "+age.getDays()+" days");
		System.out.println();
	   
	}

}
