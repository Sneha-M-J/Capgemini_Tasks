package Lab4.Exercise3;

public class Video extends MediaItem
{
	private String director;
	private String genre;
	private int yearReleased;
	
	public Video(int uid, String title, int noOfCopy, int runtime, String director, String genre, int yearReleased) 
	{
		super(uid, title, noOfCopy, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + yearReleased;
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
		Video other = (Video) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (yearReleased != other.yearReleased)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + "]";
	}
	
	public void print()
	{
		System.out.println("Video Data : ");
		super.print();
		System.out.println("Director : "+director);
		System.out.println("Genre : "+genre);
		System.out.println("Year Released : "+yearReleased);
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
