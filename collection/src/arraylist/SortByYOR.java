package arraylist;

import java.util.Comparator;

public class SortByYOR implements Comparator<Song>
{
	public int compare(Song song1,Song song2)
	{
		/*if(song1.yor>song2.yor)
			return 1;
		else if(song1.yor<song2.yor)
		    return -1;
		else
			return 0;
			*/
		return song1.yor-song2.yor;//-1 0 1
	}

}
