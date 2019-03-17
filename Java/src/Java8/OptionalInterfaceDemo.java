package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Artist {
	String name;

	Artist(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class OptionalInterfaceDemo {
    public static List<Artist> artists;
    
    
    public Optional<Artist> getArtist(int index) {
      if(index < 0 || index >= artists.size()) {
    	  return Optional.empty(); //if no artist found returns the empty Optional instead of null
      }
      return Optional.of(artists.get(index));
    }
    
    public String getArtistName(int index) {
    	Optional<Artist> artist = getArtist(index);
    	return artist.map(Artist::getName).orElse("Artist not found");   //if get the empty Optional  returns the "Artist not found"
    }
    
	public static void main(String[] args) { 	
	 OptionalInterfaceDemo demo = new OptionalInterfaceDemo();
	 artists = new ArrayList<>();
	 artists.add(new Artist("Kishor"));
	 artists.add(new Artist("Harsh"));
	 artists.add(new Artist("Harshad"));
	 
	 System.out.println(demo.getArtistName(-1));
	 System.out.println(demo.getArtistName(0));
	 System.out.println(demo.getArtistName(1));
	 System.out.println(demo.getArtistName(2));
	 System.out.println(demo.getArtistName(3));
    
	}

}
