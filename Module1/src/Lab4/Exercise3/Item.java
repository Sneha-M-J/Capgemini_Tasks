package Lab4.Exercise3;

abstract class Item
{
	private int uid;
	private String title;
	private int noOfCopy;
	public Item(int uid, String title, int noOfCopy) //constructor
	{
		super();
		this.uid = uid;
		this.title = title;
		this.noOfCopy = noOfCopy;
	}
	
	//getters and setters
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopy() {
		return noOfCopy;
	}
	public void setNoOfCopy(int noOfCopy) {
		this.noOfCopy = noOfCopy;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfCopy;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + uid;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (noOfCopy != other.noOfCopy)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Item [uid=" + uid + ", title=" + title + ", noOfCopy=" + noOfCopy + "]";
	}
	
	public void print()
	{
		System.out.println("Unique Identification Number : "+uid);
		System.out.println("Title : "+title);
		System.out.println("No of Copies : "+noOfCopy);
	}
	
	public void checkIn() //book comes back to library
	{
		System.out.println("Item has been checked in");
		noOfCopy+=1;
	}
	
	public void checkOut() //book is taken by student
	{
		if(noOfCopy>=1)
		{
			System.out.println("Item has been checked out");
			noOfCopy-=1;
		}
		else
			System.out.println("Item Out of Stock");
	}
	
	public void addItem()
	{
		System.out.println("Item has been added");
		noOfCopy++;
	}
	
//	public void addItem(int id, String tit, int no)
//	{
//		setUid(id);
//		setTitle(tit);
//		setNoOfCopy(no);
//	}
	
}