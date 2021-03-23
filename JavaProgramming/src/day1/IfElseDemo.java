package day1;
import java.util.*;

public class IfElseDemo 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Withdraw \n 2. Deposit \n 3. Balance \n 4. Exit");
        System.out.println("Enter your choice "); 
        int ch = sc.nextInt();
        int bal = 2000;
        while (ch !=4) 
        {
            if (ch == 1) 
            {
            	System.out.println("you are withdrawing.");
                System.out.println("Enter amount : ");
                int amt=sc.nextInt();
                bal -= amt;
            } 
            else if (ch == 2) 
            {
                System.out.println("you are depositing.");
                System.out.println("Enter amount :");
                int amt=sc.nextInt();
                bal += amt;
            } 
            else if (ch == 3) 
            {
                System.out.println("Total Balance = " + bal);
            }
            System.out.println("Enter the choice:");
            ch = sc.nextInt();
        }
        System.out.println("Thank You");
    }
}
