package enums;

public class EnumSizeDemo 
{
	enum sizes
	{
		s(10),m(15),l(20),xl(25);
		int size;

		private sizes(int size) 
		{
			this.size = size;
		}

		public int getSize()
		{
			return size;
		}
		
	}
	public static void main(String[] args) 
	{
		sizes s=sizes.s;
		switch(s)
		{
		case s:System.out.println("small size");
		       System.out.println("size : "+s.getSize());
		       break;
		case m:System.out.println("medium size");
	           System.out.println("size : "+s.getSize());
	           break;
		}
	}

}
