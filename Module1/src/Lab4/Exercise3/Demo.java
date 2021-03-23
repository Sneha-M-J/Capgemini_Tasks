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
		System.out.println();
		
		Item v=new Video(20,"Birthday Video",3,1,"Sneha","Birthday song",2021);
		v.print();
		System.out.println();
		
		Item c=new CD(50,"Fidaa",100,2,"Sai Paallavi","Romance");
		c.print();
		System.out.println();
		
	}
}


//                   Item
//               /          \
//   WrittenItem             MediaItem
//   /     \                  /    \
// Book  JournalPaper       Video   CD
