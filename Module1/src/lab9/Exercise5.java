package lab9;

@FunctionalInterface
interface Factorial
{
	abstract int fact(int n);
}

public class Exercise5 
{
	public static void main(String[] args) 
	{
		Factorial f=(n)->
		{
			int res=1;
			for(int i=1;i<=n;i++)
			{
				res*=i;
			}
			return res;
		};
		int x=f.fact(5);
		System.out.println(x);
	}

}
