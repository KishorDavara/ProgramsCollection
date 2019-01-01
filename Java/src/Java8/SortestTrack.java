package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Track {
	String name;
	int length;
	Track(String name,int length){
		this.name = name;
		this.length = length;
	}
	
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

public String toString() {
	return this.name+" "+this.length; 
   }
}
public class SortestTrack {

	public static void main(String[] args) {
		List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
				new Track("Violets for Your Furs", 378),
				new Track("Time Was", 451));
       Track shortestTrack = tracks.stream()
    		   .min(Comparator.comparing(track -> track.getLength()))
    		   .get();
     System.out.println("Shortest Track: "+ shortestTrack.getName());
     System.out.println("Shortest Track Length: "+ shortestTrack.getLength());
	}

}
