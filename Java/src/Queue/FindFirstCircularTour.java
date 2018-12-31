/*
 Suppose there is a circle. There are n petrol pumps on that circle. You are given two sets of data.

1. The amount of petrol that petrol pump will give.
2. Distance from that petrol pump to the next petrol pump.

Calculate the first point from where a truck will be able to complete the circle 
(The truck will stop at each petrol pump and it has infinite capacity). 
Expected time complexity is O(n). 
Assume for 1 litre petrol, the truck can go 1 unit of distance.

For example, let there be 4 petrol pumps with amount of petrol and distance to next petrol pump value pairs as 
{4, 6}, {6, 5}, {7, 3} and {4, 5}. The first point from where truck can make a circular tour is 2nd petrol pump.
Output should be “start = 1″ (index of 2nd petrol pump).
 */
package Queue;

/**
 *
 * @author KK Davara
 */
class petrolPump
{
    int amount;
    int distance;
    public petrolPump()
    {
        amount=-1;
        distance=-1;
    }

    petrolPump(int a, int d) {
       amount=a;
       distance=d;
    }
}
public class FindFirstCircularTour {

    /**
     * @param args the command line arguments
     */
    public static int findCircularPoint(petrolPump []p)
    {
        int start=0;
        int N=p.length;
        int currPetrol=0;
        //int totalPetrol=0;
        for(int i=0;i<N;i++) {
            currPetrol+=p[i].amount-p[i].distance;
            //totalPetrol+=p[i].amount-p[i].distance;
             if(currPetrol<0) {
                start=(start+1)%N;
                currPetrol=0;
                if(start==0)
                    return -1;
            }
        }
        //if(totalPetrol<0) {
          //  System.out.println("No solution is possible");
            //return -1;
       // }
        return start;
    }
    public static void main(String[] args) {
       petrolPump []p={new petrolPump(4,6),new petrolPump(6,5),new petrolPump(7,3),new petrolPump(4,5)};
        //petrolPump []p={new petrolPump(2,4),new petrolPump(3,6),new petrolPump(1,3)};
        int start=findCircularPoint(p);
       if(start==-1){
           System.out.println("No Solution Possible");
       }
       else {
           System.out.println("Starting point from where truck will able to complete cycle is "+start);
       }
    }
    
}
