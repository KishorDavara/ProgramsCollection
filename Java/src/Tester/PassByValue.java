
// Everything in java is pass-by-value
package Tester;

/**
 *
 * @author KK Davara
 */
final class xyz1{   //static and private does not allow for outer class
private class ABC
{
    
}
}

public class PassByValue {

    /**
     * @param args the command line arguments
     */
    public static void change(int a[]){
        if(a.length>1)
            a[0]=255;
        return;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4};
        change(a);
        for(int x:a){
            System.out.print(x+" ");
        }
        //because everything in java is passby Value and arrays are treated as an object in java and for object
        // reference of the object is being passed as a value so changes made in the called method actually get affected in the calling method   
    } 
}
