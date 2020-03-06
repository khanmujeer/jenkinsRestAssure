package arraylist;

import java.util.TreeSet;

public class Album {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song s1= new Song("XYZ",4.2,2018);
		Song s2= new Song("XZ",4.0,2019);
       TreeSet<Song> songlist= new TreeSet<>();
       
       songlist.add(new Song("ABC", 3.8,1998));
       songlist.add(new Song("IJK", 2.8,1995));
       songlist.add(s1);
       songlist.add(s2);
      System.out.println(songlist);
      SortByYOR s= new SortByYOR();
      TreeSet<Song> songlist2= new TreeSet<>(s);
      songlist2.add(s1);
      songlist2.add(s2);
      
      System.out.println(songlist2);
      
      TreeSet<Song> songlist3= new TreeSet<>(new SortByNames());
      songlist3.add(s1);
      songlist3.add(s2);
      System.out.println(songlist3);

	}
}
