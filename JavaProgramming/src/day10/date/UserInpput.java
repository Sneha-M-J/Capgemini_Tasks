package day10.date;

import java.time.LocalDate;
import java.util.Scanner;

//to take date input in default format
public class UserInpput 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date");
		//next() takes the string only till it encounters space
		//so nextLine() can be used to read the complete line
		
		String joining=sc.nextLine();
		System.out.println(joining);
		//date should be entered in default format (yyyy-mm-dd)
		
		//convert string to date format
		LocalDate id=LocalDate.parse(joining);
		System.out.println("date = "+id);
		
		System.out.println("Year = "+id.getDayOfYear());
		//can get others similarly
	}

}

/*
output:
1.
Enter the date
2019-3-23   (should be exactly yyyy-mm-dd)
DateTimeParseException

2.
Enter the date
2019/3/23
2019/3/23
DateTimeParseException

3.
Enter the date
2019-03-23
2019-03-23
date = 2019-03-23
Year = 82

*/