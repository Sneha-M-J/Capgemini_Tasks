package Lab4.Exercise3;

public class Book extends WrittenItem
{
	public Book(int uid, String title, int noOfCopy, String author) 
	{
		super(uid, title, noOfCopy, author);
	}
		
	public void print()
	{
		System.out.println("Book Data");
		super.print();
	}

	public void checkIn() //book comes back to library
	{
		super.checkIn();
	}
	
	public void checkOut() //book is taken by student
	{
		super.checkOut();
	}
	
	public void addItem()
	{
		super.addItem();
	}
	
//	public void addItem(int id, String title, int no, String author)
//	{
//		super.addItem(id, title,no,author);
//	}
}
