package arraylist;

import java.util.Comparator;

public class SortByNames implements Comparator<Song>{
public int compare(Song song1,Song song2)
{
	return song1.name.compareTo(song2.name);
}
}
