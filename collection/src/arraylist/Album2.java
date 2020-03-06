package arraylist;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Album2 {

	public static void main(String[] args) 
	{
		TreeSet<Song> songlist= new TreeSet<>();

		   songlist.add(new Song("ABC", 3.8,1998));
	       songlist.add(new Song("IJK", 2.8,1995));
	       Song s1= new Song("XYZ",4.2,2018);
	       songlist.add(s1);
	       Song s2= new Song("PQR",4.0,2019);
	       songlist.add(s2);
       Scanner ip= new Scanner(System.in);
       System.out.println("Enter the choice:");
       System.out.println("1. Sort by duration");
       System.out.println("2. Sort by Name");
       System.out.println("3. Sort by Year of Release");
       
       int ch= ip.nextInt();
       switch (ch) {
	
    case 1: System.out.println(songlist);
		break;
		
	case 2:
	{
		Collections.sort(songlist, new SortByNames() );
		/*TreeSet<Song> songlist2= new TreeSet<>(new SortByNames());
	      songlist2.add(s1);
	      songlist2.add(s2);
	      System.out.println(songlist);
		*/
	}
	break;
	case 3:
	{
		   SortByYOR s= new SortByYOR();
		   TreeSet<Song> songlist3= new TreeSet<>(s);
	      songlist3.add(s1);
	      songlist3.add(s2);
	      System.out.println(songlist3);
		
	}
	break;

	default:
		break;
	}
       
      
      
      
      

	}

}
