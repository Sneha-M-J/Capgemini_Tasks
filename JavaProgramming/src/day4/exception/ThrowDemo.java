package day4.exception;

public class ThrowDemo 
{
	void checkEligibility(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("You can vote");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		//throw new ArithmeticException("I have thrown an exception");
        
		ThrowDemo t=new ThrowDemo();
		t.checkEligibility(35);
		t.checkEligibility(3);
		t.checkEligibility(33);
	}
}
