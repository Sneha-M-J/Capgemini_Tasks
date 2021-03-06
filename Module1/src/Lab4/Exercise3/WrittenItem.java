package Lab4.Exercise3;

public abstract class WrittenItem extends Item
{
	private String author;

	public WrittenItem(int uid, String title, int noOfCopy, String author) 
	{
		super(uid, title, noOfCopy);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
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
		WrittenItem other = (WrittenItem) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}

	public void checkIn() //book comes back to library
	{
		super.checkIn();
	}
	
	public void checkOut() //book is taken by student
	{
		super.checkOut();
	}
	
	public void print()
	{
		super.print();
		System.out.println("Author : "+author);
	}
	
	public void addItem()
	{
		super.addItem();
	}
	
//	public void addItem(int id, String title, int no, String author)
//	{
//		super.addItem(id, title, no);
//		setAuthor(author);
//	}
	
}
