package day10.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//to take date input in any format
public class UserInput2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date");
		String joining=sc.nextLine();
		System.out.println(joining);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate joinDate=LocalDate.parse(joining,dtf);
		System.out.println("My date in date="+joinDate);
		
		System.out.println("after format "+joinDate.format(dtf));
	}

}

/*
1.
Enter the date
2019/3/23
2019/3/23
DateTimeParseException  (because this is default format)

2.
Enter the date
1999/08/11
1999/08/11
My date in date=1999-08-11
after format 1999/08/11

*/