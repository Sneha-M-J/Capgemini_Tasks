package Lab4.Exercise3;

public class Demo 
{
	public static void main(String[] args) 
	{
		Item b=new Book(10,"Make A Wish",10,"Tanay Kadam");
		b.print();
		b.checkIn();
		b.print();
		b.checkOut();
		b.print();
		b.addItem();
		b.print();
		System.out.println();
		
		Item j=new JournalPaper(11,"IEEE Paper",5,"Abc",2018);
		j.print();
		
	}

}
