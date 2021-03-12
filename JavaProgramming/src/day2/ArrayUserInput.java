package day2;
import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) 
	{
		int child=0, adult=0, sen=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students");
		int size=sc.nextInt();
		int stuAge[]=new int[size];
		for(int i=0;i<stuAge.length;i++)
		{
			System.out.println("Enter Age for Student :"+i);
			stuAge[i]=sc.nextInt();
		}
		for(int i=0;i<stuAge.length;i++)
		{
			if(stuAge[i]<18)
			{
				child++;
				System.out.println("Student"+i+" : Age : "+stuAge[i] +" -> Child");
			}
			else if(stuAge[i]<55)
			{
				adult++;
				System.out.println("Student"+i+" : Age : "+stuAge[i] +" -> Adult");
			}
			else
			{
				sen++;
				System.out.println("Student"+i+" : Age : "+stuAge[i] +" -> Senior Citizen");
			}
		}
		System.out.println("No of Children : "+child);
		System.out.println("No of Adults : "+adult);
		System.out.println("No of Senior Citizen : "+sen);
	}

}
