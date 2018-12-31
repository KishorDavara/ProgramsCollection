package Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 *  Below example show Cricketer as an object having two properties name and battingPosition.
 *  We want to store all Cricketer object as per batting position defined means when we iterate through collection we get names as 
 *  per batting positions.
 * */
class Cricketer {  
    private String name;  
    private int battingPosition;  
    Cricketer(String cricketerName, int cBattingPosition){  
        this.name = cricketerName;  
        this.battingPosition = cBattingPosition;  
    }  
    public String getName() {  
        return name;  
    }  
    public int getBattingPosition() {  
        return battingPosition;  
    }  
}  

class CompareCricketer implements Comparator<Cricketer> {  
    @Override  
    public int compare(Cricketer arg0, Cricketer arg1) {  
        if(arg0.getBattingPosition() > arg1.getBattingPosition())  
            return 1;  
        else if (arg0.getBattingPosition() < arg1.getBattingPosition())  
            return -1;  
        else return 0;  
    }  
}  

public class TreeSetCompatorDemo {

	public static void main(String[] args) {
		        Set<Cricketer> playerSet = new TreeSet<Cricketer>(new CompareCricketer());  
	             
			    playerSet.add(new Cricketer("Sachin", 1));  
			    playerSet.add(new Cricketer("Zahir", 9));  
			    playerSet.add(new Cricketer("Mahi", 7));  
			    playerSet.add(new Cricketer("Bhajji", 8));  
			    playerSet.add(new Cricketer("Viru", 2));  
			    playerSet.add(new Cricketer("Gautam", 4));  
			    playerSet.add(new Cricketer("Ishant", 10));  
			    playerSet.add(new Cricketer("Umesh", 11));  
			    playerSet.add(new Cricketer("Pathan", 5));  
			    playerSet.add(new Cricketer("Virat", 3));  
			    playerSet.add(new Cricketer("Raina", 6));
			    
			    Iterator<Cricketer> it = playerSet.iterator();  
			    
			    while (it.hasNext()) {  
			    System.out.println(it.next().getName());  
			    }  

	}

}
