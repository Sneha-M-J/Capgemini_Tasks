package Lab4.Exercise3;

public abstract class MediaItem extends Item
{
	private int runtime;

	public MediaItem(int uid, String title, int noOfCopy, int runtime) 
	{
		super(uid, title, noOfCopy);
		this.runtime = runtime;
	}

	public int getRuntime() 
	{
		return runtime;
	}

	public void setRuntime(int runtime) 
	{
		this.runtime = runtime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + runtime;
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
		MediaItem other = (MediaItem) obj;
		if (runtime != other.runtime)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
	}
	
	public void checkIn() 
	{
		super.checkIn();
	}
	
	public void checkOut() 
	{
		super.checkOut();
	}
	
	public void print()
	{
		super.print();
		System.out.println("Runtime : "+runtime);
	}
	
	public void addItem()
	{
		super.addItem();
	}	
}
