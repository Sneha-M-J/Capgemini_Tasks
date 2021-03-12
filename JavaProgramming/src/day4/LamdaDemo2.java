package day4;

interface Eligibility
{
	String checkAge(int age);
}
public class LamdaDemo2 
{
	public static void main(String[] args) 
	{
		Eligibility e1= (age)->
		{
			if(age<18)
				return "you cannot vote";
			return "you can vote";
		};
		System.out.println("Result =" +e1.checkAge(20));
	}

}
