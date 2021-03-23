package Lab4.Exercise3;

public class CD extends MediaItem
{
	private String artist;
	private String genre;
	
	public CD(int uid, String title, int noOfCopy, int runtime, String artist, String genre) 
	{
		super(uid, title, noOfCopy, runtime);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
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
		CD other = (CD) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + "]";
	}

	public void print()
	{
		System.out.println("CD Data : ");
		super.print();
		System.out.println("Artist : "+artist);
		System.out.println("Genre : "+genre);
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
