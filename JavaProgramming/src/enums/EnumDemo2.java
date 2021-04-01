package enums;

public class EnumDemo2 
{
	enum days
	{
		sun(2),mon(4),tues(5),wed(7),thurs(4),fri(2),sat(4);
		int hours;

		private days(int hours)
		{
			this.hours = hours;
		}

		public int getHours() 
		{
			return hours;
		}
	}

	public static void main(String[] args)
	{
		days d=days.mon;
		System.out.println(d);
		for(days day:days.values())
		{
			System.out.println(day);
		}
		switch(d)
		{
		case mon: System.out.println("mon");
		          System.out.println(d.getHours());
		          break;
		case sun: System.out.println("sun");
        		  System.out.println(d.getHours());
                  break;    
        default: System.out.println("invalid");
		}
	}

}
