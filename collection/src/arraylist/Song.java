package arraylist;

public class Song implements Comparable<Song>
{
	String name;
	double duration;
	int yor;
	
	public Song() {}
	public Song(String name, double duration, int yor) {
		super();
		this.name = name;
		this.duration = duration;
		this.yor = yor;
	}
	@Override
	public String toString() {
		return "Song name=" + name + ", duration=" + duration + ", yor=" + yor ;
	}
	public int compareTo(Song s)
	{
		if(duration>s.duration)
			return 1;
		else if(duration<s.duration)
			return -1;
		else 
			return 0;
		//return this.duration-s.duration;//cannot convert double to int
	}
	

}
