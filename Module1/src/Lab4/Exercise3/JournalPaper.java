package Lab4.Exercise3;

public class JournalPaper extends WrittenItem
{
	private int year;

	public JournalPaper(int uid, String title, int noOfCopy, String author, int year)
	{
		super(uid, title, noOfCopy, author);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "JournalPaper [year=" + year + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JournalPaper other = (JournalPaper) obj;
		if (year != other.year)
			return false;
		return true;
	}

	public void print()
	{
		System.out.println("Journal Paper Data : ");
		super.print();
		System.out.println("Published year : "+year);
	}
	
	public void checkIn() 
	{
		super.checkIn();
	}
	
	public void checkOut() 
	{
		super.checkOut();
	}
	
	public void addItem()
	{
		super.addItem();
	}
	
}
