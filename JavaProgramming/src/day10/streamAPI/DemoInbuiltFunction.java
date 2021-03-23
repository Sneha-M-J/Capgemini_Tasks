package day10.streamAPI;
import java.util.function.Function;
import java.util.function.Predicate;

interface pre
{
	
}
public class DemoInbuiltFunction 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p1=(age)->age>18;
		boolean b=p1.test(34);  //test is a built in function of predicate
		System.out.println(b);
		
		Function<String,Integer> f1=(name)->name.length();
		int len=f1.apply("Sachin");
		System.out.println(len);
		
		Function<String,String> f2=(name)->name.concat(" mr");
		String s2=f2.apply("Sachin");
		System.out.println(s2);
		
		Predicate<String> p2=(name)->name.startsWith("A");
		boolean b2=p2.test("Anil");  //test is a built in function of predicate
		System.out.println(b2);
		
		Predicate<String> p3=(name)->name.startsWith("A");
		boolean b3=p2.test("Neel");  //test is a built in function of predicate
		System.out.println(b3);
	}

}
