package enums;

class day
{
	public static final day sun=new day();
	public static final day mon=new day();
	public static final day tues=new day();
	//etc etc
}

//above class can be written as enum below
enum days
{
	sun,mon,tues,wed,thurs,fri,sat;
}

public class EnumDemo1 
{
	public static void main(String[] args)
	{
		days d=days.mon;
		System.out.println(d);
		for(days day:days.values())
		{
			System.out.println(day);
		}
	}

}
