package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Author implements Comparable<Author> {
	  String firstName; 
	  String bookName; 
	  int auAge; 
	  Author(String first, String book, int age){ 
	    this.firstName = first; 
	    this.bookName = book; 
	    this.auAge = age; 
	  } 
	  public String getFirstName() { 
	    return firstName; 
	  }
	  public void setFirstName(String firstName) { 
	    this.firstName = firstName; 
	  }
	  public String getBookName() { 
	    return bookName; 
	  }
	  public void setBookName(String bookName) { 
	    this.bookName = bookName; 
	  }
	  public int getAuAge() { 
	    return auAge; 
	  }
	  public void setAuAge(int auAge) { 
	    this.auAge = auAge; 
	  } 
	  @Override 
	  /* 
	   * When we only use Comparable, this is where we write sorting
	   * logic. This method is called when we implement the Comparable
	   * interface in our class and call Collections.sort()
	   */ 
	  public int compareTo(Author au){         
	    return this.firstName.compareTo(au.firstName);   
	  }
	}

class AuthorAgeComparator implements Comparator<Author>{
	   public int compare(Author a1,Author a2){
	     if(a1.auAge==a2.auAge)
	       return 0;
	   else if(a1.auAge>a2.auAge)
	       return 1;
	   else
	       return -1;
	  }
	}

class BookNameComparator implements Comparator<Author>{ 
	  public int compare(Author a1,Author a2){   
	     return a1.bookName.compareTo(a2.bookName); 
	  }  
	}

public class ComparatorExample {

	public static void main(String[] args) {
		// List of objects of Author class      
	     ArrayList<Author> al=new ArrayList<Author>();        
	     al.add(new Author("Henry", "Tropic of Cancer",  45));
	     al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new Author("Frank", "300", 65));
	     al.add(new Author("Deborah", "Sky Boys", 51));
	     al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
	     /*       
	      * Sorting the list using Collections.sort() method, we       
	      * can use this method because we have implemented the        
	      * Comparable interface in our user defined class Author       
	      */      
	     System.out.println("Sorting by Author First Name:");      
	     Collections.sort(al);        
	     for(Author au: al){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	           au.getAuAge());        
	     } 
	     /*Sorting using AuthorAgeComparator*/      
	     System.out.println("\nSorting by Author Age:");
	     Collections.sort(al, new AuthorAgeComparator());
	     for(Author au: al){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	          au.getAuAge());        
	     }             
	     /*Sorting using BookNameComparator*/      
	     System.out.println("\nSorting by Book Name:");      
	     //Collections.sort(al, new BookNameComparator());
	     Collections.sort(al,new Comparator<Author>(){
	    	 @Override
	    	 public int compare(Author a1,Author a2){   
	    	     return a1.bookName.compareTo(a2.bookName); 
	    	  } 	 
	     });
	     
	     for(Author au: al){       
	        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
	           au.getAuAge());       
	     }  
	     
	     
	    //List.sort() since Java 8
	     System.out.println("\nSorting by Author Age:");
//	     al.sort(new Comparator<Author>() {
//			@Override
//			public int compare(Author a1, Author a2) {
//				return a1.getAuAge() - a2.getAuAge();
//			}
//		});
	     
	   //lambda here! 
	    //al.sort((Author a1,Author a2)->a1.getAuAge()-a2.getAuAge());
	     al.sort((a1,a2)->a1.getAuAge()-a2.getAuAge());
   
	     for(Author au: al){       
		        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
		           au.getAuAge());       
		  }
	     
	     //Lambda expression to sort a List using their salary, reversed order.
	     System.out.println("\nSorting by Author Age in descending order:");
	     
	     Comparator<Author> ageComparator = (a1,a2)->a1.getAuAge()-a2.getAuAge();
	     al.sort(ageComparator.reversed());
	     
	     for(Author au: al){       
		        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
		           au.getAuAge());       
		  }
	}

}
